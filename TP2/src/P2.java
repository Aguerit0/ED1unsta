import java.util.Stack;

//2) Considerando el problema anterior "1", ¿Cuándo se producirá un desbordamiento? Y ¿Cuándo se eliminará C antes que D?

//R-1: el desbordamiento de la pila (stack overflow) ocurrirá si se intenta agregar más elementos de los que la pila puede
// contener, lo que depende de la implementación y la memoria disponible en el sistema

//R-2: C se podrìa eliinar suponiendo que es agregado a la pila antes que D, o sino con el metodo de java 'remove(object o)'

public class P2 {
    public static void main(String[] args) {
        //declarate stack: pila
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("C");
        pila.push("D");
        pila.push("F");
        pila.push("K");
        pila.push(" ");
        pila.push(" ");
        pila.push(" ");

        //show pila
        System.out.println("PILA: "+pila);

        //metod remove object
        pila.remove(1);
        System.out.println("PILA REMOVE 'C': "+pila);

    }
}
