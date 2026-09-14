package br.com.alcidesthiago.enterprise;

import br.com.alcidesthiago.enterprise.equipamento.Equipamento;

public class Main {

    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento(
            1L,
            "CMV TH18",
            "TH18",
            "CMV",
            1250.0
        );
        System.out.println("Equipamento: " + equipamento.getNome());
        System.out.println("Status: " + equipamento.getStatus());
        System.out.println("Horimetro: " + equipamento.getHorimetro());
        equipamento.enviarParaManutencao();
        System.out.println("Novo Status: " + equipamento.getStatus());

        equipamento.atualizarHorimetro(1200.0);
        System.out.println("Novo Horimetro: " + equipamento.getHorimetro());
    }
}
