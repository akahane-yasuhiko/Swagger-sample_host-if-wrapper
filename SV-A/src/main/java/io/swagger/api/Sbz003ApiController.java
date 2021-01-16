package io.swagger.api;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.log.Log;
import io.swagger.model.Sbz003aReq;
import io.swagger.model.Sbz003aRes;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-29T06:09:07.235Z[GMT]")
@Tag(name = "SampleBizSvA")
@RestController
public class Sbz003ApiController implements Sbz003Api {

    private static final Logger log = LoggerFactory.getLogger(Sbz003ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public Sbz003ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

	@Log
    public ResponseEntity<Sbz003aRes> sbz003(@Parameter(in = ParameterIn.DEFAULT, description = "description here", required=true, schema=@Schema()) @Valid @RequestBody Sbz003aReq body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Sbz003aRes>(objectMapper.readValue("{\n  \"resItem2\" : \"XXXX9999\",\n  \"resItem1\" : \"xx123\",\n  \"statusCode\" : \"0000\"\n}", Sbz003aRes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Sbz003aRes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Sbz003aRes>(HttpStatus.NOT_IMPLEMENTED);
    }

}
