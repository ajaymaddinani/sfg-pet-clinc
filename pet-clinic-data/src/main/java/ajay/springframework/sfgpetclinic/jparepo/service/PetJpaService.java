package ajay.springframework.sfgpetclinic.jparepo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Pet;
import ajay.springframework.sfgpetclinic.repository.PetRepository;
import ajay.springframework.sfgpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetJpaService implements PetService {
	
	private PetRepository petRepository;

	public PetJpaService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

	@Override
	public void delete(Pet entity) {
		petRepository.delete(entity);
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets= new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

}
