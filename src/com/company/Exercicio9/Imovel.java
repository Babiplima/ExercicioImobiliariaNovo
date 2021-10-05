package com.company.Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    //Atributos

    private String endereco;
    private double valorDoAluguel;
    private Funcionarios funcionarioResponsavel;
    private List<Moradores> moradores = new ArrayList<>();

    //Métodos construtores

    public Imovel() {

    }

    public Imovel(String endereco, double valorDoAluguel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
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

      public List<Moradores> getMoradores() {

        return moradores;
    }
      public void setMoradores(List<Morador> moradores){
        this.moradores = moradores;
      }

    //Método adicionar morador

    public void adicionarMorador(Moradores novoMorador){
        moradores.add(novoMorador);
    }
    //Método adicionar funcionário

    public void adicionarFuncionario (Funcionario novoFuncionario){
        funcionarioResponsavel = novoFuncionario;
    }
    //Método Valor do aluguel

    public void defAluguel(double aluguel){
        valorDoAluguel=aluguel;
    }
    //Método escolher endereço
    public void escolheEndereco(String enderecoEscolhido){
        endereco = enderecoEscolhido;
    }
    //Método mostrar moradores

    public void mostrarMoradores(){
        for(Morador referencia: moradores){
            System.out.println(referencia.getNome());
        }
    }


    @Override
    public String toString() {

        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("Endereço: " + endereco);
            retorno.append("Funcionários responsável " + funcionarioResponsavel.getNome());
            retorno.append("Valor do aluguel " + valorDoAluguel);
            retorno.append("Quantidade de moradores "+ getMoradores().toString());
            retorno.append("\n");

            return retorno.toString();
        }

    }
}
