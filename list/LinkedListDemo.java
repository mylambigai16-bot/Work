package list;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <String> list=new LinkedList<String>();
		System.out.println("Array size:"+list.size());
		list.add("M");
		list.add("Y");
		list.add("L");
		list.add("U");
		list.add(" ");
		System.out.println("OriginalLinkedList: "+list);
		list.remove(3);
		list.remove(" ");
		System.out.println("After changes: "+list);
		
	}

}
