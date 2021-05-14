package es.uah.peliculasActores.dao;

import es.uah.peliculasActores.model.Pelicula;
import java.util.List;

public interface IPeliculasDAO {
    /** Declaración de todos los métodos DAO a utilizar**/

    List<Pelicula> buscarTodos();

    Pelicula buscarPeliculaPorId(Integer idPelicula);

    List<Pelicula> buscarPeliculasPorTitulo(String titulo);

    List<Pelicula> buscarPeliculasPorGenero(String genero);

    List<Pelicula> buscarPeliculasPorDirector(String director);

    void guardarPelicula(Pelicula pelicula);

    void eliminarPelicula(Integer idPelicula);

    void actualizarPelicula(Pelicula pelicula);
}
