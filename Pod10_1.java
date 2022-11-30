package pod10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Pod10_1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Node head = null;
    ArrayList<Node> leafs = new ArrayList<Node>(); 
    ArrayList<String> ld = new ArrayList<String>();
    while (n != 0) {
      n--;
      String data = sc.nextLine();
      String[] d = data.split(" ");
      Node node1 = null, node2 = null, node3 = null;
      node1 = new Node(d[0]);
      if (!(d[1].equals("."))) {
        node2 = new Node(d[1]);
        node1.left = node2;
        leafs.add(node2);
        ld.add(node2.data);
      }

      if (!(d[2].equals("."))) {
        node3 = new Node(d[2]);
        node1.right = node3;
        leafs.add(node3);
        ld.add(node3.data);
      }

      if (head == null) {
        head = node1;
      } else {
    	  if(ld.contains(node1.data)) {
    		 int index = ld.indexOf(node1.data);
    		 Node tmp = leafs.get(index);
    		 if(node2!=null)
    			 tmp.left = node2;
    		 if(node3!=null)
    			 tmp.right = node3;
    		 //System.out.println("Got the data>>"+node1);
    	  }
    	  
      }

    }
//System.out.println("Pre");
preOrder(head);

System.out.println("");
inOrder(head);
System.out.println("");
postOrder(head);


  }

  public static void inOrder(Node head) {
	  if(head.left!=null)
		  inOrder(head.left);
	  System.out.print(head.data);
	  if(head.right!=null)
		  inOrder(head.right);
		  
  }
  public static void preOrder(Node head) {
	  System.out.print(head.data);
	  if(head.left!=null)
		  preOrder(head.left);
	  if(head.right!=null)
		  preOrder(head.right);
		  
  }
  public static void postOrder(Node head) {
	  if(head.left!=null)
		  postOrder(head.left);
	  if(head.right!=null)
		  postOrder(head.right);
	  System.out.print(head.data);
  }
}

class Node {
  String data;
  Node left;
  Node right;

  public Node(String d) {
    this.data = d;
    this.left = null;
    this.right = null;
  }
  
  public boolean equals(Node n) {
	  if(this.data.equals(n.data))
		  return true;
	  else return false;
  }
  
  public String toString() {
	  return this.data +" >"+this.left+" >"+this.right;
  }
}