package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Área {
    String input;
    int localização,tamanho_area;
    int num1;
    String[][] dados = new String[20][3] ;
    int i;
    Scanner sc = new Scanner(System.in);
    int num_áreas = 0;

    public void escreverCSV2(String endereço) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(endereço));
            writer.write("Nome,Local,Tamanho");
            do {
                System.out.print("Voce quer adicionar uma área(1 para sim, 2 para não)?: ");
                num1 = sc.nextInt();

                if (num1 == 1){
                    num_áreas++;
                    System.out.print("Nome: ");
                    input = sc.next();
                    writer.write("\n"+input+",");
                    dados[i][0] = input;

                    System.out.print("Local(1-5): ");
                    input = Integer.toString(sc.nextInt());
                    writer.write(input+",");
                    dados[i][1] = input;

                    System.out.print("Tamanho (em hec): ");
                    input = Integer.toString(sc.nextInt());
                    writer.write(input+" hectares,");
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
        for(int i = 0 ; i < num_áreas ; i++ ){
            for(int j = 0 ; j < 3 ; j++ ){
                System.out.print(dados[i][j]+" ");
            }
            System.out.println();
        }
    }
}


