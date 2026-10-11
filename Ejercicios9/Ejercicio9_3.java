package Ejercicios9;

import java.util.Stack;

public class Ejercicio9_3 {
    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) return false;
                
                char cima = pila.pop();
                if ((c == ')' && cima != '(') ||
                    (c == '}' && cima != '{') ||
                    (c == ']' && cima != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "((a+b)*5) - 7";
        String expr2 = "2*[(a+b)/2.5 + x - 7*y";
        
        System.out.println("Expresión 1 equilibrada: " + estaBalanceada(expr1));
        System.out.println("Expresión 2 equilibrada: " + estaBalanceada(expr2));
    }
}