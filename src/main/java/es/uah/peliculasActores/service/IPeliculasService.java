package es.uah.peliculasActores.service;

import es.uah.peliculasActores.model.Pelicula;
import java.util.List;

public interface IPeliculasService {
    /** Declara como servicio todos los métodos de  la interfaz IPeliculasDAO
         para hacer de enlace con ella e implementar en PeliculasServiceImpl
         la lógica de negocio necesaria **/

    List<Pelicula> buscarTodos();

    Pelicula buscarPeliculaPorId(Integer idPelicula);

    List<Pelicula> buscarPeliculasPorTitulo(String titulo);

    List<Pelicula> buscarPeliculasPorGenero(String genero);

    List<Pelicula> buscarPeliculasPorDirector(String director);

    void guardarPelicula(Pelicula pelicula);

    void eliminarPelicula(Integer idPelicula);

    void actualizarPelicula(Pelicula pelicula);
}
