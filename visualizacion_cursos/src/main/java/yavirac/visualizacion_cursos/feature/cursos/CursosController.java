package yavirac.visualizacion_cursos.feature.cursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("visualizacion_cursos")
@CrossOrigin({ "*" })
public class CursosController {
    @Autowired
    CursosService cursosService;

    @GetMapping("/")
    public List<Cursos> findAll() {
        return cursosService.findAll();
    }

    @GetMapping("/findByName/{term}/")
    public List<Cursos> findByName(@PathVariable String term) {
        return cursosService.findByName(term);
    }
}
