package uy.com.usermodule.datos.usuario;

import org.springframework.stereotype.Repository;
import uy.com.usermodule.dominio.respuestas.RespuestaUsuario;

@Repository("BD")
public class RepositorioUsuario_BaseDeDatos implements IRepositorioUsuario {

    @Override
    public RespuestaUsuario obtener(String idUsuario) throws Exception {
        return new RespuestaUsuario("123", 1,
                1, null, "A@a.com", "Ghione",
                "Andres", "", null, null, null);
    }
}
