package es.salesianos.repository;

import java.util.List;

public interface Repository<E> {
	
	public List listAll();

	public Object findBy(Integer id);

	public void insert(E user);

}