package eg.edu.alexu.csd.datastructure.linkedList;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DoublyLinkedList l = new DoublyLinkedList();
		//System.out.println("Empty : " + l.isEmpty() + "\nsize = " + l.size());
		//l.printList();
		
		//l.add(5);
		//l.add(20);
		//l.add(-5,20);
		//l.add("Hello world!");
		//Point x = new Point(5,5);
		//Point y  = new Point();
		//l.add(x);
		//l.add(y);
		//l.add("Manar");
		//System.out.println(((Point) l.get(3)).x);
		/*System.out.println("Empty : " + l.isEmpty() + "\nsize = " + l.size());
		l.printList();
		System.out.println();
		
		l.add(null);
		System.out.println("contains \"Manar\" : " + l.contains(x));
		l.remove(20);
		System.out.println("Empty : " + l.isEmpty() + "\nsize = " + l.size());
		l.printList();
		System.out.println();
		
		ILinkedList l2 = l.sublist(1, 4);
		l2.isEmpty();
		System.out.println(l2.size());*/
		
		/*String s = "5x^3+2x+4+";
		s = s.substring(0, s.length()-1);
		System.out.println(s);*/
		
		int[][] terms1 = {{5,3},{3,-2},{1,0},{20,9},{3,10}};
		int[][] terms2 = {{2,3},{3,-1},{1,0},{20,7},{3,10}};
		PolynomialSolver p = new PolynomialSolver();
		//p.sortpoint(terms);
		SingleLinkedList L = new SingleLinkedList();
		p.setPolynomial('a', terms1);
		p.setPolynomial('b', terms2);
		//p.arrayToList(L, terms);
		
		String s = p.print('a');
		System.out.println(s);
		String d = p.print('a');
		System.out.println(d);
		int[][] result = p.add('a', 'b');
		p.arrayToList(L, result);
		/*System.out.println(L.get(0));
		System.out.println(L.get(1));
		System.out.println(L.get(2));
		System.out.println(L.get(3));
		System.out.println(L.get(4));*/
		
	}

}
