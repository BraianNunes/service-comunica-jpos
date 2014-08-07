package br.com.cabal.service.jpos.web.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/interface-comunica")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface WSComunicaJpos {

	@GET
	@Path("")
	public Response obterTransacao();

	@POST
	public Response regristrarTransacao();

}
