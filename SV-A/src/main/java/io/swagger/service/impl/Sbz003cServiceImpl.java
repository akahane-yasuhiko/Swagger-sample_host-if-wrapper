package io.swagger.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;
import io.swagger.client.sv_c.ApiException;
import io.swagger.client.sv_c.api.SampleBizSvCApi;
import io.swagger.client.sv_c.model.Sbz003cReq;
import io.swagger.client.sv_c.model.Sbz003cRes;
import io.swagger.model.Sbz003aReq;
import io.swagger.model.Sbz003aRes;
import io.swagger.service.Sbz003cService;

@Service
public class Sbz003cServiceImpl implements Sbz003cService {
  @Autowired
  Mapper mapper;

  @Autowired
  SampleBizSvCApi bApi;

  @Autowired
  Validator validator;

  @Override
  public Sbz003cReq beforeDelegate(Sbz003aReq in) {
    return mapper.map(in, Sbz003cReq.class);
  }

  @Override
  public Sbz003cRes delegate(Sbz003cReq param) {
    try {
      Sbz003cRes res = bApi.sbz003(param);

      System.out.println(res);

      return res;
    } catch (ApiException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public Sbz003aRes afterDelegate(Sbz003cRes result) {
    return mapper.map(result, Sbz003aRes.class);
  }

}
