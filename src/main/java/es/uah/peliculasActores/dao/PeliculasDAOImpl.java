package es.uah.peliculasActores.dao;

import es.uah.peliculasActores.model.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PeliculasDAOImpl implements IPeliculasDAO{
    /** Implementación de todos los métodos declarados en la interface IPeliculasDAO **/

    @Autowired
    IPeliculasJPA peliculasJPA;

    @Override
    public List<Pelicula> buscarTodos() {
        return peliculasJPA.findAll();
    }

    @Override
    public Pelicula buscarPeliculaPorId(Integer idPelicula) {
        Optional<Pelicula> optional = peliculasJPA.findById(idPelicula);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
    @Override
    public List<Pelicula> buscarPeliculasPorTitulo(String titulo) {
        return peliculasJPA.findByTituloContainingIgnoreCase(titulo);
    }
    @Override
    public List<Pelicula> buscarPeliculasPorGenero(String genero) {
        return peliculasJPA.findByGeneroContainingIgnoreCase(genero);
    }
    @Override
    public List<Pelicula> buscarPeliculasPorDirector(String director) {
        return peliculasJPA.findByDirector(director);
    }
    @Override
    public void guardarPelicula(Pelicula pelicula) {
        peliculasJPA.save(pelicula);
    }
    @Override
    public void eliminarPelicula(Integer idPelicula) {
        peliculasJPA.deleteById(idPelicula);
    }
    @Override
    public void actualizarPelicula(Pelicula pelicula) {
        peliculasJPA.save(pelicula);
    }


}
