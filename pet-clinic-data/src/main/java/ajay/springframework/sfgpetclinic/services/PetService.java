package ajay.springframework.sfgpetclinic.services;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long>
{
	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
