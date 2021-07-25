package ajay.springframework.sgfpetclinic.map;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Pet;
import ajay.springframework.sfgpetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>
{

	@Override
	public Pet save(Pet entity) {
		return super.Save(entity.getId(), entity);
	}

	@Override
	public Pet findById(Long id) {
		return super.findByEntityId(id);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAllEntities();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByEntityId(id);
		
	}

	@Override
	public void delete(Pet entity) {
		super.deleteEntity(entity);
	}

}
