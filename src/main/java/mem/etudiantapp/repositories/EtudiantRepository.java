package mem.etudiantapp.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mem.etudiantapp.entities.Etudiant;

@CrossOrigin("*")
@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, String> {
	
	@RestResource(path = "/byNumeroEtud")
	 public List<Etudiant> findByNumeroEtud( @Param("numeroEtud")String num );
	
	@RestResource(path = "/byNumeroEtudPage")
	 public Page<Etudiant> findByNumeroEtud(@Param("numeroEtud") String num, Pageable pageable);

   
}
 