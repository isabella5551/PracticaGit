import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String invertir(String cadena){
        StringBuilder texto = new StringBuilder(cadena);
        texto.reverse();
        return texto.toString();
}
public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una cadena: ");
        String cadena = teclado.nextLine();
        System.out.println("La cadena invertida es: "+invertir(cadena));
}
    }

