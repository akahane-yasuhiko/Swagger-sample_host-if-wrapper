package io.swagger.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.model.OneOfinlineResponse200;
import io.swagger.model.Sbz003cReq;
import io.swagger.service.Sbz003Service;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-20T09:38:05.686Z[GMT]")
@RestController
@Tag(name = "SampleBizSvC")
public class Sbz003ApiController implements Sbz003Api {

    private static final Logger log = LoggerFactory.getLogger(Sbz003ApiController.class);

    @Autowired
    private Sbz003Service service;

//    private final ObjectMapper objectMapper;
//
//    private final HttpServletRequest request;
//
//    @org.springframework.beans.factory.annotation.Autowired
//    public Sbz003ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//        this.objectMapper = objectMapper;
//        this.request = request;
//    }

    public ResponseEntity<OneOfinlineResponse200> sbz003(@Parameter(in = ParameterIn.DEFAULT, description = "description here", required=true, schema=@Schema()) @Valid @RequestBody Sbz003cReq body) {
    	OneOfinlineResponse200 res = service.execute(body);
    	log.debug(this.getClass().getSimpleName() + " " + res);
    	return new ResponseEntity<OneOfinlineResponse200>(res, HttpStatus.OK);

    }

}
