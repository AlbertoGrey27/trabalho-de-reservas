package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
    //src\\teste1 - Página1.csv


    public void lerCSV(String endereço){

        String file = endereço;
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String i : row){
                    System.out.printf("%-10s", i);
                    //System.out.print(i+" ");
                }
                System.out.println();
            }
            reader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

}
