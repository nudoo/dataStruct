package com.moea.linearList.list;

public interface List<E> {
	//返回线性表的大小，即数据元素的个数
	public int getSize();
	//判断是否为空
	public boolean isEmpty();
	//线性表是否包含元素e
	public boolean contains(Object e);
	//元素e在线性表中的序号
	public int indexOf(Object e);
	//将元素e插入到线性表中位置i 
	public void insert(int i,Object e) throws Exception;
	//将元素e插入到元素obj之前
	public boolean insertBefore(Object obj,Object e);
	//将元素e插入到元素obj之后
	public boolean insertAfter(Object obj,Object e);
	//移除下标为i的元素
	public Object remove(int i) throws Exception;
	//移除元素e
	public boolean remove(Object e) throws Exception;
	//将第i个元素替换为元素e
	public Object replace(int i,Object e) throws Exception;
	//获取线性表中第i个元素
	public Object get(int i) throws Exception;
	
}
