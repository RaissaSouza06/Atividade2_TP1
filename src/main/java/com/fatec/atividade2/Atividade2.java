/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.atividade2;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Atividade2 {

    public static void main(String[] args) {
       // passa o nome do aluno para o construtor 
        String nome = JOptionPane.showInputDialog("Digite o nome do(a) aluno(a):");
        Aluno aluno = new Aluno(nome);

        // le as 3 notas do aluno
        for (int i = 0; i < 3; i++) {
            double nota = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a nota de TP" + (i + 1) + ":")
            );
            aluno.adicionarNota(nota); // usa o método do ArrayList
        }

        // faz o calculo da media das notas
        double media = aluno.calcularMedia();
        String resultado = "Aluno(a): " + aluno.getNome() +
                           "\nMédia: " + String.format("%.2f", media) +
                           "\nSituação: " + aluno.avaliarDesempenho();

        //exibe o resultado da media
        JOptionPane.showMessageDialog(null, resultado);
    }
}
