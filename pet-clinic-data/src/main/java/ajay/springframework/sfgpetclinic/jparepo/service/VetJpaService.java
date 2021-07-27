package ajay.springframework.sfgpetclinic.jparepo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Vet;
import ajay.springframework.sfgpetclinic.repository.VetRepository;
import ajay.springframework.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetJpaService implements VetService {
	
	private VetRepository vetRepository;

	public VetJpaService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet entity) {
		return vetRepository.save(entity);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
		
	}

	@Override
	public void delete(Vet entity) {
		vetRepository.delete(entity);
		
	}

}
