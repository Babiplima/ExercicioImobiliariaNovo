package com.company.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    //Atributos

    private String endereco;
    private double valorDoAluguel;
    private Funcionarios funcionarios;
    private List<Moradores> moradores = new ArrayList<>();

    //Métodos construtores

    public Imovel() {

    }

    public Imovel(String endereco, double valorDoAluguel, Funcionarios funcionarios, List<Moradores> moradores) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
        this.funcionarios = funcionarios;
        this.moradores = moradores;
    }

    //Métodos Getters e Setters


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Moradores> getMoradores() {
        return moradores;
    }

    //Método adicionar morador

    public void adicionarMorador(Moradores novoMorador){
        moradores.add(novoMorador);
    }

    @Override
    public String toString() {

        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("Endereço: " + endereco);
            retorno.append("Valor do aluguel " + valorDoAluguel);
            retorno.append("Funcionários " + funcionarios);
            retorno.append("Quantidade de moradores "+moradores.size());
            retorno.append("Lista de moradores " +moradores);

            return retorno.toString();
        }

    }
}
