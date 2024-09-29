package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritor {
    int num1;
    String[][] dados = new String[200][3] ;
    int i;
    Scanner sc = new Scanner(System.in);
    int num_Especies = 0;

    public void escreverCSV(String endereço) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(endereço));
            writer.write("Nome,Tipo,Ameaçada");
            do {
                System.out.print("Voce quer adicionar uma especie(1 para sim, 2 para não): ");
                num1 = sc.nextInt();

                if (num1 == 1){
                    num_Especies++;
                    System.out.print("Nome da especie: ");
                    String input = sc.next();
                    writer.write("\n"+input+",");
                    dados[i][0] = input;

                    System.out.print("Tipo da especie: ");
                    input = sc.next();
                    writer.write(input+",");
                    dados[i][1] = input;

                    System.out.print("Esta ameaçada: ");
                    input = sc.next();
                    writer.write(input+",");
                    dados[i][2] = input;
                    i++;
                }else if (num1 == 2){
                    writer.close();
                }
            }while (num1 != 2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printarMatriz(){
        for(int i = 0 ; i < num_Especies ; i++ ){
            for(int j = 0 ; j < 3 ; j++ ){
                System.out.print(dados[i][j]+" ");
            }
            System.out.println();
        }
    }
}