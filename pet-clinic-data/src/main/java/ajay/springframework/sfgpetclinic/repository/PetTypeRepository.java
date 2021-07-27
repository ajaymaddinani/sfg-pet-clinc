package ajay.springframework.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import ajay.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}