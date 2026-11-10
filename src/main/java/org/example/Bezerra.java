package org.example;

public class Bezerra implements Vaca {

    private int numero;
    private String nome;
    private int idadeMeses;

    public Bezerra(int numero, String nome, int idadeMeses) {
        this.numero = numero;
        this.nome = nome;
        this.idadeMeses = idadeMeses;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdadeMeses() {
        return idadeMeses;
    }

    @Override
    public String aceitar(Visitante visitante) {
        return visitante.exibirBezerra(this);
    }
}
