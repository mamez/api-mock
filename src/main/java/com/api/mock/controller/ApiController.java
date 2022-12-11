package com.api.mock.controller;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.api.mock.Repositoty.ApiRepository;
import com.api.mock.core.Util;
import com.api.mock.dto.ApiDto;
import com.api.mock.entity.Api;
import com.api.mock.map.ApiMapper;
import com.api.mock.type.State;
import com.oracle.svm.core.annotate.Inject;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiController {

	@Inject
	ApiRepository apiRepository;

	@Inject
	ApiMapper apiMapper;

	@GET
	public Response getAll() {
		List<ApiDto> apis = apiRepository.listAll().stream().map(api -> apiMapper.toDto(api))
				.collect(Collectors.toList());
		return Response.ok(apis).build();
	}

	@GET
	@Path("{id}")
	public Response getById(@PathParam("id") Long id) {
		return apiRepository.findByIdOptional(id).map(api -> Response.ok(apiMapper.toDto(api)).build())
				.orElse(Response.status(NOT_FOUND).build());
	}

	@POST
	@Transactional
	public Response create(ApiDto apiDto) {
		apiDto.setState(State.ACTIVE);
		apiDto.setWorkSpace("CGI");
		apiDto.setAuditDate(Util.getStrDate(new Date()));
		Api api = apiMapper.toEntity(apiDto);
		apiRepository.persist(api);
		if (apiRepository.isPersistent(api)) {
			return Response.created(URI.create("/api/" + api.getId())).build();
		}
		return Response.status(NOT_FOUND).build();
	}

	@PUT
	@Transactional
	public Response update(ApiDto apiDto) {
		return apiRepository.findByIdOptional(apiDto.getId()).map(api -> {
			apiDto.setAuditDate(Util.getStrDate(new Date()));
			Api apiUpdate = apiMapper.toEntity(apiDto);
			apiMapper.merge(api, apiUpdate);
			return Response.ok(apiMapper.toDto(apiUpdate)).build();
		}).orElse(Response.status(NOT_FOUND).build());
	}

	@DELETE
	@Path("{id}")
	@Transactional
	public Response delete(@PathParam("id") Long id) {
		boolean deleted = apiRepository.deleteById(id);
		return deleted ? Response.noContent().build() : Response.status(BAD_REQUEST).build();
	}

}
