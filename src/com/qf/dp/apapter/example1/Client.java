package com.qf.dp.apapter.example1;

/**
 * @Title: Client.java
 * @Package com.qf.dp.apapter
 * @Description: 对象适配器
 * @author haichangzhang
 * @date 2017年7月20日 下午3:23:53
 * @version V1.0
 */
public class Client {

	/*
	 * 鸭子和火鸡有相似之处，他们都会飞，虽然飞的不远，他们不太一样的地方就是叫声不太一样，现在我们有一个火鸡的类，
	 * 有鸭子的抽象类也就是接口。我们的适配器继承自鸭子类并且保留了火鸡的引用，重写鸭子的飞和叫的方法，
	 * 但是是委托给火鸡的方法来实现的。在客户端中，我们给适配器传递一个火鸡的对象，就可以把它当做鸭子来使用了。
	 */

	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAapter(turkey);
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		System.out.println("\n The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
