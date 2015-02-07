package co.edu.udea.appsempresariales.rest.impl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import co.edu.udea.appsempresariales.logic.ConvertidorNumerosRomanos;
import co.edu.udea.appsempresariales.dto.NumeroRomano;
import co.edu.udea.appsempresariales.rest.InterfaceRomanosWS;
import co.edu.udea.appsempresariales.rest.PathWS;

@Path(PathWS.ConvertidorRomanoWSContext.ROOT_PATH)
@WebService(endpointInterface = "co.edu.udea.romannumbersconverterws.rest.IRomanNumberConverterWebService")
public class ConvertidorRomanoWS implements InterfaceRomanosWS {

	private ConvertidorNumerosRomanos ConvertidorNumerosRomanos = new ConvertidorNumerosRomanos();

	@Produces(value = { MediaType.APPLICATION_JSON })
	@GET()
	@Override
	public NumeroRomano convertirARomano(
			@QueryParam(PathWS.ConvertidorRomanoWSContext.PARAMETRO) int numero) {

		return (new NumeroRomano(
				this.ConvertidorNumerosRomanos.convertirAromanos(numero)));
	}
}