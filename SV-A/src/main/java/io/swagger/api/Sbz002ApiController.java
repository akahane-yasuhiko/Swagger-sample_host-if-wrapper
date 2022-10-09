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
import io.swagger.model.Sbz002aReq;
import io.swagger.model.Sbz002aRes;
import io.swagger.service.Sbz002Service;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2020-12-29T06:09:07.235Z[GMT]")
@Tag(name = "SampleBizSvA")
@RestController
public class Sbz002ApiController implements Sbz002Api {

  private static final Logger log = LoggerFactory.getLogger(Sbz002ApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @Autowired
  private Sbz002Service service;



  @org.springframework.beans.factory.annotation.Autowired
  public Sbz002ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
  }

  @Log
  public ResponseEntity<Sbz002aRes> sbz002(
      @Parameter(in = ParameterIn.DEFAULT, description = "description here", required = true,
          schema = @Schema()) @Valid @RequestBody Sbz002aReq body) {
    String accept = request.getHeader("Accept");
    // if (accept != null && accept.contains("application/json")) {
    // try {
    // return new ResponseEntity<Sbz002aRes>(objectMapper.readValue("{\n \"resItem1\" : \"xx001\",\n
    // \"statusCode\" : \"0000\"\n}", Sbz002aRes.class), HttpStatus.NOT_IMPLEMENTED);
    // } catch (IOException e) {
    // log.error("Couldn't serialize response for content type application/json", e);
    // return new ResponseEntity<Sbz002aRes>(HttpStatus.INTERNAL_SERVER_ERROR);
    // }
    // }
    //
    // return new ResponseEntity<Sbz002aRes>(HttpStatus.NOT_IMPLEMENTED);


    Sbz002aRes res = service.execute(body);

    return new ResponseEntity<Sbz002aRes>(res, HttpStatus.OK);


  }

}
