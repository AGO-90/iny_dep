package uy.com.usermodule.dominio;

public interface ILogica<T> {
    T obtener (String idUsuario) throws Exception;
}
