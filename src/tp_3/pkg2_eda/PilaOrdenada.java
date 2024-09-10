package tp_3.pkg2_eda;

/**
 *
 * @author Joaco
 */
public class PilaOrdenada {
    
    private Pila pila ;
    private Pila pilaAux = new Pila();
    
    
    public PilaOrdenada() {
        this.pila = new Pila();
    }
  
    public void insertarYordenar(int n){
        while (!pila.pilaVacia() && pila.elementoTope()> n) {
            pilaAux.push(pila.elementoTope());
            pila.pop();
        }
        pila.push(n);
        while (!pilaAux.pilaVacia()) {
            pila.push(pilaAux.elementoTope());
            pilaAux.pop();
        }
    }
    
    public void mostrar(){
        if (!pila.pilaVacia()){
            System.out.println("Lista elementos");
            pila.mostrar();
        }        
    }
    
}

