package com.moea.linearList.node.impl;

import com.moea.linearList.node.Node;
/**
 * 单链表的节点定义：
 * 	element 代表该节点中的数据，即数据域；
 * 	nextNode 代表对其直接后继节点的引用，即指针域。
 * 
 * @author Administrator
 *
 */
public class SLNode implements Node {
	private Object element;
	private SLNode nextNode;
	
	//构造函数
	public SLNode(){
		
	}
	public SLNode(Object element, SLNode nextNode) {
		
		this.element = element;
		this.nextNode = nextNode;
	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return element;
	}

	@Override
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
