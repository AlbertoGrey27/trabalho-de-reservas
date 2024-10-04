package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int resp;
        Scanner sc = new Scanner(System.in);
        especies beijaFlor = new especies("Beija-flor", "Animal", true);
        Area area = new Area("area1",1,10);

        area.cadastrarEspecie(beijaFlor);




        /*do{
            System.out.print("1.Cadastrar espécies\n2.Monitorar áreas\n3.Registrar um avistamento\n4.Listar áreas e espécies\n5.Sair\n\nDigite o número correspondente a sua escolha:");
            resp = sc.nextInt();
            if (resp == 1){

            }
            else if(resp == 2){

            }
            else if (resp == 3){
                //registra avistamento.
            }
            else if (resp == 4){
                area.escreverCSV("tabelaReserva - Página1.csv");
        area.lerCSV("tabelaReserva - Página1.csv");
            }
            else if (resp == 5){
                break;
            }
            else{
                System.out.println("Digite um input válido!");
            }
        }while (resp != 5);*/
    }
}