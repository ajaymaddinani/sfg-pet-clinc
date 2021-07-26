package ajay.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vets")
public class Vet extends Person {
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="vet_specalities", joinColumns = @JoinColumn(name = "vet_id"),inverseJoinColumns = @JoinColumn(name="specality_id"))
	private Set<Specality> specalities = new HashSet<>();

	public Set<Specality> getSpecalities() {
		return specalities;
	}

	public void setSpecalities(Set<Specality> specalities) {
		this.specalities = specalities;
	}

 
}
