package com.moea.linearList.list;

public interface List<E> {
	//��ȡ���Ա��е�Ԫ�ظ���
	public int getSize();
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty();
	//�ж��Ƿ����Ԫ��
	public boolean contains(Object e);
	//����Ԫ�������Ա��е����
	public int indexOf(Object e);
	//��Ԫ��e���뵽���Ա��е�i��λ��
	public void insert(int i,Object e) throws Exception;
	//��Ԫ��e���뵽ָ��Ԫ��֮ǰ
	public boolean insertBefore(Object obj,Object e);
	//��Ԫ��e���뵽ָ��Ԫ��֮��
	public boolean insertAfter(Object obj,Object e);
	//ɾ�����Ա������Ϊi��Ԫ�أ����������Ԫ��
	public Object remove(int i) throws Exception;
	//ɾ�����Ա��еĵ�һ����e��ͬ��Ԫ��
	public boolean remove(Object e) throws Exception;
	//�滻���Ա��еĵ�i��Ԫ��Ϊe�������ر��滻��Ԫ��
	public Object replace(int i,Object e) throws Exception;
	//�������Ա������Ϊi��Ԫ��
	public Object get(int i) throws Exception;
	
}
