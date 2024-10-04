package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int resp;
        int areasId = 0;
        int especiesId = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Area> areas = new ArrayList<>();

        do{
            System.out.print("1.Cadastrar espécies\n2.Registrar um avistamento\n3.Listar áreas e espécies\n4.Sair\n\nDigite o número correspondente a sua escolha:");
            resp = sc.nextInt();

            if (resp == 1){
                if (areas.size() >= 200){
                    System.out.println("não existe mais espaço para registrar áreas");
                }
                else if (areas.isEmpty()){
                    System.out.println("Não existem áreas");
                    System.out.print("Digite um nome para a área: ");
                    String nome = sc.next();
                    System.out.print("\nDigite a localização da área(em numeros): ");
                    int localizacao = sc.nextInt();
                    System.out.print("\nDigite o tamanho da área(em hectares): ");
                    int tamanho = sc.nextInt();
                    areas.add(new Area(nome, localizacao, tamanho,areasId));
                    areasId++;
                }
                else if (areas.size()>= 1){
                    System.out.print("Voce quer adicionar um área(1) ou uma espécie(2): ");
                    int resp2 = sc.nextInt();
                    if (resp2 == 1){
                        System.out.print("Digite um nome para a área: ");
                        String nome = sc.next();
                        System.out.print("\nDigite a localização da área(em numeros): ");
                        int localizacao = sc.nextInt();
                        System.out.print("\nDigite o tamanho da área(em hectares): ");
                        int tamanho = sc.nextInt();
                        areas.add(new Area(nome, localizacao, tamanho,areasId));
                        areasId++;
                    } else if (resp2 == 2) {
                        System.out.println("digite o id da área em que esta espécie vai ficar");
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
                        boolean ameacada = resp3 == 1;
                        areas.get(areaId).cadastrarEspecie(nomeMain, tipo, ameacada,(areaId+especiesId) );
                        especiesId++;
                    }
                    else {
                        System.out.println("não é um numero valido");
                    }
                }

            }
            else if (resp == 2){
                System.out.print("Digite o id da espécie que voce viu: ");
                for (int i = 0 ; i < areas.size()-1; i++){
                    areas.get(i).lerCSV("tabelaReserva - Página1.csv");
                }
                int resp2 = sc.nextInt();
                System.out.println("Digite o horario em que a escolha: ");
                String hora = sc.next();
                System.out.println("Digete o id da área em que a espécie foi avistada: ");
                for (int i = 0; i <= areas.size()-1; i++){
                    areas.get(i).listadeAreas();
                }
                int resp3 = sc.nextInt();
                System.out.println("Obrigado pela cooperação, nosso time ira botar a especie na sua área correta");

            }
            else if (resp == 3){
                for (int i = 0; i < areas.size(); i++){
                    areas.get(i).listadeAreas();
                    areas.get(i).escreverCSV("tabelaReserva - Página1.csv");
                    areas.get(i).lerCSV("tabelaReserva - Página1.csv");
                }

            }
            else if (resp == 4){
                break;
            }
            else{
                System.out.println("Digite um input válido!");
            }
        }while (resp != 4);
    }
}