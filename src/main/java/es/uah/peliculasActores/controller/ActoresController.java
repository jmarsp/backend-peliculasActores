package es.uah.peliculasActores.controller;

import es.uah.peliculasActores.model.Actor;
import es.uah.peliculasActores.service.IActoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActoresController {
    /** ActoresController es la clase que expone al exterior los métodos de las¡ interfaz IActoresService
     * como recursos REST **/

    @Autowired
    IActoresService actoresService;

    @GetMapping("/actores")
    public List<Actor> buscarTodos() {
        return actoresService.buscarTodos();
    }

    @GetMapping("/actores/{id}")
    public Actor buscarActorPorId(@PathVariable("id") Integer id) {
        return actoresService.buscarActorPorId(id);
    }

    @GetMapping("/actores/nombre/{nombre}")
    public Actor buscarActorPorNombre(@PathVariable("nombre") String nombre) {
        return actoresService.buscarActorPorNombre(nombre);
    }

    @PostMapping("/actores")
    public void guardarActor(@RequestBody Actor actor) {
        actoresService.guardarActor(actor);
    }

    @PutMapping("/actores")
    public void actualizarActor(@RequestBody Actor actor) {
        actoresService.actualizarActor(actor);
    }

    @DeleteMapping("/actores/{id}")
    public void eliminarActor(@PathVariable("id") Integer id) {
        actoresService.eliminarActor(id);
    }

    @GetMapping("/actores/insc/{ida}/{idp}")
    public void inscribirPelicula(@PathVariable("ida") Integer ida, @PathVariable("idp")Integer idp) {
        /**Método que añade a una película un actor, ida es el indice del actor e idp el índice de la
         * película **/
        actoresService.inscribirPelicula(ida, idp);
    }

}
