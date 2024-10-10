package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String resp;
        int areasId = 0;
        int especiesId = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Area> areas = new ArrayList<>();


        do{
            System.out.print("1.Cadastrar espécies\n2.Cadastrar área\n3.Registrar um avistamento\n4.Listar áreas e espécies\n5.Sair\n\nDigite o número correspondente a sua escolha:"); // menu
            resp = sc.nextLine();

            if (Objects.equals(resp, "1")){
                LimparConsole.clear();
                if (areas.size() >= 20){
                    System.out.println("Não existe mais espaço para registrar áreas"); // max áreas
                }
                else if (areas.isEmpty()){ // 0 áreas
                    System.out.println("Não existem áreas");
                    System.out.print("Digite um nome para a área: ");
                    String nome = sc.next();
                    System.out.print("\nDigite a localização da área(em números): ");
                    int localizacao = sc.nextInt();
                    System.out.print("\nDigite o tamanho da área(em hectares): ");
                    int tamanho = sc.nextInt();
                    areas.add(new Area(nome, localizacao, tamanho,areasId));
                    areasId++;
                    LimparConsole.clear();
                }
                else {
                    System.out.println("Digite o id da área em que esta espécie vai ficar:"); // aqui começa a catalogação de espécies
                    for (int i = 0; i <= areas.size() - 1; i++) {
                        areas.get(i).mostrarInfoArea();
                    }
                    int areaId = sc.nextInt();
                    System.out.print("Digite um nome para a espécie: ");
                    String nomeMain = sc.next();
                    System.out.print("\nDigite o tipo da espécie(planta ou animal): ");
                    String tipo = sc.next();
                    System.out.print("\nDigite se ela está ameaçada (sim(1) não(2)): ");
                    int resp3 = sc.nextInt();
                    boolean ameacada = resp3 == 1;
                    areas.get(areaId).cadastrarEspecie(nomeMain, tipo, ameacada, (areaId + especiesId));
                    especiesId++;
                    // LimparConsole.clear();
                }
            }
            else if (Objects.equals(resp, "2")){
                System.out.print("Digite um nome para a área: "); //mais de 0 áreas registradas.
                String nome = sc.next();
                System.out.print("\nDigite a localização da área(em números): ");
                int localizacao = sc.nextInt();
                System.out.print("\nDigite o tamanho da área(em hectares): ");
                int tamanho = sc.nextInt();
                areas.add(new Area(nome, localizacao, tamanho,areasId));
                areasId++;
                LimparConsole.clear();
            }
            else if (Objects.equals(resp, "3")){
                LimparConsole.clear();
                System.out.println("Digite o id da espécie que foi avistada: ");
                for (int i = 0 ; i < areas.size(); i++){
                    areas.get(i).escreverCSV("tabelaReserva - Página1.csv");
                    areas.get(i).lerCSV("tabelaReserva - Página1.csv");
                }
                int resp2 = sc.nextInt();
                System.out.println("Digite o horário em que a espécie foi avistada(HH:MM): ");
                String hora = sc.next();
                System.out.println("Digite o id da área em que a espécie foi avistada: ");
                for (int i = 0; i < areas.size(); i++){
                    areas.get(i).mostrarInfoArea();
                }
                int resp3 = sc.nextInt();
                boolean resp4 = false;
                for(int w = 0; w < areas.get(resp3).getEspecies().size(); w++){
                    if (areas.get(resp3).getEspecies().get(w).getId() == resp2) {
                        resp4 = true;
                    }
                }
                if (resp4 == true){
                    System.out.println("Essa espécie tá na sua área correta.");
                }
                else{
                    System.out.println("Essa espécie não está na sua área correta. Muito obrigado pela cooperação!");
                }
            }
            else if (Objects.equals(resp, "4")){
                LimparConsole.clear();
                for (int i = 0; i < areas.size(); i++){
                    areas.get(i).mostrarInfoArea();
                    areas.get(i).escreverCSV("tabelaReserva - Página1.csv");
                    areas.get(i).lerCSV("tabelaReserva - Página1.csv");
                }


            }
            else if (Objects.equals(resp, "5")){
                break;
            }
            else{
                System.out.println("Digite um input válido!");
            }
        }while (!Objects.equals(resp, "5"));
    }
}
