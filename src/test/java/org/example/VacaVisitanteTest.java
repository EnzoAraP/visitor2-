package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacaVisitanteTest {

    @Test
    void deveExibirVacaLeiteira() {
        VacaLeiteira vaca = new VacaLeiteira(1, "Mimosa", 25.0f);

        VacaVisitante visitante = new VacaVisitante();
        assertEquals("VacaLeiteira{numero=1, nome='Mimosa', producaoLeite=25.0}", visitante.exibir(vaca));
    }

    @Test
    void deveExibirVacaCorte() {
        VacaCorte vaca = new VacaCorte(2, "Estrela", 450.0f);

        VacaVisitante visitante = new VacaVisitante();
        assertEquals("VacaCorte{numero=2, nome='Estrela', peso=450.0}", visitante.exibir(vaca));
    }

    @Test
    void deveExibirBezerra() {
        Bezerra bezerra = new Bezerra(3, "Flor", 6);

        VacaVisitante visitante = new VacaVisitante();
        assertEquals("Bezerra{numero=3, nome='Flor', idadeMeses=6}", visitante.exibir(bezerra));
    }
}
