package ajay.springframework.sgfpetclinic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
	
	protected Map<ID, T> map = new HashMap<>();
	
	Set<T> findAllEntities()
	{
		return new HashSet<>(map.values());
	}
	
	T findByEntityId(ID id)
	{
		return map.get(id);
	}
	
	T Save(ID id, T entity)
	{
		map.put(id, entity);
		return entity;
	}
	void deleteByEntityId(ID id)
	{
		map.remove(id);
	}
	void deleteEntity(T entity)
	{
		map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
	}
}
