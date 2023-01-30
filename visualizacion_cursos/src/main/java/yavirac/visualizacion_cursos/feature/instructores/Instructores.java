package yavirac.visualizacion_cursos.feature.instructores;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import yavirac.visualizacion_cursos.feature.cursos.Cursos;

@Data
@Entity
public class Instructores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreApellidos;
    private String avatarUrl;
}
