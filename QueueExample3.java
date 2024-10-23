package Learncollection;

import java.util.LinkedList;

public class QueueExample3 {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.addLast(50);
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		list.addFirst(12);
		System.out.println(list);
		
		System.out.println("---------------------------");
		
		
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("---------------------------");
		list.removeLast();
		System.out.println(list);
		
		System.out.println("---------------------------");
		
		System.out.println(list.getFirst());
		
		System.out.println("---------------------------");
		
		System.out.println(list.getLast());
		
		
	}

}
