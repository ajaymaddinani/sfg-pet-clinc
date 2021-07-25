package ajay.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> 
{
	T findById(ID id);
	T save(T entity);
	Set<T> findAll();
	void deleteById(ID id);
	void delete(T entity);
}
