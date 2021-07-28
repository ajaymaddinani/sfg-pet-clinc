package ajay.springframework.sfgpetclinic.data.test;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ajay.springframework.sfgpetclinic.map.OwnerServiceMap;
import ajay.springframework.sfgpetclinic.map.PetTypeServiceMap;
import ajay.springframework.sfgpetclinic.model.Owner;
 

public class OwnerServiceMapTest {
	
	private OwnerServiceMap ownerServiceMap;
	@BeforeEach
	void setUp()
	{
		ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap());
		Owner owner =new Owner();
		owner.setId(1L);
		ownerServiceMap.save(owner);
	}
	@Test
    void  findAll()
    {
		Set<Owner> owners = ownerServiceMap.findAll();
		assertEquals(1, owners.size());
    }
}
