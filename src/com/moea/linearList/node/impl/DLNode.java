package com.moea.linearList.node.impl;

import com.moea.linearList.node.Node;
/**
 * ˫������ڵ㶨�壺
 * 	element ����������
 * 	pre ����ֱ��ǰ����������
 * 	next ����ֱ�Ӷ��̽�������
 * @author Administrator
 *
 */
public class DLNode implements Node {
	private Object element;
	private DLNode pre;
	private DLNode next;
	//���캯��
	public DLNode(){
		
	}
	public DLNode(Object element, DLNode pre, DLNode next) {
		super();
		this.element = element;
		this.pre = pre;
		this.next = next;
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
