package ajay.springframework.sfgpetclinic.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Owner;
import ajay.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService
{

	@Override
	public Owner save(Owner entity) {
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
