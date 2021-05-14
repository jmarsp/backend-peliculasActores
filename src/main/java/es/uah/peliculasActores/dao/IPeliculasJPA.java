package es.uah.peliculasActores.dao;

import es.uah.peliculasActores.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPeliculasJPA extends JpaRepository <Pelicula, Integer> {
    /** Declaración de las búsquedas especiales **/
    /** Las búsquedas estandard jpa se heredan al extender de JpaRepository**/
    List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
    List<Pelicula> findByGeneroContainingIgnoreCase(String genero);
    List<Pelicula> findByDirector(String director);
}
