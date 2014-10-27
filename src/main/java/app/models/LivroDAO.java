package app.models;

import java.util.List;

public interface LivroDAO {
	void adiciona(Livro livro);
	List<Livro> todos();
	Livro buscaPorIsbn(String isbn);
}
