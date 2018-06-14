//Raymond Valdez
import java.util.*;
import java.io.*;


public class CodingTree{
	
	 Map<Character, String> codes = new HashMap<Character, String>();
	 String bits;
	
	//decode optional

	CodingTree(String message, PrintStream out, PrintStream out2){
		
		
		//creates an array to store the frequency of characters with their corresponding character
		countFreq Arr = new countFreq(message);
		
		//creates an ArrayList of nodes
		ArrayList<Node> nodeArr = new ArrayList();
		
		
		//places the nodes into the arraylist 
		for(int i =0; i< Arr.Freq.length; i++){
		Node element = new Node(Arr.getChar(i) , Arr.getFreq(i)); //creates the node
		nodeArr.add(element); //stores the node into the array
		}
		
		
		//Sorts the arraylist
		Collections.sort(nodeArr);
		
		StringBuilder path = new StringBuilder();
		StringBuilder Map = new StringBuilder();
		
		Node ROOT = new Node();
		
		ROOT = treebuilder(nodeArr);
		
		Treetraversal(ROOT, path); //Traverses the tree and assigns the path to their respective characters
		
		out.print(codes.toString()); //prints the map
		
		encode(message, out2);
		
		//testEncode(out2); //testing the test encode and export into binary
		
		
	}	
	
	public Node treebuilder(ArrayList<Node> nodeArr){
		
		while(nodeArr.size()>2){
			Collections.sort(nodeArr);	
				
			Node element = new Node(nodeArr.remove(0), nodeArr.remove(1));
			
			nodeArr.add(element);
			}
			
			//the last two nodes do not get merged in the above while loop so I hard merge them 
			//and create the root;
			//if there is an error, it may be caused by this 
			Node root = new Node(nodeArr.remove(0), nodeArr.remove(0));
		
		return root;
	}
	
	//tree traversal traverses the tree and assigns 1's or zeros depending on the path taken
	public void Treetraversal(Node root, StringBuilder path){
		if(root == null){
			return;
		}
		
		else if(root.left == null && root.right == null){
			//root.NodeString(); //prints the node
			//System.out.println(path.toString()); //print the traversals
			root.path = path.toString(); //converts the path to a string
			
			codes.put(root.getChar(), root.path);
			
		}
		path.append('0');
		Treetraversal(root.left, path);
		path.deleteCharAt(path.length() - 1);
		
		path.append('1');
		Treetraversal(root.right, path);
		path.deleteCharAt(path.length() - 1);	
	}
	
	public void encode(String message, PrintStream out2){
		
		StringBuilder Binary = new StringBuilder(); //I like the StringBuilder method to append
		char index;
		
		
		//the corresponding ones and zeros mapped will be appended to the string Binary, based on the character key
		//within the message.
		for(int i = 0; i< message.length(); i++){
			index = message.charAt(i);
			if(codes.get(index) != null){ //if there is no mapping for the key, there will be no appending
			Binary.append(codes.get(index));
			}
		}
		
		this.bits = Binary.toString();
		StringBuilder str = new StringBuilder();
		
		
		 //this compresses the file
		for(int i =0; i< bits.length()/8; i++){
			
			int a = Integer.parseInt(bits.substring(8*i, (i+1)*8),2);
			str.append((char)a);
		}
		
		bits = str.toString();
		
		
		out2.print(bits); //compresses the string into their equivalent character.
		
	}	
	
	//testing the compression of the string of binary
	public void testEncode(PrintStream out){
		
		String s = "101010101010010101010101010101010101011010101010110101110011110"; //initial string
		String str = "";
		
		for(int i =0; i< s.length()/8; i++){
			
			int a = Integer.parseInt(s.substring(8*i, (i+1)*8),2);
			str += (char)a;
		}
		
		
		System.out.println(str);
	}
}
