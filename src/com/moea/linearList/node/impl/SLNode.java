package com.moea.linearList.node.impl;

import com.moea.linearList.node.Node;
/**
 * ������Ľڵ㶨�壺
 * 	element ����ýڵ��е����ݣ���������
 * 	nextNode �������ֱ�Ӻ�̽ڵ�����ã���ָ����
 * 
 * @author Administrator
 *
 */
public class SLNode implements Node {
	private Object element;
	private SLNode nextNode;
	
	//���캯��
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
