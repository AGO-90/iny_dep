package uy.com.usermodule.datos.usuario;

public interface IRepositorioUsuario<T> {
    T obtener(String idUsuario) throws Exception;
}
