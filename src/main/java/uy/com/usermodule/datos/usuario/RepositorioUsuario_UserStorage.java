package uy.com.usermodule.datos.usuario;

import com.google.gson.Gson;
import org.springframework.stereotype.Repository;
import uy.com.usermodule.dominio.respuestas.RespuestaUsuario;
import uy.com.usermodule.dominio.excepciones.BadRequestException;
import uy.com.usermodule.dominio.excepciones.InternalServerException;
import uy.com.usermodule.dominio.excepciones.NotFoundException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Repository("UM") // Etiqueta que indica que esta clase puede ser inyectada @Repository @Component @Service
public class RepositorioUsuario_UserStorage implements IRepositorioUsuario<RespuestaUsuario> {
    public RespuestaUsuario obtener(String idUsuario) throws Exception{
        RespuestaUsuario respuestaUsuario = null;
        URL url = new URL("https://users-module-go.herokuapp.com/api/v1/users/disabled/"+idUsuario);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // prueba la URL para ver si esta todo bien
        connection.setRequestMethod("GET"); // seteo el verbo

        //tipo de comunicacion entre APIS
        connection.setRequestProperty("Accept","application/json");//le indicamos que nuestro metodo solo acepta JSON

        //le pego al end point
        if(connection.getResponseCode() > 299 ){
            if(connection.getResponseCode() == 400){
                throw new BadRequestException();
            }
            if(connection.getResponseCode() == 404){
                throw new NotFoundException();
            }
            if(connection.getResponseCode() == 500){
                throw new InternalServerException();
            }

        } else { // salio todo bien
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream())); // trambolico
            String resultado = br.readLine(); // obtengo el resultado
            connection.disconnect();
            Gson gson = new Gson();
            respuestaUsuario = gson.fromJson(resultado, RespuestaUsuario.class);

        }
        return respuestaUsuario;
    }
}
