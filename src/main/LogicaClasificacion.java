package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * Ñ.,
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {

        Queue<String> invertido = new LinkedList<>();
        Stack<String> pila = new Stack<>();
        while(!cola.isEmpty()){
            pila.push(cola.remove());
        }
        while(!pila.isEmpty()){
            invertido.add(pila.pop());
        }

        return invertido; // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        Stack<String> pila = new Stack<>();
        LinkedList<String> aux = new LinkedList<>();
        while(!cola.isEmpty()){
            aux.add(cola.remove());
        }
        for(String s : aux){
            pila.push(s);
        }
        for (String s : aux){
            if (!s.equals(pila.pop())){
                return true;
            }
            return true;
        }
        return false;
    }

}
