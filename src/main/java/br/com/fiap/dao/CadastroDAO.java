package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Cadastro;
import br.com.fiap.util.EntityManagerFacade;

public class CadastroDAO {

	
	private EntityManager manager = new EntityManagerFacade().getEntityManager();

	public void save(Cadastro cadastro) {
		manager.getTransaction().begin();
		manager.persist(cadastro);
		manager.getTransaction().commit();
		manager.clear();
	}
	
	public List<Cadastro> getAll(){
		String jpql = "SELECT s FROM Cadastro s";
		TypedQuery<Cadastro> createQuery = manager.createQuery(jpql, Cadastro.class);
		return createQuery.getResultList();
	}
}
