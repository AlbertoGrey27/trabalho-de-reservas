package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Leitor lei = new Leitor();
        Escritor es = new Escritor();

        es.escreverCSV("src\\teste1 - Página1.csv");


        lei.lerCSV("src\\teste1 - Página1.csv");








    }
}