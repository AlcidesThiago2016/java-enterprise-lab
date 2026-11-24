package br.com.alcidesthiago.enterprise;

import br.com.alcidesthiago.enterprise.equipamento.Caminhao;
import br.com.alcidesthiago.enterprise.equipamento.Equipamento;
import br.com.alcidesthiago.enterprise.equipamento.Perfuratriz;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Long,Equipamento> equipamentos = new HashMap<>();

        Equipamento sany = new Perfuratriz(
            1L,
            "SANY SR180",
            "SR180",
            "SANY",
            2500.00
        );

        Equipamento cmv = new Perfuratriz(
            2L,
            "CMV TH18",
            "TH18",
            "CMV",
            3200.00
        );
        
        equipamentos.put(1L, sany);
        equipamentos.put(2L, cmv);
        
        StringBuilder relatorio = new StringBuilder();
        
        for (Equipamento equipamento: equipamentos.values()) {
            relatorio.append("Nome: ")
                     .append(equipamento.getNome())
                     .append("\n")
                     .append("Status: ")
                     .append(equipamento.getStatus())
                     .append("\n")
                .append("----------------\n");
        }

        System.out.println(relatorio);
    }
}
