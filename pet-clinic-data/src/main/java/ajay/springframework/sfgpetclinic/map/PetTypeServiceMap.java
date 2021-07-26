package ajay.springframework.sfgpetclinic.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.PetType;
import ajay.springframework.sfgpetclinic.services.PetTypeSevice;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeSevice {

	@Override
	public PetType findById(Long id) {
		return super.findByEntityId(id);
	}

	@Override
	public PetType save(PetType entity) {
		return super.Save(entity.getId(), entity);
	}

	@Override
	public Set<PetType> findAll() {
		return super.findAllEntities();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByEntityId(id);
		
	}

	@Override
	public void delete(PetType entity) {
		super.deleteEntity(entity);
		
	}

}
