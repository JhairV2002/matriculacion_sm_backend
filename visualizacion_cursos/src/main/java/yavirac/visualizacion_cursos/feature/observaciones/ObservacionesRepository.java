package yavirac.visualizacion_cursos.feature.observaciones;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ObservacionesRepository extends CrudRepository<Observaciones, Long> {
    public List<Observaciones> findAll();
    
}
