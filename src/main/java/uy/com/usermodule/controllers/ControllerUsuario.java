package uy.com.usermodule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.usermodule.controllers.request.RequestUsuario;
import uy.com.usermodule.dominio.ILogica;
import uy.com.usermodule.dominio.excepciones.BadRequestException;
import uy.com.usermodule.dominio.excepciones.InternalServerException;
import uy.com.usermodule.dominio.excepciones.NotFoundException;
import uy.com.usermodule.dominio.respuestas.RespuestaUsuario;

@RestController
@RequestMapping("api/v1/usuario")
public class ControllerUsuario {
    @Qualifier("LRU")
    @Autowired
    ILogica logica;

    @GetMapping(value = "/obtener/{idUsuario}")
    public ResponseEntity obtener (@PathVariable String idUsuario){ //le indicas que viene por la URL
        RespuestaUsuario ru = null;
        try {
            ru = (RespuestaUsuario) logica.obtener(idUsuario);
            return new ResponseEntity<>(ru, HttpStatus.OK);
        } catch (BadRequestException e) {
            return new ResponseEntity<>( ru, HttpStatus.BAD_REQUEST);
        }
        catch (NotFoundException e) {
            return new ResponseEntity<>( ru, HttpStatus.NOT_FOUND);
        }
        catch (InternalServerException e) {
            return new ResponseEntity<>( ru, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        catch (Exception e) { // al padre lo dejo para lo ultimo
            return new ResponseEntity<>( ru, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @RequestMapping("/crear") // 201 cuando vas a crear, 200 para update, 204 para eliminar
    public ResponseEntity crear(@RequestBody RequestUsuario usuario){ // vas a recibir por el body porque es un objeto
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
//400 le pasaste algo mal, 404 le pasaste bien pero no lo encontro
    // 500 es cuando salio algo mal pero por culpa de la aplicacion
    @DeleteMapping("/delete/{idUsuario}")
    public ResponseEntity delete(@PathVariable String idUsuario){
            return new ResponseEntity<>(idUsuario, HttpStatus.OK);
    }

    //ResponseEntity tiene un status code y una interfaz para devolver lo que quieras(generico)
}
