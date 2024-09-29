package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {

    public void escreverCSV(String endereço) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(endereço));
            writer.write("Nome,Especie,Ameaçada");
            System.out.print("Nome da especie: ");
            writer.write("\n"+sc.nextLine()+",");
            System.out.print("Tipo da especie: ");
            writer.write(sc.nextLine()+",");
            System.out.print("Esta ameaçada: ");
            writer.write(sc.nextLine()+",");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
