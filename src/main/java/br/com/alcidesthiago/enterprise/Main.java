package br.com.alcidesthiago.enterprise;

import br.com.alcidesthiago.enterprise.equipamento.Equipamento;
import br.com.alcidesthiago.enterprise.equipamento.Perfuratriz;
import br.com.alcidesthiago.enterprise.equipamento.Caminhao;
import br.com.alcidesthiago.enterprise.equipamento.Motor;

public class Main {

    public static void main(String[] args) {

        Motor motor = new Motor("Cummins", "QSB6.7");

        Perfuratriz perfuratriz = new Perfuratriz(
            2L,
            "Perfuratriz TH18",
            "TH18",
            "CMV",
            1250.0
        );
        perfuratriz.instalarMotor(motor);

        Caminhao caminhao = new Caminhao(
            3L,
            "VW 26220",
            "26220",
            "Volkswagen",
            1000.0
        );

        System.out.println(perfuratriz.descricaoOperacional());
        System.out.println(caminhao.descricaoOperacional());
        System.out.println(perfuratriz.getMotor().getFabricante());
        System.out.println(perfuratriz.getMotor().getModelo());
    }
}
