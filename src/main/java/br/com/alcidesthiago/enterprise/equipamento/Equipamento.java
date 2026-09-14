package br.com.alcidesthiago.enterprise.equipamento;

public class Equipamento {

    private Long id;
    private String nome;
    private String modelo;
    private String fabricante;
    private StatusEquipamento status;
    private Double horimetro;


    public Equipamento(Long id, String nome, String modelo, String fabricante, Double horimetro) {

        if (horimetro <= 0) {
            throw new IllegalArgumentException("Horímetro não pode ser negativo");
        }

        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.status = StatusEquipamento.ATIVO;
        this.horimetro = horimetro;
    }

    public void ativar() {
        this.status = StatusEquipamento.ATIVO;
    }

    public void inativar() {
        this.status = StatusEquipamento.INATIVO;
    }

    public void enviarParaManutencao() {
        this.status = StatusEquipamento.EM_MANUTENCAO;
    }

    public void atualizarHorimetro(Double novoHorimetro) {
        if (novoHorimetro <= this.horimetro) {
            throw new IllegalArgumentException("O novo horímetro não pode ser menor que o horímetro atual");
        }
        this.horimetro = novoHorimetro;
    }

    public String getNome() {
        return nome;
    }

    public double getHorimetro() {
        return horimetro;
    }

    public StatusEquipamento getStatus() {
        return status;
    }
}
