package com.qf.dp.apapter.example1;

/**
 * @Title: TurkeyAapter.java
 * @Package com.qf.dp.apapter
 * @Description: 用火鸡冒充鸭子
 * @author haichangzhang
 * @date 2017年7月20日 下午3:15:59
 * @version V1.0
 */
public class TurkeyAapter extends Duck {

	private Turkey turkey;

	public TurkeyAapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}

}
