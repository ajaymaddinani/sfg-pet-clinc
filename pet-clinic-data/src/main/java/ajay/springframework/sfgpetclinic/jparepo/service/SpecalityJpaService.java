package ajay.springframework.sfgpetclinic.jparepo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Specality;
import ajay.springframework.sfgpetclinic.repository.SepcalityRepository;
import ajay.springframework.sfgpetclinic.services.SpecalityService;

@Service
@Profile("springdatajpa")
public class SpecalityJpaService implements SpecalityService {

	private SepcalityRepository specalityRepository;
	public SpecalityJpaService(SepcalityRepository specalityRepository) {
		super();
		this.specalityRepository = specalityRepository;
	}

	@Override
	public Specality findById(Long id) {
		return specalityRepository.findById(id).orElse(null);
	}

	@Override
	public Specality save(Specality entity) {
		return specalityRepository.save(entity);
	}

	@Override
	public Set<Specality> findAll() {
		Set<Specality> specalities= new HashSet<>();
		specalityRepository.findAll().forEach(specalities::add);
		return specalities;
	}

	@Override
	public void deleteById(Long id) {
		 specalityRepository.deleteById(id);
		
	}

	@Override
	public void delete(Specality entity) {
		 specalityRepository.delete(entity);
		
	}

}
