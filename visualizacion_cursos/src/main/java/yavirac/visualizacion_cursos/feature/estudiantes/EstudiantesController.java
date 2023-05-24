package yavirac.visualizacion_cursos.feature.estudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/estudiantes")
@CrossOrigin({"*"})
public class EstudiantesController {
    @Autowired
    EstudiantesServices estudiantesServices;

    @GetMapping("/")
    public List<Estudiantes> findAll () {
        return estudiantesServices.findAll();
    }

    @GetMapping("/{id}/")
    public Estudiantes findById(@PathVariable Long id) {
        return estudiantesServices.findById(id);
    }

    @PutMapping("/update/")
    public Estudiantes updateEstudiantes(@RequestBody Estudiantes estudiantes){
        return estudiantesServices.saveEstudiantes(estudiantes);
    }
    
}
