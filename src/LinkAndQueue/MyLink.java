package LinkAndQueue;

/*
*设计链表
* @author Shaun
 */



public class MyLink {
    Node head =null;

    class Node{
        Node next = null;
        int data;

        public Node(int data){
            this.data=data;
        }
    }
    /*
    向链表中插入数据
     */
    public void addNode(int d){
        Node newNode =new Node(d);//实例化第一个节点
        if(head==null){
            head =newNode;
            return;
        }
        Node tmp =head;
        while (tmp.next!=null){
            tmp =tmp.next;
        }
        tmp.next=newNode;
    }
    /*
    index :删除第index个节点
     */
    public boolean deleteNode(int index){
        if (index<1 || index> length()){
            return false;
        }
        if (index==1){
            head =head.next;
            return true;
        }
        int i=1;
        Node preNode =head;
        Node curNode =preNode;
        while(curNode!=preNode){
            if(i==index){
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }
    /*
        返回节点长度
     */
    public int length(){
        int length=0;
        Node tmp =head;
        while(tmp!=null){
            length++;
            tmp=tmp.next;
        }
        return length;
    }
    /*
    在不知道头指针的情况下删除指定节点
     */
    public boolean deleteNode11(Node n){
        if (n==null|| n.next==null)
            return false;
        int tmp =n.data;
        n.data =n.next.data;
        n.next.data=tmp;
        n.next=n.next.next;
        System.out.println("删除成功");
        return true;
    }

    public void printList(){
        Node tmp =head;
        while (tmp !=null){
            System.out.println(tmp.data);
            tmp =tmp.next;
        }
    }
    /*
    链表进行反转
    ??????????怎么定义Node head
     */
    public Node ReverseIteratively(Node head){
        Node pReverseHead =head;
        Node pNode = head;
        Node pPrev =null;
        while (pNode != null){
            Node pNext =pNode.next;
            if (pNext==null){
                pReverseHead = pNode;
            }
            pNode.next=pPrev;
            pPrev=pNode;
            pNode=pNext;
        }
        this.head=pReverseHead;
        return this.head;
    }
    /*
    查找链表中间节点
     */
public Node SearchHead(Node head){
    Node p =this.head,q = this.head;
    while(p!= null&&p.next!=null&&p.next.next!=null){
        p=p.next.next;
        q=q.next;
    }
    System.out.println("Mid"+q.data);
    return q;


}
    public static void main(String[] args) {
        MyLink list = new MyLink();
        list.addNode(5);
        Node head = list.head;
        list.addNode(2);
        list.addNode(3);
        list.addNode(7);
        list.addNode(432);
        list.addNode(45);
        System.out.println("Link length"+list.length());
        System.out.println("head.data"+list.head.data);
        list.printList();
        list.deleteNode(4);
        System.out.println("After deleNode(4):");
        list.printList();
        /*
        System.out.println("djkj");
        Node ReverseIteratively(Node(1));
        list.printList();
         */

    }
}
