package yavirac.visualizacion_cursos.feature.estudiantes;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EstudiantesRepository extends CrudRepository<Estudiantes, Long> {
    public List<Estudiantes> findAll(); 
    
}
