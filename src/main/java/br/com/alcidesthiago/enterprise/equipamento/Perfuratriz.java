package br.com.alcidesthiago.enterprise.equipamento;

public class Perfuratriz extends Equipamento {

    public Perfuratriz(
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
        return "Equipamento utilizado para perfuração";
    }
}
