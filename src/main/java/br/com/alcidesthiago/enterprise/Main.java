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
        
        Optional<Equipamento> resultado = buscarPorId(equipamentos, 1L);

        System.out.println(resultado);
        
        Optional<Equipamento> inexistente = buscarPorId(equipamentos, 999L);

        System.out.println(inexistente);
        
        String nome = buscarPorId(equipamentos, 99L)
            .map(Equipamento::getNome)
            .orElse("NAO encontrado!");

        System.out.println(nome);
        
    }

    public static Optional<Equipamento> buscarPorId(
        Map<Long, Equipamento> equipamentos,
        Long id) {

        return Optional.ofNullable(
            equipamentos.get(id)
        );
    }    
}

