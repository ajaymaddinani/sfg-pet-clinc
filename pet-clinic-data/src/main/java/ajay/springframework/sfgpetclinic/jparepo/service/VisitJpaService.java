package ajay.springframework.sfgpetclinic.jparepo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Visit;
import ajay.springframework.sfgpetclinic.repository.VisitRepositroy;
import ajay.springframework.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitJpaService implements VisitService {
	
	private VisitRepositroy visitRepository;

	public VisitJpaService(VisitRepositroy visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit entity) {
		return visitRepository.save(entity);
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits= new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
		
	}

	@Override
	public void delete(Visit entity) {
		visitRepository.delete(entity);
		
	}
	

}
