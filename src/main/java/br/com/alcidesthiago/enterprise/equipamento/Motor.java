package br.com.alcidesthiago.enterprise.equipamento;

public class Motor {

    private String fabricante;
    private String modelo;

    public Motor(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getModelo(){
        return modelo;
    }
}
