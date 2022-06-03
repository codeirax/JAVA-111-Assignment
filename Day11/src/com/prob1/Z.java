package com.prob1;

public interface Z  extends X,Y{
    abstract void zMethod();

	@Override
	default void defaultMethod() {
		// TODO Auto-generated method stub
		X.super.defaultMethod();
	}
}
