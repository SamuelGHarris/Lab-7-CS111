/**
* CS 111 Section No. 002
* Lab Assignment 7
* @author Samuel Harris
**/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;

public class AssemblyLine {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	Queue<String> q1 = new LinkedList<String>();
	Queue<String> q2 = new LinkedList<String>();
	Stack<String> s1 = new Stack<String>();
	Iterator<String> iter = q1.iterator();
	
	int response = 0;
	Boolean value = true, brakesFound = false;
	
	while (value) {
	System.out.println("\nPick a function from the menu...\n");
	System.out.println(
			"Press 1 to add tires\n" + 
			"Press 2 to add radio\n" + 
			"Press 3 to add windows\n" + 
			"Press 4 to add brake\n" + 
			"Press 5 to add seats\n" + 
			"Press 6 to remove the front element from the assembly line\n" + 
			"Press 7 to display the items on the assembly line\n" + 
			"Press 8 to flip the order of items on the assembly line\n" + 
			"Press 9 to remove all “brakes” from the assembly line\n" + 
			"Press 0 to stop the assembly line and go home!\n" );
	
	response = input.nextInt();
	
	
	switch (response) {
	case 1:
		System.out.println("Tires added!");
		q1.add("Tires");
		break;
	case 2:
		System.out.println("Radio added!");
		q1.add("Radio");
		break;
	case 3:
		System.out.println("Windows added!");
		q1.add("Windows");
		break;
	case 4:
		System.out.println("Brakes added!");
		q1.add("Brakes");
		break;
	case 5:
		System.out.println("Seats added!");
		q1.add("Steats");
		break;
	case 6:
		q1.remove();
		System.out.println("Front element removed!");
		break;
	case 7:
		iter = q1.iterator();
		System.out.println("Current items: ");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		break;
	case 8:
		while(!q1.isEmpty()) {
			s1.push(q1.remove());
		}
		while(!s1.empty()) {
			q1.add(s1.pop());
		}
		System.out.println("The items have been flipped!");
		System.out.println("Current items: ");
		iter = q1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		break;
	case 9:
		while(!q1.isEmpty()) {
			if (!(q1.peek().equals("Brakes"))) {
				q2.add(q1.remove());
			} else if (q1.peek().equals("Brakes")) {
				q1.remove();
				brakesFound = true;
			}
		}
		q1 = q2;
		if (brakesFound) {
			System.out.println("The brakes have been removed!");
		} else if (!brakesFound) {
			System.out.println("No brakes were found!");
		}
		break;
	case 0:
		System.out.println("Goodbye!");
		value = false;
		break;
	
			}
		}
  	}
}
