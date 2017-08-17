package com.moea.linearList.list;

public interface List<E> {
	//获取线性表中的元素个数
	public int getSize();
	//判断是否为空
	public boolean isEmpty();
	//判断是否包含元素
	public boolean contains(Object e);
	//返回元素在线性表中的序号
	public int indexOf(Object e);
	//将元素e插入到线性表中的i号位置
	public void insert(int i,Object e) throws Exception;
	//将元素e插入到指定元素之前
	public boolean insertBefore(Object obj,Object e);
	//将元素e插入到指定元素之后
	public boolean insertAfter(Object obj,Object e);
	//删除线性表中序号为i的元素，并返回这个元素
	public Object remove(int i) throws Exception;
	//删除线性表中的第一个与e相同的元素
	public boolean remove(Object e) throws Exception;
	//替换线性表中的第i个元素为e，并返回被替换的元素
	public Object replace(int i,Object e) throws Exception;
	//返回线性表中序号为i的元素
	public Object get(int i) throws Exception;
	
}
