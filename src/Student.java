import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Student implements Comparable<Student>{
	private String name;
	private int no;
	private int age;
	public Student(int i, String string, int j) {
		no=i;
		name=string;
		age=j;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public static void main(String args[]) {
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(101,"Kim",21);
		al.add(s1);
		Student s2=new Student(102,"An",43);
		al.add(s2);
		Student s3=new Student(103,"Jo",45);
		al.add(s3);
		Student s4=new Student(104,"Home",28);
		al.add(s4);
		Student s5=new Student(105,"Jeong",33);
		al.add(s5);
		Student s6=new Student(106,"Jhon",13);
		al.add(s6);
		Student s7=new Student(107,"Na",30);
		al.add(s7);
		Student s8=new Student(108,"Jae",53);
		al.add(s8);
		Student s9=new Student(109,"Park",29);
		al.add(s9);
		Student s10=new Student(110,"Lee",32);
		al.add(s10);
		
		Collections.sort(al);
		for(Student s:al) {
			System.out.println(s.toString());
		}
		System.out.println("Stuent List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", age=" + age + "]";
	}
}
