package com.moea.linearList.list.impl;

import com.moea.linearList.list.List;
import com.moea.linearList.strategy.Strategy;
import com.moea.linearList.strategy.impl.DefaultStrategy;

public class ArrayList<E> implements List<E> {
	private final int LEN = 8;	//默认数组长度
	private Strategy strategy;	//数据元素比较策略
	private int size;			//线性表中数据元素的个数
	private Object [] elements;	//数据元素数组
	
	//构造函数
	public ArrayList(){
		this(new DefaultStrategy());
	}
	public ArrayList(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
		size = 0;
		elements = new Object[LEN];
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++){
			if(strategy.equals(elements[i], e)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++){
			if(strategy.equals(elements[i], e)){
				return i;
			}
		}
		return -1;//没有该元素，返回-1
	}

	@Override
	public void insert(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>size)			
				throw new Exception("下标越界异常");
		//如果元素个数大于数组长度，扩展数组
		if(size>=elements.length) 
			expandSpace();
		//将线性表中的元素，从elements[i]开始依次后移一位
		for(int j = size;j>i;j--){
			elements[j] = elements[j-1];
		}
		elements[i] = e;
		size++;
		return;
	}
	//扩展数组
	private void expandSpace() {
		// TODO Auto-generated method stub
		//创建一个新的数组，长度是原来的两倍
		Object[] a = new Object[elements.length*2];
		//将原数组中的数据存放到新的数组中
		for(int i=0;i<elements.length;i++){
			a[i] = elements[i];
		}
		//将新数组的指针赋值给elements
		elements = a;
	}
	@Override
	//将元素e插入到元素obj之前
	public boolean insertBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		//获取元素obj的下标
		int i = indexOf(obj);
		if(i<0) //i<0 说明线性表中没有对象obj
			return false;
		try {
			insert(i,e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean insertAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		int i = indexOf(obj);
		if(i<0) return false;
		int index = i+1;
		try {
			insert(index,e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return true;
		
	}

	@Override
	public Object remove(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>size)
			throw new Exception("下标错误");
		Object e = elements[i];
		for(int j=i;j<size;j++){
			elements[j] = elements[j+1];
		}
		return e;
	}

	@Override
	public boolean remove(Object e) throws Exception {
		// TODO Auto-generated method stub
		int i = indexOf(e);
		if(i<0) 
			return false;
		remove(i);
		return true;
					
	}

	@Override
	public Object replace(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>=size) throw new Exception("下标越界异常");
		Object obj = elements[i];
		elements[i] = e;
		return obj;
	}

	@Override
	public Object get(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>=size) throw new Exception("下标越界异常");
		
		return elements[i];
	}

}
