package br.com.alcidesthiago.enterprise.equipamento;

public class Caminhao extends Equipamento {

    public Caminhao(
        Long id,
        String nome,
        String modelo,
        String fabricante,
        Double horimetro
    ){
        super(id, nome, modelo, fabricante, horimetro);
    }

    @Override
    public String descricaoOperacional(){
        return "Veiculo utilizado para transporte";
    }
}