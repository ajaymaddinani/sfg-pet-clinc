package ajay.springframework.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Pet extends BaseEntity {

	private String Name;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
