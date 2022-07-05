package mem.etudiantapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mem.etudiantapp.entities.Etudiant;
import mem.etudiantapp.repositories.EtudiantRepository;


@RestController
public class EtudiantRestController {
	
	@Autowired
	 EtudiantRepository etudiantRepository;
	
	
	@GetMapping(value="/listEtudiants")
	public List<Etudiant> listEtudiants(){
		
		return etudiantRepository.findAll();
	
	
	}
	
	@GetMapping(value="/listEtudiants/numeroEtud")
	public Etudiant listEtudiants(@PathVariable(name="numeroEtud") String numeroEtud ){
		
		return etudiantRepository.findById(numeroEtud).get();
	
	
	}
	
	@PutMapping(value="/listEtudiants/numeroEtud")
	public Etudiant update(@PathVariable(name="numeroEtud") String numeroEtud, @RequestBody Etudiant etudiant ){
		etudiant.setNumeroEtud(numeroEtud);
		
		return etudiantRepository.save(etudiant);
	
	
	}
	@PostMapping(value="/listEtudiants")
	public Etudiant save( @RequestBody Etudiant etudiant ){
		
		return etudiantRepository.save(etudiant);
	
	
	}
}
