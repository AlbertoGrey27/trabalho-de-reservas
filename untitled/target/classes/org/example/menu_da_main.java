package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Leitor lei = new Leitor();
        Escritor es = new Escritor();
        String resp = "";
        Scanner sc = new Scanner(System.in);
        while (resp != sair){
            System.out.print("1.Cadastrar espécies\n2.Monitorar áreas\n3.Registrar um avistamento\n4.Listar áreas e espécies\n5.Sair\n\nDigite o número correspondente a sua escolha:");
            resp = sc.nextInt();
            if (resp == 1){
                // cadastra espécie com nome, tipo(planta ou animal) e status(ameaçada ou n);
            }
            else if(resp == 2){
                // registra as áreas com nome, loc e tamanho em hectares
            }
            else if (resp == 3){
                //registra os avistamentos com data e nome da espécie em um área existente
            }
            else if (resp == 5){
                break;
            }
            else{
                System.out.println("Digite um input válido!");
            }
        }
    }

}
