package com.company.Exercicio9;

public class Funcionarios extends Pessoa{

    //Atributos

    private String CTPS;

    //Métodos construtores

    public Funcionarios(){

    }
    public Funcionarios(String CTPS) {
        this.CTPS = CTPS;
    }

    public Funcionarios(String nome, String cpf, String CTPS) {
        super(nome, cpf);
        this.CTPS = CTPS;
    }

    //Métodos Getters e Setters


    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("Carteira de trabalho " +CTPS);
        return retorno.toString();
    }
}
