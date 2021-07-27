package ajay.springframework.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import ajay.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
