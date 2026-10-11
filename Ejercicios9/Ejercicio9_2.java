package Ejercicios9;

import java.util.Stack;

public class Ejercicio9_2 {
   
    public static boolean esSimetrica(String secuencia) {
        Stack<Character> pila = new Stack<>();
        int i = 0;
        
        while (i < secuencia.length() && secuencia.charAt(i) != '&') {
            pila.push(secuencia.charAt(i));
            i++;
        }
        
        if (i >= secuencia.length() || secuencia.charAt(i) != '&') {
            return false;
        }
        
        i++;
        
        while (i < secuencia.length()) {
            if (pila.isEmpty()) {
                return false;
            }
            char actual = secuencia.charAt(i);
            char cimaPila = pila.pop();
            
            if (actual != cimaPila) {
                return false;
            }
            i++;
        }
        
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String test = "ABC&CBA";
        System.out.println("¿Es simétrica '" + test + "'? " + esSimetrica(test));
    }
}