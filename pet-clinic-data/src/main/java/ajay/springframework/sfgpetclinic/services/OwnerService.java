package ajay.springframework.sfgpetclinic.services;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Owner findByLastName(String lastName);
	
	Set<Owner>findAll();
}
