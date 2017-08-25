package com.moea.linearList.node.impl;

import com.moea.linearList.node.Node;
/**
 * 双向链表结点
 * 	element 结点的数据域
 * 	pre 前驱结点
 * 	next 后继结点
 * @author Administrator
 *
 */
public class DLNode implements Node {
	private Object element;
	private DLNode pre;
	private DLNode next;
	//构造器
	public DLNode(){
		
	}
	public DLNode(Object element, DLNode pre, DLNode next) {
		super();
		this.element = element;
		this.pre = pre;
		this.next = next;
	}
	
	
	public Object getData() {
		// TODO Auto-generated method stub
		return element;
	}

	
	public void setData(Object e) {
		// TODO Auto-generated method stub
		element = e;
	}
	public DLNode getPre() {
		return pre;
	}
	public void setPre(DLNode pre) {
		this.pre = pre;
	}
	public DLNode getNext() {
		return next;
	}
	public void setNext(DLNode next) {
		this.next = next;
	}

}
