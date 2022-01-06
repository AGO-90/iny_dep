package uy.com.usermodule.datos.usuario;

import org.springframework.stereotype.Repository;

@Repository("BD")
public class RepositorioUsuario_BaseDeDatos implements IRepositorioUsuario<Integer> {

    @Override
    public Integer obtener(String idUsuario) throws Exception {
        return 1;
    }
}
