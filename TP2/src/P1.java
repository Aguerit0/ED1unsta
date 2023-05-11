import java.util.Scanner;
import java.util.Stack;

/*Considere la siguiente pila de caracteres, donde PILA tiene N=8 celdas de memoria:
        PILA : A, C, D, F, K, _ , _ , _
        (por conveniencia de notación, usamos “_” para denotar una celda de memoria vacía)
        Describir el comportamiento de la PILA a medida que se realizan las siguientes operaciones:
        a. Sacar(PILA,Item)
        b. Sacar(PILA, Item)
        c. Meter (PILA , L)
        d. Meter (PILA , P)
        e. Sacar(PILA, Item)*/
public class P1 {
    public static void main(String[] args)
    {
        //declarate stack: pila
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("D");
        pila.push("F");
        pila.push("K");
        pila.push(" ");
        pila.push(" ");
        pila.push(" ");

        //show pila
        System.out.println("PILA: "+pila);

        //pila.pop and show
        System.out.println("Pop pila element ("+pila.pop()+"): "+pila);

        //pila.pop and show again
        System.out.println("Pop pila ("+pila.pop()+"): "+pila);

        //pila.push element: insert element 'L' and show
        System.out.println("Push pila element 'L': "+pila.push("L")+pila);

        //pila.push element: insert element 'P' and show
        System.out.println("Push pila element 'P': "+pila.push("P")+pila);

        //pila.pop and show
        System.out.println("Pop pila element ("+pila.pop()+"): "+pila);
    }
}