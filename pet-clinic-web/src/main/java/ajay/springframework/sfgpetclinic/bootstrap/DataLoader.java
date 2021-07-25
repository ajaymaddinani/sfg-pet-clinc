package ajay.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ajay.springframework.sfgpetclinic.model.Owner;
import ajay.springframework.sfgpetclinic.model.Vet;
import ajay.springframework.sfgpetclinic.services.OwnerService;
import ajay.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	

	@Override
	public void run(String... args) throws Exception {
		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("Ajay");
		owner.setLastName("Maddinani");
		ownerService.save(owner);

		owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("Vijay");
		owner.setLastName("Maddinani");
		ownerService.save(owner);

		System.out.println("loaded owners");

		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("Deetya");
		vet.setLastName("Maddinani");
		vetService.save(vet);
		System.out.println("loaded vets");
	}

}
