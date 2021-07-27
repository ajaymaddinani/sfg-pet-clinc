package ajay.springframework.sfgpetclinic.jparepo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.PetType;
import ajay.springframework.sfgpetclinic.repository.PetTypeRepository;
import ajay.springframework.sfgpetclinic.services.PetTypeSevice;

@Service
@Profile("springdatajpa")
public class PetTypeJpaService implements PetTypeSevice {

	private PetTypeRepository petTypeRepository;
	
	public PetTypeJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType entity) {
		return petTypeRepository.save(entity);
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);
	}

	@Override
	public void delete(PetType entity) {
		petTypeRepository.delete(entity);
		
	}

}
