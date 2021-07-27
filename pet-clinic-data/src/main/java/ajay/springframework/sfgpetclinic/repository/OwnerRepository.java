package ajay.springframework.sfgpetclinic.repository;

import org.springframework.data.repository.CrudRepository;

import ajay.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
