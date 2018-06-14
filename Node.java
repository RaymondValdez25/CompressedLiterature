//Raymond Valdez
import java.util.*;


public class Node implements Comparable<Node>{
	
	String path; //if '0' then left if 1, then right
	char character;
	private int frequency;
	Node left;
	Node right;
	
	public Node(){
		//empty node, used to hold the weight of characters and their weight
			
			
	}
	
	
	
	public Node(Node node1, Node node2){
		//initialize a Node where you can store two nodes
		this.character = '$';
		
		
		this.frequency = node1.frequency + node2.frequency;
		this.left = node1;
		this.right = node2;
		
	}
	
	
	public Node(char character, int frequency){
		
		this.character = character;
		this.frequency = frequency;
		
	}
	
	
	public int compareTo(Node n){
		
		if(this.frequency < n.frequency){
			return -1;
		}
		
		else if(this.frequency > n.frequency){
			return 1;
		}
		
		return 0;
	}
	
	public void NodeString(){
		
	System.out.println("Char " + getChar() + "\tweight:" + getFreq());

	}

	public char getChar(){
		return character;
	}

	public int getFreq(){
		return frequency;
	}
	
	public void setFreq(){
		
		this.frequency = left.getFreq() + right.getFreq();
		
	}
	
	
}
