package io.swagger.service.impl;

import org.springframework.stereotype.Service;

import io.swagger.model.Sbz001aReq;
import io.swagger.model.Sbz001aRes;
import io.swagger.service.Sbz001Service;

@Service
public class Sbz001ServiceImpl implements Sbz001Service {

	@Override
	public Sbz001aRes execute(Sbz001aReq in) {
		String reqItem1 = in.getReqItem1();
		Sbz001aRes res = new Sbz001aRes();
		int len = reqItem1.length();

		res.setResItem1(reqItem1.substring(len - 1, len) + "_RS");
		res.setStatusCode("0000");

		return res;
	}

}
