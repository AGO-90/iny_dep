package uy.com.usermodule.dominio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import uy.com.usermodule.datos.usuario.IRepositorioUsuario;

@Service("LI")
public class Logica_Integer implements ILogica<Integer> {
    @Qualifier("BD")
    @Autowired //Lo que esta abajo, va a cargarse automaticamente cuando la aplicacion inicie.
            //Que le va a cargar ?
            // 1. Si lo dejo sin nada: va a buscar la primer clase que encuentre,
    //          que implemente la interfaz de IRepositorioUsuario
    IRepositorioUsuario repositorioUsuario;
    //GET obtener sea un registro o muchos
    //DELETE es para borrar uno o muchos
    //POST es para cuando vas a crear uno o muchos registros que no existen
    //PUT es cuando vas a modificar el objeto completo
    //PATCH es para modificar una parte del objeto

    public Integer obtener (String idUsuario) throws Exception { // como es GET no necesitamos mandar nada por cuerpo y mandarlo por la URL
        Integer usu = (Integer) repositorioUsuario.obtener(idUsuario);
        //usu.setToken_nuestro("petero");  // esto es porque puedo ir a otro lado a consultar por el token
        return usu;
    }


}
