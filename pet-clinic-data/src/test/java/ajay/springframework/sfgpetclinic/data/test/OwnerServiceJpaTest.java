package ajay.springframework.sfgpetclinic.data.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ajay.springframework.sfgpetclinic.jparepo.service.*;
import ajay.springframework.sfgpetclinic.repository.OwnerRepository;
import ajay.springframework.sfgpetclinic.repository.PetRepository;
import ajay.springframework.sfgpetclinic.repository.PetTypeRepository;
import ajay.springframework.sfgpetclinic.model.*;
@ExtendWith(MockitoExtension.class)
public class OwnerServiceJpaTest {
	
	@Mock
	private OwnerRepository ownerRepository;
	@Mock
	private PetRepository petRepository;
	@Mock
	private PetTypeRepository petTypeRepository;
    @InjectMocks
	OwnerJpaService ownerJpaService;
    
    @Test
    void findByLastName()
    {
    	Owner owner = new Owner();
    	owner.setId(1L);
    	owner.setLastName("Ajay");
    	when(ownerRepository.findByLastName("Ajay")).thenReturn(owner);
    	
    	Owner ownerExpected=ownerJpaService.findByLastName("Ajay");
    	
    	assertEquals("Ajay", ownerExpected.getLastName());
    }

}
