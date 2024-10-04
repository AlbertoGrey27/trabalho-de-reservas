package org.example;

public class especies {
    private String nome;
    private String tipo;
    private boolean ameacada;


    public especies(String nome, String tipo, boolean ameacada) {
        this.nome = nome;
        this.tipo = tipo;
        this.ameacada = ameacada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getAmeacada() {
        return ameacada;
    }

    public void setAmeacada(boolean ameacada) {
        this.ameacada = ameacada;
    }
}
