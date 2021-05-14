package es.uah.peliculasActores.dao;

import es.uah.peliculasActores.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IActoresJPA  extends JpaRepository <Actor, Integer>{
    /** Declaración de las búsquedas especiales **/
    /** Las búsquedas estandard jpa se heredan al extender de JpaRepository**/
    Actor findByNombre (String nombre);
}
