package com.qf.dp.templatemethod.example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Title: Client.java
 * @Package com.qf.dp.templatemethod.example3
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月24日 下午4:16:36
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {

		UserModel um1 = new UserModel("u1", "user1", 23);
		UserModel um2 = new UserModel("u2", "user2", 24);
		UserModel um3 = new UserModel("u3", "user3", 25);
		UserModel um4 = new UserModel("u4", "user4", 26);
		UserModel um5 = new UserModel("u5", "user5", 27);

		List<UserModel> list = new ArrayList<UserModel>();
		list.add(um1);
		list.add(um4);
		list.add(um3);
		list.add(um2);
		list.add(um5);
		System.out.println("排序前---------------------");
		printList(list);
		// 实现比较器
		Comparator<UserModel> comparator = new Comparator<UserModel>() {
			@Override
			public int compare(UserModel o1, UserModel o2) {
				// 假如实现按照年龄升序排序
				if (o1.getAge() > o2.getAge()) {
					return 1;
				} else if (o1.getAge() == o2.getAge()) {
					return 0;
				} else if (o1.getAge() < o2.getAge()) {
					return -1;
				}
				return 0;
			}

		};
		Collections.sort(list, comparator);
		System.out.println("排序后---------------------");
		printList(list);
	}

	public static void printList(List<UserModel> list) {
		list.stream().forEach(p->System.out.println(p.toString()));
	}
}
