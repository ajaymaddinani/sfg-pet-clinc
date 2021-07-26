package ajay.springframework.sfgpetclinic.map;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Specality;
import ajay.springframework.sfgpetclinic.services.SpecalityService;

public class SpecalityServiceMap extends AbstractMapService<Specality, Long> implements SpecalityService{

	@Override
	public Specality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findByEntityId(id);
	}

	@Override
	public Specality save(Specality entity) {
		// TODO Auto-generated method stub
		return super.Save(entity.getId(), entity);
	}

	@Override
	public Set<Specality> findAll() {
		return super.findAllEntities();
	}

	@Override
	public void deleteById(Long id) {
	super.deleteByEntityId(id);
		
	}

	@Override
	public void delete(Specality entity) {
	super.deleteEntity(entity);
		
	}

	

}
