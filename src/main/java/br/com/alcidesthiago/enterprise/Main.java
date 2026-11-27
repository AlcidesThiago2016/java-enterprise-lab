package br.com.alcidesthiago.enterprise;

import br.com.alcidesthiago.enterprise.equipamento.Equipamento;
import br.com.alcidesthiago.enterprise.equipamento.Perfuratriz;
import br.com.alcidesthiago.enterprise.equipamento.StatusEquipamento;
import br.com.alcidesthiago.enterprise.repository.Repository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Repository<Equipamento> repository = new Repository<>();
        
        Equipamento equipamento = new Equipamento(1L,"EM800/30", "EM800", "CZM", 750.0);
        Equipamento sany = new Perfuratriz(2L, "SANY SR180", "SR180", "SANY", 2500.0);
        
        equipamento.registrarManutencao();
        equipamento.atualizarHorimetro(1250.0);
        
        double horasTrabalhadas = equipamento.getHorimetro() - equipamento.getHorimetroUltimaManutencao();

        System.out.println(equipamento.getNome() + " - " + horasTrabalhadas + " h");

        repository.save(equipamento);
        repository.save(sany);
        
        repository.findById(1L)
            .ifPresent(e -> System.out.println("Encontrado: " + e.getNome()));
        
        repository.listAll()
            .forEach(e -> System.out.println(
                e.getNome() + " - " + e.getHorimetro()
            ));

        System.out.println("Equipamentos acima de 2000 horas:");
        
        repository.findByHours(2000.0)
            .forEach(e -> System.out.println(
                                            e.getNome() + " - "
                                            + e.getHorimetro() + " h"
            ));
        
        repository.findByStatus(StatusEquipamento.ATIVO)
            .forEach(e -> System.out.println(e.getNome()));

        System.out.println("Ordenacao crescente:");
        
        repository.listByHour()
            .forEach(e -> System.out.println(e.getNome() + " - " + e.getHorimetro()));
        
        long ativos = repository.contByStatus(
            StatusEquipamento.ATIVO
        );

        System.out.println("Equipamentos Ativos: " + ativos);

        System.out.println("Total: " + repository.contByStatus(StatusEquipamento.ATIVO));
        System.out.println("Removido: " + repository.remove(1L));
        System.out.println("Total: " + repository.contByStatus(StatusEquipamento.ATIVO));
        System.out.println("Removido: " + repository.remove(999L));
    }
}

