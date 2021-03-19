package io.swagger.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import io.swagger.client.sv_b.ApiException;
import io.swagger.client.sv_b.api.SampleBizSvBApi;
import io.swagger.client.sv_b.model.Sbz002bReq;
import io.swagger.client.sv_b.model.Sbz002bRes;
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

    Sbz002bReq req = new Sbz002bReq();
    req.setUserid(in.getReqItem1());

    return req;
  }

  @Override
  public Sbz002bRes delegate(Sbz002bReq param) {

    try {
      Sbz002bRes res = bApi.sbz002(param);

      BindingResult br = new DataBinder(res).getBindingResult();
      validator.validate(res ,br);
      if (br.hasErrors()) {
        throw new RuntimeException(br.toString());
      }

      return res;

    } catch (ApiException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Sbz002aRes afterDelegate(Sbz002bRes result) {

    Sbz002aRes out = mapper.map(result, Sbz002aRes.class);

    return out;
  }

}
