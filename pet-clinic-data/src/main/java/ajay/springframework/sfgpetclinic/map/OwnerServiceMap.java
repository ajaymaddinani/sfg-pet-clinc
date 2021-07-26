package ajay.springframework.sfgpetclinic.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Owner;
import ajay.springframework.sfgpetclinic.services.OwnerService;
import ajay.springframework.sfgpetclinic.services.PetTypeSevice;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private PetTypeSevice petTypeService;

	public OwnerServiceMap(PetTypeSevice petTypeService) {
		super();
		this.petTypeService = petTypeService;
	}

	@Override
	public Owner save(Owner entity) {
		if (entity.getPets() != null) {
			entity.getPets().forEach(pet -> {
				pet.setPetType(petTypeService.save(pet.getPetType()));
			});
		}
		return super.Save(entity.getId(), entity);
	}

	@Override
	public Owner findById(Long id) {
		return super.findByEntityId(id);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAllEntities();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByEntityId(id);

	}

	@Override
	public void delete(Owner entity) {
		super.deleteEntity(entity);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
