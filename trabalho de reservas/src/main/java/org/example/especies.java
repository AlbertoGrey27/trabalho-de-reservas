package org.example;

public class especies {
    private String nome;
    private String tipo;
    private boolean ameacada;
    private int id;


    public especies(String nome, String tipo, boolean ameacada , int id) {
        this.nome = nome;
        this.tipo = tipo;
        this.ameacada = ameacada;
    }
    public especies() { }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public boolean getAmeacada() {return ameacada;}

    public void setAmeacada(boolean ameacada) {this.ameacada = ameacada;}

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
}
