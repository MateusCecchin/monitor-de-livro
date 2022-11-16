package bo;

import bean.LivroBean;

public class LivroBO{
	public void definirLivro(LivroBean livro, String nome, Integer id) {	
		livro.setNome(nome);
		livro.setAlugado(false);
		livro.setId(id);
	}
}
