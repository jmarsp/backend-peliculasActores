package es.uah.peliculasActores.service;

import es.uah.peliculasActores.model.Actor;
import java.util.List;

public interface IActoresService {
    /** Declara como servicio todos los métodos de  la interfaz IActoresDAO
     para hacer de enlace con ella e implementar en ActoresServiceImpl
     la lógica de negocio necesaria **/
    List<Actor> buscarTodos();
    Actor buscarActorPorId(Integer idActor);
    Actor buscarActorPorNombre(String nombre);
    void guardarActor(Actor actor);
    void eliminarActor(Integer idActor);
    void actualizarActor(Actor actor);
    void inscribirPelicula(Integer idActor, Integer idPelicula);
}
