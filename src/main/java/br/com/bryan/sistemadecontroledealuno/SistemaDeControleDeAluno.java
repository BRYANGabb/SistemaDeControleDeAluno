/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.sistemadecontroledealuno;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class SistemaDeControleDeAluno {

    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner (System.in);
    
        String nome[] = new String[10];
        float nota1[] = new float[10];
        float nota2[] = new float[10];
        int menu;
        int cc = 0;
        float media[] = new float[10];
    
        do{
            System.out.println("========MENU=======");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Calcular média");
            System.out.println("4 - Situação");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção: ");
            menu = ler.nextInt();
            System.out.println("===================");
            
            switch (menu){
                case 1:
                    if (cc < nome.length){
                        System.out.print("Digite o nome do aluno: ");
                        nome[cc] = ler.next();
                    
                        System.out.print("Digite a 1º nota de " + nome[cc] + ": ");
                        nota1[cc] = ler.nextFloat();
                    
                        System.out.print("Digite a 2º nota de " + nome[cc] + ": ");
                        nota2[cc] = ler.nextFloat();
                        
                        media[cc] = (nota1[cc] + nota2[cc]) / 2;
                        cc++;
                    } else {
                        System.out.println("Limite de alunos alcançados!");
                    }
                    break;
                    
                case 2:
                    if (cc > 0){
                        System.out.println("Lista");
                        for (int i = 0; i < cc; i++){
                            System.out.println(nome[i]);
                        }
                    } else {
                        System.out.println("Nenhum aluno cadastrado!");
                    }
                    break;
                
                case 3:
                    
                    if (cc > 0){
                        for (int i =0; i < cc; i++){
                            System.out.println(nome[i] + ": " + media[i]);
                        }
                    } else {
                        System.out.println("Nenhuma nota cadastrada");
                    }
                    break;
                
                case 4:
                    if (cc > 0){
                        for (int i =0; i < cc; i++){
                            if (media[i] >= 7){
                                System.out.println(nome[i] + ": Aprovado(a)" );
                            } else if (media[i] >= 4){
                                System.out.println(nome[i] + ": Recuperação");
                            } else{
                                System.out.println(nome[i] + ": Reprovado(a)");
                            }
                        }
                    } else {
                        System.out.println("Nenhuma nota cadastrada");
                    }
                    break;
                    
                case 5:
                    System.out.println("Menu Encerrado!");
                    break;
                    
                default:
                    System.out.println("Opção Inválida!");
                   
            }
            
        }while(menu != 5);
    }
}
