package yavirac.visualizacion_cursos.feature.estudiantes;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import yavirac.visualizacion_cursos.feature.observaciones.Observaciones;

@Data
@Entity
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String tipo;
    private String avatarUrl;
    private String nivel;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "estudiantes_id")
    List<Observaciones> observaciones = new ArrayList<>();
    
}
