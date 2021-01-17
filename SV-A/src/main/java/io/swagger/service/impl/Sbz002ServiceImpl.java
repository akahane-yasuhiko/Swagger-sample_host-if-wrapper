package io.swagger.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import io.swagger.client.sv_b.ApiException;
import io.swagger.client.sv_b.api.SampleBizSvBApi;
import io.swagger.client.sv_b.model.OneOfinlineResponse200;
import io.swagger.client.sv_b.model.Sbz002bReq;
import io.swagger.client.sv_b.model.Sbz002bRes0000;
import io.swagger.model.Sbz002aReq;
import io.swagger.model.Sbz002aRes;
import io.swagger.service.Sbz002Service;

@Service
public class Sbz002ServiceImpl implements Sbz002Service {
  @Autowired
  Mapper mapper;

  @Autowired
  SampleBizSvBApi bApi;

  @Autowired
  Validator validator;

  @Override
  public Sbz002bReq beforeDelegate(Sbz002aReq in) {

    Sbz002bReq req = mapper.map(in, Sbz002bReq.class);

    return req;
  }

  @Override
  public OneOfinlineResponse200 delegate(Sbz002bReq param) {

    try {
      OneOfinlineResponse200 res = bApi.sbz002(param);

      BindingResult br = new DataBinder(res).getBindingResult();

      if (res instanceof Sbz002bRes0000) {
        Sbz002bRes0000 sbz002bRes0000 = (Sbz002bRes0000)res;
        validator.validate(sbz002bRes0000, br);
        if (br.hasErrors()) {
          throw new RuntimeException(br.toString());
        }

      }

      return res;

    } catch (ApiException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Sbz002aRes afterDelegate(OneOfinlineResponse200 result) {

    Sbz002aRes out = mapper.map(result, Sbz002aRes.class);

    return out;
  }

}
