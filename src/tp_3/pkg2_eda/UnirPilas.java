package tp_3.pkg2_eda;

/**
 *
 * @author Joaco
 */
public class UnirPilas {
    
    private Pila pila1;
    private Pila pila2;
    private Pila pilaFinal;

    public UnirPilas() {
        this.pila1 = new Pila();
        this.pila2 = new Pila();
        this.pilaFinal = new Pila();
    }
    
    public void cargarPilas(){
        pila1.push(1);
        pila1.push(5);
        pila1.push(6);
        pila1.push(10);
        pila1.push(15);
        pila1.push(7);
        pila1.push(17);
        
        pila2.push(3);
        pila2.push(4);
        pila2.push(14);
        pila2.push(17);
        pila2.push(13);
    }
    
    public void insertarElementosPilaFinal(){
        while (!pila1.pilaVacia() && !pila2.pilaVacia()) {
            if (pila1.elementoTope() >= pila2.elementoTope()) {
                insertarElementoOrdenado(pila1.elementoTope(),pilaFinal,pila2);
                pila1.pop();
            }else{
                insertarElementoOrdenado(pila2.elementoTope(),pilaFinal,pila1);
                pila2.pop();
            }
        }
        while(!pila1.pilaVacia()){
              insertarElementoOrdenado(pila1.elementoTope(),pilaFinal,pila2);
              pila1.pop();
        }
        while(!pila2.pilaVacia()){
              insertarElementoOrdenado(pila2.elementoTope(),pilaFinal,pila1);
              pila2.pop();
        }    
    }
    
    public void insertarElementoOrdenado(int n,Pila pila,Pila pilaAux){
        int tope = pilaAux.getTope();
        while (!pila.pilaVacia() && pila.elementoTope() < n) {
            pilaAux.push(pila.elementoTope());
            pila.pop();
        }
        pila.push(n);
        while (pilaAux.getTope() != tope) {
            pila.push(pilaAux.elementoTope());
            pilaAux.pop();
        }
    }
    
    public void mostrar(){
        if (!pilaFinal.pilaVacia()){
            System.out.println("Lista elementos");
            pilaFinal.mostrar();
        }   
    }
    
    
    
    
}
