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

import io.swagger.model.OneOfinlineResponse2001;
import io.swagger.model.Sbz003bReq;
import io.swagger.service.Sbz003Service;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-20T08:49:44.071Z[GMT]")
@Tag(name = "SampleBizSvB")
@RestController
public class Sbz003ApiController implements Sbz003Api {

    private static final Logger log = LoggerFactory.getLogger(Sbz003ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private Sbz003Service service;

    @org.springframework.beans.factory.annotation.Autowired
    public Sbz003ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<OneOfinlineResponse2001> sbz003(@Parameter(in = ParameterIn.DEFAULT, description = "description here", required=true, schema=@Schema()) @Valid @RequestBody Sbz003bReq body) {
		OneOfinlineResponse2001 res = service.execute(body);
		return new ResponseEntity<OneOfinlineResponse2001>(res, HttpStatus.OK);

    }

}
