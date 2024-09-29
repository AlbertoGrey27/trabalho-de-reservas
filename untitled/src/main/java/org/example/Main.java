package org.example;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Leitor lei = new Leitor();
        Área ar = new Área();
        Espécie es = new Espécie();
        int resp = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("1.Cadastrar espécies\n2.Monitorar áreas\n3.Registrar um avistamento\n4.Listar áreas e espécies\n5.Sair\n\nDigite o número correspondente a sua escolha:");
            resp = sc.nextInt();
            if (resp == 1){
                es.escreverCSV("C:\\Users\\Usuario\\Desktop\\intelij\\untitled\\src\\teste1 - Página1.csv");
            }
            else if(resp == 2){
                ar.escreverCSV2("C:\\Users\\Usuario\\Desktop\\intelij\\untitled\\src\\teste1 - Página2.csv");
            }
            else if (resp == 3){
                //registra avistamento.
            }
            else if (resp == 4){
                lei.lerCSV("C:\\Users\\Usuario\\Desktop\\intelij\\untitled\\src\\teste1 - Página2.csv");
            }
            else if (resp == 5){
                break;
            }
            else{
                System.out.println("Digite um input válido!");
            }
        }while (resp != 5);
    }
}
