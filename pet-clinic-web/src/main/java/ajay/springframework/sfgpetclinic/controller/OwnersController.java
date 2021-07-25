package ajay.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ajay.springframework.sfgpetclinic.services.OwnerService;

@Controller
public class OwnersController {
	
	private final OwnerService ownerService;

	public OwnersController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({ "/owners", "/owners/index", "/owners/index.html" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

}		
