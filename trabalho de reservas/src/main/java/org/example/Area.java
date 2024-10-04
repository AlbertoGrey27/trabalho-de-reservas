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

    public Area(String nome, int localizacao, int area) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.area = area;
    }

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

    public void cadastrarEspecie(especies especie) {
        especies.add(especie);

    }

    public void printEspecies() {
        for (int i = 0; i < especies.size(); i++) {
            System.out.println(nome);
            System.out.println(especies.get(i).getNome());
            System.out.println(especies.get(i).getTipo());
            if (especies.get(i).getAmeacada()==true){
                System.out.println("Ameaçada");
            }
        }
    }
    public void escreverCSV(String endereco) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(endereco) );
            writer.write("Nome,Tipo,Ameaçada");

            for (int i = 0; i < especies.size(); i++) {
                writer.write("\n"+especies.get(i).getNome()+",");
                writer.write(especies.get(i).getTipo()+",");
                if (especies.get(i).getAmeacada()==true){
                    writer.write("Sim,");
                }
                else {
                    writer.write("Não,");
                }
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
                    //System.out.print(i+" ");
                }
                System.out.println();
            }
            reader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
