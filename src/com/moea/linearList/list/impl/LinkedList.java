package com.moea.linearList.list.impl;

import com.moea.linearList.list.List;
import com.moea.linearList.node.impl.SLNode;
import com.moea.linearList.strategy.Strategy;

public class LinkedList<E> implements List<E> {

	private Strategy strategy;	//数据元素比较策略
	private SLNode head;		//单链表头节点的引用
	private int size;			//线性表中数据元素的个数
	
	//获取数据元素e的前驱结点
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
	//获取序号为 0<=i<size的元素所在结点的前驱结点 
	public SLNode getPreNode(int i){
		SLNode p = head;
		for(;i>0;i--){
			p = p.getNextNode();
		}
		return p;
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
		SLNode p = head.getNextNode();
		while(p!=null){
			if(strategy.equals(e, p.getData()))
				return true;
			else p = p.getNextNode();
		}
		return false;
	}

	@Override
	//返回元素在链表中的下标
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

	@Override
	//将数据元素插入到线性表中下标为i的位置
	public void insert(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 让i的前驱结点指向新加的节点,新节点指向原来的节点i
		 */
		if(i<0||i>size) 
			throw new Exception("下标异常");
		SLNode p = getPreNode(i);
		SLNode q = new SLNode(e, p.getNextNode());
		p.setNextNode(q);
		size++;
		
	}

	@Override
	public boolean insertBefore(Object obj, Object e) {
		// 将元素e插入到元素object前面
		SLNode p = getPreNode(obj);
		if(p!=null){
			SLNode q = new SLNode(e, p.getNextNode());
			p.setNextNode(q);
			size++;
			return true;
		}
		return false;
	}

	@Override
	public boolean insertAfter(Object obj, Object e) {
		// 将元素e插入到元素object后面
		SLNode p = getPreNode(obj).getNextNode();
		if(p!=null){
			SLNode q = new SLNode(e,p.getNextNode());
			p.setNextNode(q);
			size++;
			return true;
		}
		return false;
	}

	@Override
	public Object remove(int i) throws Exception {
		// 让i的前驱结点p指向i的后继结点
		SLNode p = getPreNode(i);
		SLNode q = p.getNextNode();
		p.setNextNode(q.getNextNode());
		return q.getData();
	}

	@Override
	public boolean remove(Object e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object replace(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object get(int i) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
