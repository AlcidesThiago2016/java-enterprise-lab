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

        Equipamento caminhao = new Caminhao(
            3L,
            "VW 26220",
            "26220",
            "Volkswagem",
            5000.00
        );
        
        equipamentos.put(1L, sany);
        equipamentos.put(2L, cmv);
        equipamentos.put(3L, caminhao);

        System.out.println("Quantidade: " + equipamentos.size());
        
        Equipamento encontrado = equipamentos.get(2L);

        System.out.println("Encontrado: " + encontrado.getNome());

        System.out.println("Existe chave 3? " + equipamentos.containsKey(3L));

        System.out.println("Existe equipamento CMV? " + equipamentos.containsValue(cmv));
        
        equipamentos.put(
            2L,
            new Perfuratriz(
                4L,
                "EM800/30",
                "EM800",
                "Fundex",
                1800.0
            )
        );

        System.out.println(equipamentos.get(2L).getNome());
        
        for (Long id : equipamentos.keySet()) {
            System.out.println("ID: " + id);
        }
        
        for (Equipamento equipamento : equipamentos.values()) {
            System.out.println(equipamento.getNome());
        }
        
        for (Map.Entry<Long, Equipamento> entry : equipamentos.entrySet()) {
            System.out.println("ID: " + entry.getKey()
            );

            System.out.println("Equipamento: " + entry.getValue().getNome());
        }
        
        equipamentos.remove(1L);

        System.out.println("Quantidade Final: " + equipamentos.size());
    }
}
