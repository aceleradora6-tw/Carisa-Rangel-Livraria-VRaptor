
package app.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class JPALivroDAO implements LivroDAO {

	private final EntityManager manager;

	public JPALivroDAO(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public void adiciona(Livro livro) {
		//this.manager.getTransaction().begin();
		if(livro.getId() == null){
			this.manager.persist(livro);
		}else{
			this.manager.merge(livro);
		}
		//this.manager.getTransaction().commit();
	}

	@Override
	public List<Livro> todos() {
		return this.manager.createQuery("select l from Livro l", Livro.class)
				.getResultList();
	}

	@Override
	public Livro buscaPorIsbn(String isbn) {
		try {
			return this.manager
					.createQuery("select l from Livro l where l.isbn = :isbn",
							Livro.class).setParameter("isbn", isbn)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
