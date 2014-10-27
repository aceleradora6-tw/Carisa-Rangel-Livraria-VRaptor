package app.models;

import java.util.List;

public interface Estante {

	void guarda(Livro livro);
	
	List<Livro> todosOsLivros();

	Livro buscaPorIsbn(String isbn);
}
