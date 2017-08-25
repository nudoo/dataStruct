package com.moea.linearList.list.impl;

import com.moea.linearList.list.List;
import com.moea.linearList.node.impl.SLNode;
import com.moea.linearList.strategy.Strategy;

public class LinkedList<E> implements List<E> {

	private Strategy strategy;	//对象比较策略
	private SLNode head;		//头结点
	private int size;			//链表长度
	
	//得到元素的前驱结点
	public SLNode getPreNode(Object e){
		SLNode p = head;
		while(p.getNextNode()!=null){
			if(strategy.equals(p.getNextNode().getData(), e)){ 
				return p;
			}else {
				p = p.getNextNode();
			}
		}
		return null;
	}
	//第i个元素的前驱结点
	public SLNode getPreNode(int i){
		SLNode p = head;
		for(;i>0;i--){
			p = p.getNextNode();
		}
		return p;
	}
	//获取序号为i的元素所在节点（0<=i<size)
	public SLNode getNode(int i){
		SLNode p = getPreNode(i).getNextNode();
		return p;
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		SLNode p = head.getNextNode();
		while(p!=null){
			if(strategy.equals(e, p.getData()))
				return true;
			else p = p.getNextNode();
		}
		return false;
	}

	
	//获取元素e在线性表中的序号
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		SLNode p = head.getNextNode();
		int index = 0;
		while(p!=null){
			if(strategy.equals(e, p)){
				return index;
			}else{
				index++;
				p = p.getNextNode();
			}
		}
		return -1;
	}

	
	//将数据元素e插入到线性表中i号位置
	public void insert(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		/**
		 *i>=0&&i<=size
		 *		 
		 */
		if(i<0||i>size) 
			throw new Exception("下标越界");
		SLNode p = getPreNode(i);
		SLNode q = new SLNode(e, p.getNextNode());
		p.setNextNode(q);
		size++;
		
	}

	public boolean insertBefore(Object obj, Object e) {
		// 将数据元素e插入到数据元素obj之前
		SLNode p = getPreNode(obj);
		if(p!=null){
			SLNode q = new SLNode(e, p.getNextNode());
			p.setNextNode(q);
			size++;
			return true;
		}
		return false;
	}

	public boolean insertAfter(Object obj, Object e) {
		// 将数据元素e插入到数据元素obj之后
		SLNode p = getPreNode(obj).getNextNode();
		if(p!=null){
			SLNode q = new SLNode(e,p.getNextNode());
			p.setNextNode(q);
			size++;
			return true;
		}
		return false;
	}

	public Object remove(int i) throws Exception {
		// 删除线性表中序号为i的元素，并返回这个元素
		SLNode p = getPreNode(i);
		SLNode q = p.getNextNode();
		p.setNextNode(q.getNextNode());
		return q.getData();
	}

	public boolean remove(Object e) throws Exception {
		// 删除线性表中第一个与e相同的元素
		SLNode p = getPreNode(e);
		if(p!=null){
			SLNode q = p.getNextNode();
			p.setNextNode(q.getNextNode());
			size--;
			return true;
		}
		return false;
	}

	public Object replace(int i, Object e) throws Exception {
		// 替换线性表中序号为i的元素为e，返回原来的数据元素
		if (i<0||i>size) {
			System.out.println("错误，下标越界");
		}
		SLNode p = getPreNode(i).getNextNode();
		Object old = p.getData();
		p.setData(e);
		
		return old;
	}

	public Object get(int i) throws Exception {
		// 返回线性表中序号为i的数据元素
		if(i<0||i>=size){
			System.out.println("错误，下标越界");
		}
		Object e = getPreNode(i).getNextNode().getData();
		return e;
	}

}
