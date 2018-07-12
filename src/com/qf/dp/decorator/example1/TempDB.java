package com.qf.dp.decorator.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: TempDB.java
 * @Package com.qf.dp.decorator.example1
 * @Description: TODO
 * @author haichangzhang
 * @date 2018年7月12日 下午4:52:19
 * @version V1.0
 */
public class TempDB {

	private TempDB() {

	}

	public static Map<String, Double> mapMonthSaleMoney = new HashMap<>();

	static {
		mapMonthSaleMoney.put("张三", 10000.0);
		mapMonthSaleMoney.put("李四", 20000.0);
		mapMonthSaleMoney.put("王五", 30000.0);
	}
}
