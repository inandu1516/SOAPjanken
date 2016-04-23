package daw2;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

//http://localhost:8080/SOAPjanken/JankenWebService?Tester

@WebService(serviceName = "JankenWebService")
public class JankenWebService {

    @WebMethod(operationName = "ResultatTirada")
    public int ResultatTirada(@WebParam(name = "jugador_1") String jugador_1, @WebParam(name = "jugador_2") String jugador_2) {
        int guanyador = 0;
        
        if(jugador_1.equals(jugador_2)){
            guanyador = 0;
        }else if("Tisora".equals(jugador_1) && "Paper".equals(jugador_2)){
            guanyador = 1;
        }else if("Paper".equals(jugador_1) && "Pedra ".equals(jugador_2)){
            guanyador = 1;
        }else if("Pedra ".equals(jugador_1) && "Paper".equals(jugador_2)){
            guanyador = 1;
        }else if("Pedra ".equals(jugador_1) && "Llangardaix".equals(jugador_2)){
            guanyador = 1;
        }else if("Llangardaix".equals(jugador_1) && "Spock".equals(jugador_2)){
            guanyador = 1;
        }else if("Spock".equals(jugador_1) && "Tisora".equals(jugador_2)){
            guanyador = 1;
        }else if("Tisora".equals(jugador_1) && "Llangardaix".equals(jugador_2)){
            guanyador = 1;
        }else if("Llangardaix".equals(jugador_1) && "Paper".equals(jugador_2)){
            guanyador = 1;
        }else if("Paper".equals(jugador_1) && "Spock".equals(jugador_2)){
            guanyador = 1;
        }else if("Spock".equals(jugador_1) && "Pedra".equals(jugador_2)){
            guanyador = 1;
        }else if("Pedra".equals(jugador_1) && "Tisora".equals(jugador_2)){
            guanyador = 1;
        }else{
            guanyador = 2;
        }
        
        return guanyador;
    }
 
}
