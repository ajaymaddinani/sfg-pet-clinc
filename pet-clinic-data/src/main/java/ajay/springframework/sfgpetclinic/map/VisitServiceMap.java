package ajay.springframework.sfgpetclinic.map;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Visit;
import ajay.springframework.sfgpetclinic.services.VisitService;

public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService{

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return super.findByEntityId(id);
	}

	@Override
	public Visit save(Visit entity) {
		return entity;
	}

	@Override
	public Set<Visit> findAll() {
		return super.findAllEntities();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteByEntityId(id);
		
	}

	@Override
	public void delete(Visit entity) {
		super.deleteEntity(entity);
		
	}
	
	

}
