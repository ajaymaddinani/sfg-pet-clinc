package ajay.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ajay.springframework.sfgpetclinic.services.VetService;

@Controller
public class VetsController {
	
	private VetService vetService;
	
	public VetsController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({"/vets","/vets/index", "/vets/index.html"})
	public String listVets(Model model)
	{
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
