package br.com.alcidesthiago.enterprise.equipamento;

public class Equipamento {

    private Long id;
    private String nome;
    private String modelo;
    private String fabricante;
    private StatusEquipamento status;
    private Double horimetro;
    private Motor motor;


    public Equipamento(Long id, String nome, String modelo, String fabricante, Double horimetro) {
        this(id, nome, modelo, fabricante, horimetro, null);
    }

    public Equipamento(Long id, String nome, String modelo, String fabricante, Double horimetro, Motor motor) {

        if (horimetro <= 0) {
            throw new IllegalArgumentException("Horímetro não pode ser negativo");
        }

        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.status = StatusEquipamento.ATIVO;
        this.horimetro = horimetro;
        this.motor = motor;
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

    public void instalarMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public String descricaoOperacional(){
        return "Equipamento de operação";
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
