package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.log.Log;
import io.swagger.model.Sbz001aReq;
import io.swagger.model.Sbz001aRes;
import io.swagger.service.Sbz001Service;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-29T06:09:07.235Z[GMT]")
@Tag(name = "SampleBizSvA")
@RestController
public class Sbz001ApiController implements Sbz001Api {

	private static final Logger log = LoggerFactory.getLogger(Sbz001ApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	private Sbz001Service service;

	@org.springframework.beans.factory.annotation.Autowired
	public Sbz001ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Log
	public ResponseEntity<Sbz001aRes> sbz001(
			@Parameter(in = ParameterIn.DEFAULT, description = "description here", required = true, schema = @Schema()) @Valid @RequestBody Sbz001aReq body) {

		String accept = request.getHeader("Accept");
		if (accept == null || !accept.contains("application/json")) {
			return new ResponseEntity<Sbz001aRes>(HttpStatus.BAD_REQUEST);
		}

		Sbz001aRes res = service.execute(body);
		return new ResponseEntity<Sbz001aRes>(res, HttpStatus.OK);

	}

}
