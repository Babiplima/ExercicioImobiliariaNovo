package com.company.Exercicio9;

public class Moradores extends Pessoa {
    // Atributos
    private String telefone;
    private double renda;

    //Métodos Construtores

    public Moradores() {

    }

    public Moradores(String telefone, double renda) {
        this.telefone = telefone;
        this.renda = renda;
    }

    public Moradores(String nome, String cpf, String telefone, double renda) {
        super(nome, cpf);
        this.telefone = telefone;
        this.renda = renda;
    }

    //Métodos Getters e Setters

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("Telefone " + telefone);
        retorno.append("Renda R$ " + renda);
        return retorno.toString();
    }
}
