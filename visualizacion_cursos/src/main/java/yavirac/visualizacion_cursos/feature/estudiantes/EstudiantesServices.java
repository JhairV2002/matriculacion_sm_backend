package yavirac.visualizacion_cursos.feature.estudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudiantesServices {
    @Autowired
    EstudiantesRepository estudiantesRepository;

    public List<Estudiantes> findAll() {
        return estudiantesRepository.findAll();
    }

    public Estudiantes findById(Long id) {
        return estudiantesRepository.findById(id).orElse(new Estudiantes()); 
    }

    public Estudiantes saveEstudiantes(Estudiantes estudiantes) {
        return estudiantesRepository.save(estudiantes);
    }

    
}
