package main;

import java.util.LinkedList;
import java.util.Queue;



public class App {
    public static void main(String[] args) throws Exception {
 

        LogicaClasificacion logica = new LogicaClasificacion();
        Queue<String> cola1 = new LinkedList<>();
        cola1.add("Ana");
        cola1.add("Luis");
        cola1.add("Pedro");
        System.out.println("Invertimos la cola: " + logica.invertirColaNombres(cola1));

        Queue<String> cola2 = new LinkedList<>();
        cola2.add("r");
        cola2.add("a");
        cola2.add("d");
        cola2.add("a");
        cola2.add("r");
        System.out.println("si es o no palindromo = " + logica.verificarPalindromoCola(cola2));



    }
}
