package es.uah.peliculasActores.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.sql.Date;


@Entity
@Table(name = "actores", schema = "peliculasactoresdb")
public class Actor implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idActor;
    private String nombre;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale = "es-ES", timezone = "Europe/Madrid")
    /**@Temporal(TemporalType.DATE)**/
    private Date fechaNacimiento;
    private String paisNacimiento;

    @JoinTable(name = "peliculas_has_actores", joinColumns = {
            @JoinColumn(name = "Actores_idActor", referencedColumnName =
                    "idActor")}, inverseJoinColumns = {
            @JoinColumn(name = "Peliculas_idPelicula", referencedColumnName = "idPelicula")})
    @ManyToMany
    @JsonIgnoreProperties("actores")

    private List<Pelicula> peliculas;

    public Actor() {
    }

    public Integer getIdActor() {
        return idActor;
    }
    public void setIdActor(Integer idActor) {
        this.idActor = idActor;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getPaisNacimiento() {
        return paisNacimiento;
    }
    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public List <Pelicula> getPeliculas(){
        return peliculas;
    }
    public void setPeliculas (List <Pelicula> peliculas){
        this.peliculas = peliculas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return Objects.equals(idActor, actor.idActor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActor);
    }

    public void addPelicula(Pelicula pelicula) {
        if (pelicula != null) {
            getPeliculas().add(pelicula);
            pelicula.addActor(this);
        }
    }

    public void removePelicula(Pelicula pelicula) {
        if (pelicula != null) {
            pelicula.removeActor(this);
            getPeliculas().remove(pelicula);
        }
    }
}
