package ajay.springframework.sfgpetclinic.jparepo.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ajay.springframework.sfgpetclinic.model.Owner;
import ajay.springframework.sfgpetclinic.repository.OwnerRepository;
import ajay.springframework.sfgpetclinic.repository.PetRepository;
import ajay.springframework.sfgpetclinic.repository.PetTypeRepository;
import ajay.springframework.sfgpetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerJpaService implements OwnerService {
	
	private OwnerRepository ownerRepository;
	private PetRepository petRepository;
	private PetTypeRepository petTypeRepository;

	public OwnerJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}
	
	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}


	@Override
	public Owner save(Owner entity) {
		return ownerRepository.save(entity);
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
		
	}

	@Override
	public void delete(Owner entity) {
		ownerRepository.delete(entity);
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
