package uy.com.usermodule.dominio;

import uy.com.usermodule.dominio.respuestas.RespuestaUsuario;

public interface ILogica {
    RespuestaUsuario obtener (String idUsuario) throws Exception;
}
