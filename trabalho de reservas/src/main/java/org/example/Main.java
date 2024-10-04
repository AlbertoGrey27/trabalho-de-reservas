package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int resp;
        int contId = 0;
        int contEspecies = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Area> areas = new ArrayList<>();

        do{
            System.out.print("1.Cadastrar espécies\n2.Monitorar áreas\n3.Registrar um avistamento\n4.Listar áreas e espécies\n5.Sair\n\nDigite o número correspondente a sua escolha:");
            resp = sc.nextInt();

            if (resp == 1){
                if (areas.isEmpty()){
                    System.out.println("Não existem areas");
                    System.out.print("Digite um nome para a area: ");
                    String nome = sc.next();
                    System.out.print("\nDigite a localização da area(em numeros): ");
                    int localizacao = sc.nextInt();
                    System.out.print("\nDigite o tamanho da area(em hectares): ");
                    int tamanho = sc.nextInt();
                    areas.add(new Area(nome, localizacao, tamanho,contId));
                    contId++;
                }
                else if (areas.size()>= 1){
                    System.out.print("Voce quer adicionar um area(1) ou uma espécie(2): ");
                    int resp2 = sc.nextInt();
                    if (resp2 == 1){
                        System.out.print("Digite um nome para a area: ");
                        String nome = sc.next();
                        System.out.print("\nDigite a localização da area(em numeros): ");
                        int localizacao = sc.nextInt();
                        System.out.print("\nDigite o tamanho da area(em hectares): ");
                        int tamanho = sc.nextInt();
                        areas.add(new Area(nome, localizacao, tamanho,contId));
                        contId++;
                    } else if (resp2 == 2) {
                        System.out.println("digite o id da area em que esta espécie vai ficar");
                        for (int i = 0; i <= areas.size()-1; i++){
                            areas.get(i).listadeAreas();
                        }
                        int areaId = sc.nextInt();
                        System.out.print("Digite um nome para a espécie: ");
                        String nomeMain = sc.next();
                        System.out.print("\nDigite o tipo(planta ou animal): ");
                        String tipo = sc.next();
                        System.out.print("\nDigite se ela esta ameaçada(sim(1) não(2)): ");
                        int resp3 = sc.nextInt();
                        boolean ameacada = false;
                        if (resp3 == 1){
                            ameacada = true;
                        }
                        areas.get(areaId).cadastrarEspecie(nomeMain, tipo, ameacada);
                    }
                    else {
                        System.out.println("não é um numero valido");
                    }
                }

            }
            else if(resp == 2){

            }
            else if (resp == 3){
                //registra avistamento.
            }
            else if (resp == 4){
                for (int i = 0; i < areas.size(); i++){
                    areas.get(i).listadeAreas();
                    areas.get(i).escreverCSV("tabelaReserva - Página1.csv");
                    areas.get(i).lerCSV("tabelaReserva - Página1.csv");
                }

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