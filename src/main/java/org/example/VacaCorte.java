package org.example;

public class VacaCorte implements Vaca {

    private int numero;
    private String nome;
    private float peso;

    public VacaCorte(int numero, String nome, float peso) {
        this.numero = numero;
        this.nome = nome;
        this.peso = peso;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public String aceitar(Visitante visitante) {
        return visitante.exibirVacaCorte(this);
    }
}
