import java.util.*;
public class StudentList{
	public static void main(String args[]){
	
		Scanner xd = new Scanner(System.in);
		HashMap<String, String> students = new HashMap<>();
		
		String num = " ";
		String name = " ";
		
		for (int i = 1; i <= 3; i++){
			System.out.print("Enter student number " + i + ": ");
				num = xd.next();
			System.out.print("Enter student name " + i + ": ");
				name = xd.next();
			
			students.put(num, name);
			System.out.println();
		}
		
		System.out.println("Student List:");
		for(String key : students.keySet()){
			System.out.println(key + " " + students.get(key));
		}
		
		System.out.print("\nEnter your student number: ");
			String myNum = xd.next();
		System.out.print("Enter your first name: ");
			String myName = xd.next();
		students.put(myNum, myName);
		
		System.out.println("\nStudent List:");
		for(String key : students.keySet()){
			System.out.println(key + " " + students.get(key));
		}		
		
		System.out.print("\nEnter the student number you want to delete: ");
			String del = xd.next();
			
		students.remove(del);
		
		System.out.println("\nStudent List:");
		for(String key : students.keySet()){
			System.out.println(key + " " + students.get(key));
		}	
	}
}