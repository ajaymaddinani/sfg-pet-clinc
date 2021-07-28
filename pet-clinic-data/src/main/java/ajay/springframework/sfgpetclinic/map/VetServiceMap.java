package ajay.springframework.sfgpetclinic.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Vet;
import ajay.springframework.sfgpetclinic.services.VetService;

@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService
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