package controller;
import java.util.Scanner;

import bean.LivroBean;
import view.LivroView;

import java.util.ArrayList;
import java.util.List;

public class LivroController {
	public static void main(String[] args) {
		List<LivroBean> livrosList = new ArrayList<LivroBean>();
		LivroView livroView = new LivroView();
		Scanner sc = new Scanner(System.in);
		Integer id = 0;
			
		for(; ;) {
			livroView.mostrarMenu();
			Integer res = sc.nextInt();
			if (res.equals(1)) {
				livroView.mostrarAdicionarLivro(sc, livrosList, ++id);
			}else if (res.equals(2)) {		
				livroView.mostrarListaDeLivros(livrosList);			
			}else if (res.equals(3)) {
				livroView.mostrarAtualizarSituacaoDoLivro(livrosList, sc);
			}else if (res.equals(4)) {
				livroView.mostrarMensagemDeSaida();
				break;
			}
			else {
				livroView.mostrarMensagemDeErro();
				break;
			}
		}
		
	}
}
