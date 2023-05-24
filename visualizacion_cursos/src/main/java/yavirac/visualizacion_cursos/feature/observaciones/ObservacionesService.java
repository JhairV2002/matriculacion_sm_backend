package yavirac.visualizacion_cursos.feature.observaciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservacionesService {
    @Autowired
    ObservacionesRepository observacionesRepository;

    public List<Observaciones> findAll(){
        return observacionesRepository.findAll();
    }

    public Observaciones save(Observaciones observaciones){
        return observacionesRepository.save(observaciones);
    }
    
}
