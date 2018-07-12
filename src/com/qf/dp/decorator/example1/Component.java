package com.qf.dp.decorator.example1;

import java.util.Date;

/**   
* @Title: Component.java 
* @Package com.qf.dp.decorator.example1 
* @Description: 计算奖金接口
* @author haichangzhang   
* @date 2018年7月12日 下午4:43:34 
* @version V1.0   
*/
public abstract class Component {

	
    /** 
     * 计算某人在某段时间内的奖金，有些参数在演示中并不会使用， 
     * 但是在实际业务实现上是会用的，为了表示这是个具体的业务方法， 
     * 因此这些参数被保留了 
     * @param user 被计算奖金的人员 
     * @param begin 计算奖金的开始时间 
     * @param end 计算奖金的结束时间 
     * @return 某人在某段时间内的奖金 
     */  
	public abstract double calcPrize(String user,Date begin, Date end);
}
