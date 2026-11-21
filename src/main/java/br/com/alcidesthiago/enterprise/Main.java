package br.com.alcidesthiago.enterprise;

import br.com.alcidesthiago.enterprise.equipamento.Caminhao;
import br.com.alcidesthiago.enterprise.equipamento.Equipamento;
import br.com.alcidesthiago.enterprise.equipamento.Perfuratriz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Equipamento equipamentoA = new Perfuratriz(
            100L,
            "SANY SR180",
            "SR180",
            "SANY",
            2500.0
        );
        
        Equipamento equipamentoB = new Perfuratriz(
            100L,
            "SANY SR180",
            "SR180",
            "SANY",
            2500.0
        );


        Set<Equipamento> equipamentoSet = new HashSet<>();
        
        equipamentoSet.add(equipamentoA);
        equipamentoSet.add(equipamentoB);

        System.out.println("Quantidade no set: " + equipamentoSet.size());

        System.out.println("== : " + (equipamentoA == equipamentoB));

        System.out.println("Equals: " + equipamentoA.equals(equipamentoB));

        System.out.println("Contains A: " + equipamentoSet.contains(equipamentoA));

        System.out.println("Contains B: " + equipamentoSet.contains(equipamentoB));
        
        equipamentoSet.remove(equipamentoB);

        System.out.println("Quantidade apos remove: " + equipamentoSet.size());
    }
}
