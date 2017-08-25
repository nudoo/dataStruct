package com.moea.linearList.node.impl;

import com.moea.linearList.node.Node;
/**
 * 单向链表结点
 * element 数据域
 * nextNode 指针域
 * 
 * @author moea
 */
public class SLNode implements Node {
	private Object element;
	private SLNode nextNode;
	
	//构造方法
	public SLNode(){
		
	}
	public SLNode(Object element, SLNode nextNode) {
		
		this.element = element;
		this.nextNode = nextNode;
	}

	public Object getData() {
		// TODO Auto-generated method stub
		return element;
	}

	public void setData(Object e) {
		// TODO Auto-generated method stub
		element = e;
	}
	public SLNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(SLNode nextNode) {
		this.nextNode = nextNode;
	}

}
