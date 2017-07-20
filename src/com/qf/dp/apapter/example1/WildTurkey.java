package com.qf.dp.apapter.example1;

/**
 * @Title: WildTurkey.java
 * @Package com.qf.dp.apapter
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午3:20:14
 * @version V1.0
 */
public class WildTurkey extends Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");

	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");

	}

}
