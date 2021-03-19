package io.swagger.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.springframework.stereotype.Service;
import io.swagger.model.Sbz003cReq;
import io.swagger.model.Sbz003cRes;
import io.swagger.model.Sbz003cRes0000;
import io.swagger.model.Sbz003cRes2001;
import io.swagger.model.Sbz003cRes2002;
import io.swagger.model.Sbz003cRes9999;
import io.swagger.service.Sbz003Service;

@Service
public class Sbz003ServiceImpl implements Sbz003Service {

	private Map<String, String> reqSttMap;
	private Map<String, Function<String, ? extends Sbz003cRes>> sttResMap;

	Sbz003ServiceImpl() {
		reqSttMap = createReqSttMap();

		sttResMap = createSttResMap();

	}

	private Map<String, String> createReqSttMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("0", "0000");
		map.put("1", "2001");
		map.put("2", "2002");
		return map;
	}

	private Map<String, Function<String, ? extends Sbz003cRes>> createSttResMap() {
		Map<String, Function<String, ? extends Sbz003cRes>> map = new HashMap<String, Function<String, ? extends Sbz003cRes>>();

		Function<String, Sbz003cRes0000> res0000 = (in) -> {
			Sbz003cRes0000 out = new Sbz003cRes0000();
			out.setStatusCode("0000");
			out.setResItem1(in + "_RES");
			return out;
		};
		map.put("0000", res0000);

		Function<String, Sbz003cRes2001> res2001 = (in) -> {
			Sbz003cRes2001 out = new Sbz003cRes2001();
			out.setStatusCode("2001");
			out.setResItem2001(in.substring(0, 1) + "_RES");
			return out;
		};
		map.put("2001", res2001);

		Function<String, Sbz003cRes2002> res2002 = (in) -> {
			Sbz003cRes2002 out = new Sbz003cRes2002();
			out.setStatusCode("2002");
			out.setResItem2002(in.substring(0, 1) + "__RES");
			return out;
		};
		map.put("2002", res2002);

		Function<String, Sbz003cRes9999> res9999 = (in) -> {
			Sbz003cRes9999 out = new Sbz003cRes9999();
			out.setStatusCode("9999");
			return out;
		};
		map.put("9999", res9999);

		return map;

	}


	@Override
	public Sbz003cRes execute(Sbz003cReq in) {
		String reqChar = in.getReqItem2().substring(in.getReqItem2().length()-1);

		// ステータス判定
		String status = reqSttMap.getOrDefault(reqChar, "9999");

		// ステータスに合致するDTO生成処理を取得
		Function<String, ? extends Sbz003cRes> func = sttResMap.get(status);

		return func.apply(reqChar);

	}

}
