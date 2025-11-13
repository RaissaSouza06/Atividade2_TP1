/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.atividade2;
import java.util.ArrayList;

/**
 *
 * @author fatec-dsm2
 */
public class Aluno {
     //Atributos privados
    private String nome;
    private ArrayList<Double> notas;  // usando um ArrayList

     // construtor recebe o nome do aluno
    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();  // inicia a lista vazia
    }
    
    // Criação dos métodos getters e setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

      public void adicionarNota(double nota) {
        notas.add(nota);
    }

    // calculo da media das 3 notas do aluno
    public double calcularMedia() {
        double soma = 0;

        if (notas.size() == 0) {
            return 0;
        }

        for (double n : notas) {
            soma += n;
        }

        return soma / notas.size();
    }

    // retorna a aprovação do aluno
    public String avaliarDesempenho() {
        double media = calcularMedia();
        if (media < 6) return "Reprovado";
        else if (media <= 9) return "Aprovado";
        else return "Ótimo Aproveitamento";
    }
}
