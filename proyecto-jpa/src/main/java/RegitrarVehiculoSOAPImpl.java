import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;


@WebService
public class RegitrarVehiculoSOAPImpl {
	
	@WebMethod
	public Respuesta registrarVehiculo(
			@WebParam(name="patente") @XmlElement(required=true) String patente
			){
		
		Respuesta respuesta = new Respuesta();
		
		respuesta.setCodigo(0);
		respuesta.setMensaje("Registro de "+patente+" exitoso");
		
		System.out.println(respuesta.toString());
		
		return respuesta;
	}

}
