package ajay.springframework.sfgpetclinic.web.test;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import ajay.springframework.sfgpetclinic.controller.*;
import ajay.springframework.sfgpetclinic.services.OwnerService;
import ajay.springframework.sfgpetclinic.model.*;
import static org.hamcrest.Matchers.*;
@ExtendWith(MockitoExtension.class)
public class OwnerControllerTest {

	MockMvc mockMvc;
	@Mock
	OwnerService ownerService;
	@InjectMocks
	OwnersController ownerController;
	
	@BeforeEach
	void setUp() throws Exception
	{
		Set<Owner> owners= new HashSet<>();
		Owner owner = new Owner();
		owner.setId(1L);
		Owner owner2 = new Owner();
		owner.setId(2L);
		owners.add(owner2);
		owners.add(owner);
		when(ownerService.findAll()).thenReturn(owners);
		mockMvc= MockMvcBuilders.standaloneSetup(ownerController).build();
		
	}
	
	@Test
	void listOwners() throws Exception
	{
		mockMvc.perform(get("/owners"))
		   .andExpect(status().isOk())
		   .andExpect((view().name("owners/index"))
		   );
		//.andExpect(model().attribute("owners",hasSize(2)))
	}
	
	
	
}
