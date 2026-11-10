package org.example;

public class VacaLeiteira implements Vaca {

    private int numero;
    private String nome;
    private float producaoLeite;

    public VacaLeiteira(int numero, String nome, float producaoLeite) {
        this.numero = numero;
        this.nome = nome;
        this.producaoLeite = producaoLeite;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public float getProducaoLeite() {
        return producaoLeite;
    }

    @Override
    public String aceitar(Visitante visitante) {
        return visitante.exibirVacaLeiteira(this);
    }
}
