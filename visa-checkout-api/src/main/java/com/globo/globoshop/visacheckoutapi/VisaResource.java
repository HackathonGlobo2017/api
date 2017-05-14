package com.globo.globoshop.visacheckoutapi;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.globo.globoshop.visacheckoutapi.modelo.Pagamento;

@Path("/")
public class VisaResource {

	private static final String SERVER_URI = "https://sandbox.api.visa.com/wallet-services-web/payment/data/";
	private static final String ENTRY_POINT = "";
	
	private static final String key = "6CTXIFZ3UZWM2DXI2Q9M21UxOpwAB1yOztxO3Q9PjogfEXBNk";
	private static final String secret = "M00Zos{+2RnKbANhUDgUEGLccLN08JDm0U{sdDyg";

	@GET
	@Path("/pagar")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response pagar() throws NotFoundException, ServerErrorException {

		Pagamento resposta = new Pagamento().setStatus("Aprovado");

		return Response.ok(resposta).build();
	}

}
