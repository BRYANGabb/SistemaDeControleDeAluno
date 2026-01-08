/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bryan.sistemadecontroledealuno;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class RemoverAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
    
        String nome[] = new String[10];
        float nota1[] = new float[10];
        float nota2[] = new float[10];
        int opcao = 0;
    
        do{
            System.out.println("========MENU=======");
            System.out.println("1 - Cadrastrar aluno");
            System.out.println("2 - Listrar alunos");
            System.out.println("3 - Calcular média");
            System.out.println("4 - Situação");
            System.out.println("5 - Sair");
            opcao = ler.nextInt();
            
        }while(opcao != 5);
    }
}
