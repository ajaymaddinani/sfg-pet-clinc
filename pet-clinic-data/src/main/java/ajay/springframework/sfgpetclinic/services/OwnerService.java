package ajay.springframework.sfgpetclinic.services;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
