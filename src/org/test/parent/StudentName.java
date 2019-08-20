package org.test.parent;

public class StudentName extends ParentClass {
	
	public void Studentperu() {
		System.out.println("name is Anand");
		
	}
public void Studentnumber() {
	System.out.println("mob no is9629881452");
	
}
public static void main(String[] args) {
	
	StudentName k = new StudentName();
	k.Studentperu();
	k.Studentnumber();
	k.Parentname();
	k.ParentId();
	
}
}