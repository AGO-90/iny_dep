package uy.com.usermodule.datos.usuario;

import uy.com.usermodule.dominio.respuestas.RespuestaUsuario;

public interface IRepositorioUsuario {
    RespuestaUsuario obtener(String idUsuario) throws Exception;
}
