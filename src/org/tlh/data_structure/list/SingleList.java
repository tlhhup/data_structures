package org.tlh.data_structure.list;

/**
 * 单链表
 * @author hp
 *
 */
public class SingleList {

	public void remoteList(Node headNote){
		Node currentNode,iterator=headNote;
		while(iterator!=null){
			currentNode=iterator.next;
			//释放当前节点
			iterator=null;
			iterator=currentNode;
		}
	}
	
	public Node delete(Node headNode, int position) {
		// 插入位置不合法
		if (position < 1 || position > (length(headNode) + 1)) {
			return headNode;
		}
		if(position==1){//如果删除的是表头
			return headNode;
		}else{
			Node previousNode = headNode;
			int count = 1;
			while (count < position - 1) {// 查找删除的位置的前驱
				count++;
				previousNode = previousNode.next;
			}
			Node currentNode = previousNode.next;// 获取删除的位置的节点
			//修改删除位置的前驱的后继为删除元素的后继
			previousNode.next=currentNode.next;
			//释放删除节点
			currentNode=null;
		}
		return headNode;
	}

	public Node insert(Node headNode, Node insertNode, int position) {
		if (headNode == null) {// 如果是空表
			return insertNode;
		}
		// 插入位置不合法
		if (position < 1 || position > (length(headNode) + 1)) {
			return headNode;
		}
		if (position == 1) {// 表头
			insertNode.next = headNode;
			return insertNode;
		} else {
			Node previousNode = headNode;
			int count = 1;
			while (count < position - 1) {// 查找插入的位置的前驱
				count++;
				previousNode = previousNode.next;
			}
			Node currentNode = previousNode.next;// 获取插入的位置的节点
			// 将插入节点的前驱的后继修改为插入的节点
			previousNode.next = insertNode;
			// 将插入节点的后继修改为当前节点
			insertNode.next = currentNode;
		}
		return headNode;
	}

	/**
	 * 获取链表的长度
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
