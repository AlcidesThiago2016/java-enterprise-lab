package br.com.alcidesthiago.enterprise;

import br.com.alcidesthiago.enterprise.equipamento.Caminhao;
import br.com.alcidesthiago.enterprise.equipamento.Equipamento;
import br.com.alcidesthiago.enterprise.equipamento.Perfuratriz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Equipamento> equipamentos = new ArrayList<>();
        
        equipamentos.add(
            new Perfuratriz(
                1L,
                "SANY SR180",
                "SR180",
                "SANY",
                2500.0
            )
        );
        
        equipamentos.add(
            new Caminhao(
                2L,
                "VW 26220",
                "26220",
                "Volkswagem",
                5000.0
            )
        );

        equipamentos.add(
            new Perfuratriz(
                3L,
                "EM800/30",
                "EM800",
                "CZM",
                1800.0
            )
        );

        System.out.println("Quantidade inicial: " + equipamentos.size());
        Equipamento primeiro = equipamentos.get(0);

        System.out.println("Primeiro: " + primeiro.getNome());

        System.out.println("---------------------------");
        
        for (Equipamento equipamento : equipamentos) {
            System.out.println(equipamento.getNome());
            System.out.println(equipamento.getStatus());
            System.out.println(equipamento.getHorimetro());
            System.out.println(
                "Descrição: " + equipamento.descricaoOperacional()
            );

            System.out.println("---------------------------");
        }
        
        equipamentos.set(
            1,
            new  Perfuratriz(
                4L,
                "CMV TH18",
                "TH18",
                "CMV",
                3200.0
            )
        );

        System.out.println("UPDATE");

        for (Equipamento equipamento : equipamentos) {
            System.out.println(equipamento.getNome());
            System.out.println(equipamento.getStatus());
            System.out.println(equipamento.getHorimetro());
            System.out.println(
                "Descrição: " + equipamento.descricaoOperacional()
            );

            System.out.println("---------------------------");
        }
        
        equipamentos.removeFirst();
    }
}
