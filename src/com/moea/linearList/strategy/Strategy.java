package com.moea.linearList.strategy;

public interface Strategy {

	//判断两个元素是否相等
	public boolean equals(Object obj1,Object obj2);
	
	/**
	 * 比较两个元素的大小：
	 * 如果obj1>obj2 返回1
	 * 如果obj1=obj2 返回0
	 * 若果obj1<obj2 返回-1
	 */
	public int compare(Object obj1,Object obj2);
}
