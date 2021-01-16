package io.swagger.service;

public interface SbzService<I,O,P,R> {
	public default  O execute (I in) {
		P param = beforeDelegate(in);
		R result = delegate(param);
		O out = afterDelegate(result);
		return out;
	};

	public P beforeDelegate(I in);
	public R delegate(P param);
	public O afterDelegate(R result);

}
