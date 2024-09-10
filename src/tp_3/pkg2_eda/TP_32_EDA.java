package tp_3.pkg2_eda;

/**
 *
 * @author Joaco
 */
public class TP_32_EDA {

    public static void main(String[] args) {
       
        PilaOrdenada pila = new PilaOrdenada();
        UnirPilas pila1 = new UnirPilas();
        
        pila.insertarYordenar(1);
        pila.insertarYordenar(4);
        pila.insertarYordenar(3);
        pila.insertarYordenar(2);
        pila.insertarYordenar(5);
        
        System.out.println("Ejercicio A: ");
        pila.mostrar();
        
        System.out.println("-----------------------------------------------------------------------");
        
        System.out.println("Ejercicio D: ");
        pila1.cargarPilas();
        pila1.insertarElementosPilaFinal();
        pila1.mostrar();
        
        
        
    }
    
}
