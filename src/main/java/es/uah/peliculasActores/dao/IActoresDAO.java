package es.uah.peliculasActores.dao;

import es.uah.peliculasActores.model.Actor;
import java.util.List;

public interface IActoresDAO {
    /** Declaración de todos los métodos DAO a utilizar **/
    List<Actor> buscarTodos();
    Actor buscarActorPorId(Integer idActor);
    Actor buscarActorPorNombre(String nombre);
    void guardarActor(Actor actor);
    void eliminarActor(Integer idActor);
    void actualizarActor(Actor actor);
    void inscribirPelicula(Integer idActor, Integer idPelicula);
}
