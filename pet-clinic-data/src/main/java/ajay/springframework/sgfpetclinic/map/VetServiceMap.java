package ajay.springframework.sgfpetclinic.map;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Vet;
import ajay.springframework.sfgpetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>
{

	@Override
	public Vet save(Vet entity) {
		return super.Save(entity.getId(), entity);
	}

	@Override
	public Vet findById(Long id) {
		return super.findByEntityId(id);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAllEntities();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByEntityId(id);
		
	}

	@Override
	public void delete(Vet entity) {
		super.deleteEntity(entity);
	}

}