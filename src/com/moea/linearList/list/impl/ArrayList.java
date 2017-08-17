package com.moea.linearList.list.impl;

import com.moea.linearList.list.List;
import com.moea.linearList.strategy.Strategy;
import com.moea.linearList.strategy.impl.DefaultStrategy;

public class ArrayList<E> implements List<E> {
	private final int LEN = 8;	//数组的默认大小
	private Strategy strategy;	//数据元素的比较策略
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
	

	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++){
			if(strategy.equals(elements[i], e)) {
				return true;
			}
		}
		return false;
	}

	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++){
			if(strategy.equals(elements[i], e)){
				return i;
			}
		}
		return -1;//û�и�Ԫ�أ�����-1
	}

	public void insert(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>size)			
				throw new Exception("�±�Խ���쳣");
		//���Ԫ�ظ����������鳤�ȣ���չ����
		if(size>=elements.length) 
			expandSpace();
		//�����Ա��е�Ԫ�أ���elements[i]��ʼ���κ���һλ
		for(int j = size;j>i;j--){
			elements[j] = elements[j-1];
		}
		elements[i] = e;
		size++;
		return;
	}
	//��չ����
	private void expandSpace() {
		// TODO Auto-generated method stub
		//����һ���µ����飬������ԭ��������
		Object[] a = new Object[elements.length*2];
		//��ԭ�����е����ݴ�ŵ��µ�������
		for(int i=0;i<elements.length;i++){
			a[i] = elements[i];
		}
		//���������ָ�븳ֵ��elements
		elements = a;
	}
	
	//��Ԫ��e���뵽Ԫ��obj֮ǰ
	public boolean insertBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		//��ȡԪ��obj���±�
		int i = indexOf(obj);
		if(i<0) //i<0 ˵�����Ա���û�ж���obj
			return false;
		try {
			insert(i,e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return true;
	}

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

	public Object remove(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>size)
			throw new Exception("�±����");
		Object e = elements[i];
		for(int j=i;j<size;j++){
			elements[j] = elements[j+1];
		}
		return e;
	}

	public boolean remove(Object e) throws Exception {
		// TODO Auto-generated method stub
		int i = indexOf(e);
		if(i<0) 
			return false;
		remove(i);
		return true;
					
	}

	public Object replace(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>=size) throw new Exception("�±�Խ���쳣");
		Object obj = elements[i];
		elements[i] = e;
		return obj;
	}

	public Object get(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>=size) throw new Exception("�±�Խ���쳣");
		
		return elements[i];
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
