package io.swagger.service;

public interface SbzService<I, O> {
	public O execute(I in);
}
