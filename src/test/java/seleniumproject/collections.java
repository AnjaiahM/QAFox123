package seleniumproject;

import java.util.Iterator;
import java.util.LinkedList;

public class collections {
public static void main(String[] args) {
	collections c=new collections();
	c.list();
}
	public void list() {
		LinkedList<Student> stu=new LinkedList<Student>();
		stu.add(new Student(10));
		stu.add(new Student(15));
		stu.add(new Student(23));
		
		Iterator it=stu.iterator();
		while(it.hasNext()) {
			it.next();
		}
		
	}
	
}
