package org.example;


import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Area {
    //tabelaReserva - Página1.csv

    ArrayList<especies> especies = new ArrayList<>();

    private String nome;
    private int localizacao;
    private int area;
    private String endereco;
    private int id;

    public Area(String nome, int localizacao, int area , int id) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.area = area;
        this.id = id;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void cadastrarEspecie(String nome, String tipo, boolean ameacada, int id) {
        especies.add(new especies(nome, tipo, ameacada, id));


    }


    public void mostrarInfoArea() {
        System.out.printf("Area -> nome: %s localizacao: %d area: %d id: %d\n", nome, localizacao, area, id);
    }

    public void printEspecies() {
        for (int i = 0; i < especies.size(); i++) {
            System.out.println(nome);
            System.out.println(especies.get(i).getNome());
            System.out.println(especies.get(i).getTipo());
            if (especies.get(i).getAmeacada()==true){
                System.out.println("Sim");
            }else {
                System.out.println("Não");
            }
        }
    }
    public void escreverCSV(String endereco) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(endereco) );
            writer.write("Nome,Tipo,Ameaçada,Id\n");

            for (int i = 0; i < especies.size(); i++) {
                writer.write(especies.get(i).getNome()+",");
                writer.write(especies.get(i).getTipo()+",");
                if (especies.get(i).getAmeacada()==true){
                    writer.write("Sim,");
                }
                else {
                    writer.write("Não,");
                }
                writer.write(especies.get(i).getId()+",");
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void lerCSV(String endereco){

        String file = endereco;
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String i : row){
                    System.out.printf("%-15s", i);
                }
                System.out.println();
            }
            System.out.println();
            reader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
