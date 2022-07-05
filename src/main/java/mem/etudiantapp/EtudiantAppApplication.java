package mem.etudiantapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import mem.etudiantapp.entities.Etudiant;
import mem.etudiantapp.repositories.EtudiantRepository;

@SpringBootApplication
public class EtudiantAppApplication implements CommandLineRunner {
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(EtudiantAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(Etudiant.class);
		
	}

}
