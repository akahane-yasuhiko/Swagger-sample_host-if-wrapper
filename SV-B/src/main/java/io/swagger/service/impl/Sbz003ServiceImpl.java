package io.swagger.service.impl;

import org.springframework.stereotype.Service;
import io.swagger.model.Sbz003bReq;
import io.swagger.model.Sbz003bRes;
import io.swagger.model.Sbz003bRes0000;
import io.swagger.model.Sbz003bRes0001;
import io.swagger.service.Sbz003Service;

@Service
public class Sbz003ServiceImpl implements Sbz003Service {

	@Override
	public Sbz003bRes execute(Sbz003bReq in) {
		String reqItem1 = in.getReqItem1();
		if (reqItem1.startsWith("0")) {
			Sbz003bRes0000 res = new Sbz003bRes0000();
			res.setResItem1("003sv");
			res.setStatusCode("0000");
			return res;

		} else {
			Sbz003bRes0001 res = new Sbz003bRes0001();
			res.setStatusCode("0001");
			return res;
		}
	}

}
