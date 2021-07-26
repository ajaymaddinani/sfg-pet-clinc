package ajay.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ajay.springframework.sfgpetclinic.model.Owner;
import ajay.springframework.sfgpetclinic.model.Pet;
import ajay.springframework.sfgpetclinic.model.PetType;
import ajay.springframework.sfgpetclinic.model.Specality;
import ajay.springframework.sfgpetclinic.model.Vet;
import ajay.springframework.sfgpetclinic.services.OwnerService;
import ajay.springframework.sfgpetclinic.services.PetTypeSevice;
import ajay.springframework.sfgpetclinic.services.SpecalityService;
import ajay.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeSevice petTypeService;
	private final SpecalityService specalityService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeSevice petTypeService, SpecalityService specalityService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specalityService = specalityService;
	}

	

	@Override
	public void run(String... args) throws Exception {
		
		PetType petType = new PetType();
		petType.setName("Dog");
		
		Pet ajayPet= new Pet();
		ajayPet.setId(5L);
		ajayPet.setName("Hero");
		ajayPet.setPetType(petType);
		ajayPet.setBirthDate(LocalDate.now());
		
		Pet vijayPet= new Pet();
		vijayPet.setId(6L);
		vijayPet.setPetType(petType);
		vijayPet.setName("SuperHero");
		vijayPet.setBirthDate(LocalDate.now());
		
		Owner owner = new Owner();
		owner.setId(1L);
		owner.setFirstName("Ajay");
		owner.setLastName("Maddinani");
		owner.setAddress("Edgedale Plains");
		owner.setCity("Singapore");
		owner.setTelephone("90023538");
		owner.getPets().add(ajayPet);
		ownerService.save(owner);

		owner = new Owner();
		owner.setId(2L);
		owner.setFirstName("Vijay");
		owner.setLastName("Maddinani");
		owner.setAddress("Woodside");
		owner.setCity("NewJersey");
		owner.setTelephone("83724929");
		owner.getPets().add(vijayPet);
		ownerService.save(owner);

		System.out.println("loaded owners");

		Specality specality = new Specality();
		specality.setId(4L);
		specality.setDescription("Radiology");
		
		specalityService.save(specality);
		
		specality = new Specality();
		specality.setId(5L);
		specality.setDescription("Sugery");
		
		specalityService.save(specality);
		
		specality = new Specality();
		specality.setId(6L);
		specality.setDescription("Dentistry");
		
		specalityService.save(specality);
		
		System.out.println("loaded pet specalities");
		
		Vet vet = new Vet();
		vet.setId(1L);
		vet.setFirstName("Deetya");
		vet.setLastName("Maddinani");
		vet.getSpecalities().add(specality);
		vetService.save(vet);
		System.out.println("loaded vets");
		
		PetType dog = new PetType();
		dog.setName("Dog");
		petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		petTypeService.save(cat);
		
		PetType bird = new PetType();
		bird.setName("Bird");
		petTypeService.save(bird);
		
		System.out.println("loaded pet types");
		
	}

}
