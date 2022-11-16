package view;
import java.util.List;
import java.util.Scanner;

import bean.LivroBean;
import bo.LivroBO;

public class LivroView {
	public void mostrarMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1 - Adicione um livro a sua biblioteca");
		System.out.println("2 - Veja as informações dos livros");
		System.out.println("3 - Atualizar situação de um livro");
		System.out.println("4 - Sair da biblioteca");		
		System.out.println("----------------------------------------------");
		System.out.println("Digite uma opção: ");
	}
	
	public void mostrarAdicionarLivro(Scanner sc,List<LivroBean> livrosList ,Integer id) {
		System.out.println("Digite o nome do livro: ");		
		sc.nextLine();
		String nome = sc.nextLine();
				
		LivroBO livroBo = new LivroBO();
		LivroBean livro = new LivroBean();
		
		livroBo.definirLivro(livro, nome, id);

		livrosList.add(livro);
		
		System.out.println("Livro adicionado com sucesso!");	
	}
	
	public void mostrarListaDeLivros(List<LivroBean> livrosList) {
		if(livrosList.size() != 0) {
			System.out.println("----------------------------------------------");
			System.out.println("ID" + "   " + "NOME" + "   " + "SITUAÇÃO");
		for(LivroBean livro : livrosList) {
			System.out.println(livro.getId() + " - " + livro.getNome() + " - " + (livro.getAlugado() ? "alugado" : "não alugado"));
		}
			System.out.println("----------------------------------------------");
		}else {
			mostrarMensagemSemLivro();
		}
	}
	
	public void mostrarAtualizarSituacaoDoLivro(List<LivroBean> livroList, Scanner sc) {
		System.out.println("----------------------------------------------");
		System.out.println("1 - Definir um livro para alugado");
		System.out.println("2 - Definir um livro para não alugado");
		System.out.println("----------------------------------------------");
		Integer res = sc.nextInt();
			
		if(livroList.size() != 0) {
			mostrarListaDeLivros(livroList);
			if(res.equals(1)) {
				System.out.println("Digite o id do livro que você deseja atualizar para alugado: ");
				Integer numero = sc.nextInt();
				livroList.get(numero - 1).setAlugado(true);
			}else if(res.equals(2)) {
				System.out.println("Digite o id do livro que você deseja atualizar para não alugado: ");
				Integer numero = sc.nextInt();
				livroList.get(numero - 1).setAlugado(false);
			}else {
				mostrarMensagemDeErro();		
			}	
			System.out.println("Livro atualizado com sucesso!");}
		else {
		 	mostrarMensagemSemLivro();
		}		
	}
	
	public void mostrarMensagemDeErro() {
		System.out.println("Você digitou uma opção não existe");
	}
	
	public void mostrarMensagemSemLivro() {
		System.out.println("Adicione um livro para poder ver ou alterar suas informações");
	}
	
	public void mostrarMensagemDeSaida() {
		System.out.println("Você saiu da sua biblioteca!");
	}
}
