package ajay.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pets")
public class Pet extends BaseEntity {

	@Column(name="name")
	private String Name;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType petType;
	
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
	private Set<Visit> vists;
	
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
	public Set<Visit> getVists() {
		return vists;
	}
	public void setVists(Set<Visit> vists) {
		this.vists = vists;
	}
	
}
