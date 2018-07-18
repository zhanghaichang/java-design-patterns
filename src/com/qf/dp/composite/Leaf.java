package com.qf.dp.composite;

/**
 * @Title: Leaf.java
 * @Package com.qf.dp.composite
 * @Description: 树叶构件角色类
 * @author haichangzhang
 * @date 2018年7月13日 下午4:27:08
 * @version V1.0
 */
public class Leaf extends Component {

	/**
	 * 叶子对象的名字
	 */
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

    /**
     * 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "-" + name);

	}

}
