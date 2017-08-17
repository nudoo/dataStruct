package com.moea.linearList.list.impl;

import com.moea.linearList.list.List;
import com.moea.linearList.node.impl.SLNode;
import com.moea.linearList.strategy.Strategy;

public class LinkedList<E> implements List<E> {

	private Strategy strategy;	//����Ԫ�رȽϲ���
	private SLNode head;		//������ͷ�ڵ������
	private int size;			//���Ա�������Ԫ�صĸ���
	
	//��ȡ����Ԫ��e��ǰ�����
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
	//��ȡ���Ϊ 0<=i<size��Ԫ�����ڽ���ǰ����� 
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
	//����Ԫ���������е��±�
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
	//������Ԫ�ز��뵽���Ա����±�Ϊi��λ��
	public void insert(int i, Object e) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * ��i��ǰ�����ָ���¼ӵĽڵ�,�½ڵ�ָ��ԭ���Ľڵ�i
		 */
		if(i<0||i>size) 
			throw new Exception("�±��쳣");
		SLNode p = getPreNode(i);
		SLNode q = new SLNode(e, p.getNextNode());
		p.setNextNode(q);
		size++;
		
	}

	@Override
	public boolean insertBefore(Object obj, Object e) {
		// ��Ԫ��e���뵽Ԫ��objectǰ��
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
		// ��Ԫ��e���뵽Ԫ��object����
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
		// ��i��ǰ�����pָ��i�ĺ�̽��
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
