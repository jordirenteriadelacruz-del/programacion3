package Ejercicios9;

import java.util.Stack;

public class Ejercicio9_6 {
    public static boolean esPalindromo(String frase) {
        String limpia = frase.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < limpia.length(); i++) {
            pila.push(limpia.charAt(i));
        }
        
        int i = 0;
        while (!pila.isEmpty()) {
            char desdePila = pila.pop();
            char desdeFrase = limpia.charAt(i);
            
            if (desdePila != desdeFrase) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        String frase = "anita lava la tina";
        System.out.println("¿Es palíndromo?: " + esPalindromo(frase));
    }
}