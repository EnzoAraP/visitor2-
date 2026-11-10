package org.example;

public class VacaVisitante implements Visitante {

    public String exibir(Vaca vaca) {
        return vaca.aceitar(this);
    }

    @Override
    public String exibirVacaLeiteira(VacaLeiteira vaca) {
        return "VacaLeiteira{" +
                "numero=" + vaca.getNumero() +
                ", nome='" + vaca.getNome() + '\'' +
                ", producaoLeite=" + vaca.getProducaoLeite() +
                '}';
    }

    @Override
    public String exibirVacaCorte(VacaCorte vaca) {
        return "VacaCorte{" +
                "numero=" + vaca.getNumero() +
                ", nome='" + vaca.getNome() + '\'' +
                ", peso=" + vaca.getPeso() +
                '}';
    }

    @Override
    public String exibirBezerra(Bezerra bezerra) {
        return "Bezerra{" +
                "numero=" + bezerra.getNumero() +
                ", nome='" + bezerra.getNome() + '\'' +
                ", idadeMeses=" + bezerra.getIdadeMeses() +
                '}';
    }
}
