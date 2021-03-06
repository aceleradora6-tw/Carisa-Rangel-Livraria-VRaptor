package app.models;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class EstanteNoBancoDeDados implements Estante {
	
	private final LivroDAO dao;
	
	public EstanteNoBancoDeDados(LivroDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void guarda(Livro livro) {
		this.dao.adiciona(livro);
	}

	@Override
	public List<Livro> todosOsLivros() {
		return this.dao.todos();
	}

	@Override
	public Livro buscaPorIsbn(String isbn) {
		return this.dao.buscaPorIsbn(isbn);
	}

}
