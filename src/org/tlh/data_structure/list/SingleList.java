package org.tlh.data_structure.list;

/**
 * ������
 * @author hp
 *
 */
public class SingleList {

	public void remoteList(Node headNote){
		Node currentNode,iterator=headNote;
		while(iterator!=null){
			currentNode=iterator.next;
			//�ͷŵ�ǰ�ڵ�
			iterator=null;
			iterator=currentNode;
		}
	}
	
	public Node delete(Node headNode, int position) {
		// ����λ�ò��Ϸ�
		if (position < 1 || position > (length(headNode) + 1)) {
			return headNode;
		}
		if(position==1){//���ɾ�����Ǳ�ͷ
			return headNode;
		}else{
			Node previousNode = headNode;
			int count = 1;
			while (count < position - 1) {// ����ɾ����λ�õ�ǰ��
				count++;
				previousNode = previousNode.next;
			}
			Node currentNode = previousNode.next;// ��ȡɾ����λ�õĽڵ�
			//�޸�ɾ��λ�õ�ǰ���ĺ��Ϊɾ��Ԫ�صĺ��
			previousNode.next=currentNode.next;
			//�ͷ�ɾ���ڵ�
			currentNode=null;
		}
		return headNode;
	}

	public Node insert(Node headNode, Node insertNode, int position) {
		if (headNode == null) {// ����ǿձ�
			return insertNode;
		}
		// ����λ�ò��Ϸ�
		if (position < 1 || position > (length(headNode) + 1)) {
			return headNode;
		}
		if (position == 1) {// ��ͷ
			insertNode.next = headNode;
			return insertNode;
		} else {
			Node previousNode = headNode;
			int count = 1;
			while (count < position - 1) {// ���Ҳ����λ�õ�ǰ��
				count++;
				previousNode = previousNode.next;
			}
			Node currentNode = previousNode.next;// ��ȡ�����λ�õĽڵ�
			// ������ڵ��ǰ���ĺ���޸�Ϊ����Ľڵ�
			previousNode.next = insertNode;
			// ������ڵ�ĺ���޸�Ϊ��ǰ�ڵ�
			insertNode.next = currentNode;
		}
		return headNode;
	}

	/**
	 * ��ȡ����ĳ���
	 * 
	 * @param headNode
	 * @return
	 */
	public int length(Node headNode) {
		int length = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			length++;
			currentNode = headNode.next;
		}
		return length;
	}

	public final class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
