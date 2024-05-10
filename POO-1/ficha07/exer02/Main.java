package ficha07.exer02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = null;
        int entrada = 0;
        do {
            try {
                input = new Scanner(System.in);
                System.out.print("1. Adicionar novo aluno\n2. Atualizar dados do aluno\n3. Vizualizar alunos\n0. Sair\nEntrada: ");
                entrada = input.nextInt();
                System.out.flush();

                switch (entrada) {
                    case 1: {
                        // Adicionar novo aluno
                        System.out.print("Digite o nome do aluno: ");
                        input.nextLine();
                        String nome = input.nextLine();
                        System.out.print("Digite a idade do aluno: ");
                        int idade = input.nextInt();
                        System.out.print("Digite o da serie do aluno: ");
                        int serie = input.nextInt();
                        ManegmentStudent.adicionarAluno(nome, idade, serie);
                    }
                        break;
                    case 2: {
                        // Atualizar dados do aluno
                        try {
                            System.out.print("O que deseja atualizar?\n1. Nome\n2. Serie\n3. Nome e idade\n4. Tudo\nEntrada: ");
                            entrada = input.nextInt();

                            ManegmentStudent.mostrarTodosAlunos();
                            System.out.print("Digite o id do aluno: ");
                            int index = ManegmentStudent.buscarAluno(input.nextInt());
                            
                            if (index == (-1)) {
                                System.out.println("Id invalido");
                                break;
                            }

                            switch (entrada) {
                                case 1: {
                                    // Atualizar somente o nome
                                    input.nextLine();
                                    System.out.print("Digite o novo nome: ");
                                    String novoNome = input.nextLine();
                                    try {
                                        ManegmentStudent.atualizarInfoAluno(index, novoNome);
                                        ManegmentStudent.mostrarInfoAluno(index);
                                        System.out.println("Sucesso");
                                        break;
                                    } catch (Exception e) {
                                        System.err.println("Falha na atualizacao: " + e.getMessage());
                                    }
                                }
                                    break;
                                case 2: {
                                    // Atualizar somente  a serie
                                    try {
                                        System.out.print("Digite a nova serie: ");
                                        int novaSerie = input.nextInt();
                                        ManegmentStudent.atualizarInfoAluno(index, novaSerie);
                                        ManegmentStudent.mostrarInfoAluno(index); // para o usuario confirmar a atualizacao
                                        System.out.println("Sucesso");
                                        break;
                                    } catch (Exception e) {
                                        System.err.println("Falha na atualicao: " + e.getMessage());
                                    }
                                }
                                case 3: {
                                    // Atualizar o nome e a idade
                                    try {
                                        input.nextLine();
                                        System.out.print("Digite o novo nome: ");
                                        String novoNome = input.nextLine();
                                        System.out.print("Digite a nova idade: ");
                                        int novaIdade = input.nextInt();
                                        ManegmentStudent.atualizarInfoAluno(index, novoNome, novaIdade);
                                        ManegmentStudent.mostrarInfoAluno(index); // para o usuario confirmar a atualizacao
                                        System.out.println("Sucesso");
                                        break;
                                    } catch (Exception e) {
                                        System.err.println("Falha na atualizacao: " + e.getMessage());
                                        break;
                                    }
                                }
                                case 4: { 
                                    try {
                                        // atualizar tudo
                                        input.nextLine();
                                        System.out.print("Digite o novo nome: ");
                                        String novoNome = input.nextLine();
                                        System.out.print("Digite a nova idade: ");
                                        int novaIdade = input.nextInt();
                                        System.out.print("Digite a nova serie: ");
                                        int novaSerie = input.nextInt();
                                        ManegmentStudent.atualizarInfoAluno(index, novoNome, novaIdade, novaSerie);
                                        ManegmentStudent.mostrarInfoAluno(index); // para o usuario confirmar a atualizacao
                                        System.out.println("Sucesso");
                                        break;
                                    } catch (Exception e) {
                                        System.err.println("Falha na atualizacao: " + e.getMessage());
                                        break;
                                    }
                                }
                            }
                        } catch (InputMismatchException e) {

                            System.err.println(e.getMessage());

                        } catch (IndexOutOfBoundsException e) {
                            System.err.println(e.getMessage());
                        }   
                    }
                        break;
                    case 3:
                        ManegmentStudent.mostrarTodosAlunos();
                        input.nextLine();
                        break;

                    default:
                        break;
                }
            
            } catch (InputMismatchException e) {
                
                System.err.println("Deves entrar com um numero interio!");

            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                if (entrada == 0 && input != null) {
                    input.close();
                }
            }
        } while (entrada != 0);
    }
    
}