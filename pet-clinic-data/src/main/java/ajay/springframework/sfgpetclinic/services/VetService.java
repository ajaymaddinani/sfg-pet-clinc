package ajay.springframework.sfgpetclinic.services;

import java.util.Set;

import ajay.springframework.sfgpetclinic.model.Vet;

public interface VetService 
{

	Vet findById(Long id);

	Vet save(Vet owner);

	Vet findByLastName(String lastName);

	Set<Vet> findAll();
}
