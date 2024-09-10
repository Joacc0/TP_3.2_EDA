package tp_3.pkg2_eda;

import java.util.ArrayList;

/**
 *
 * @author Joaco
 */
public class Pila {
    private ArrayList<Integer> pila;

    private int tope = -1;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public int getTope() {
        return tope;
    }
    
    public void push(int num){
            tope ++;
            pila.add(tope, num);
    }
    
    public void pop(){
        if (!pilaVacia()) {
            pila.remove(tope);
            tope --;
        }
    }
    
    public boolean pilaVacia(){
        if (tope == -1) {
            return true;
        }else{
            return false;
        }
    }
    
    public int elementoTope(){
        return pila.get(tope);
    }
    
    public void mostrar(){
        for (int i = 0; i <= tope; i++) {
            System.out.println(pila.get(i));
        }
    }
}
