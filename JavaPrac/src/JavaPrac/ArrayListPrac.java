package JavaPrac;

import java.util.*;
class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}  

class ArrayListPrac{
 public static void main(String args[]){
 Student s1=new Student(101,"Sonoo",23);  
  Student s2=new Student(102,"Ravi",21);  
  Student s3=new Student(103,"Hanumat",25);
  System.out.println("Created the stu list");
  List< Student> stu = new ArrayList<Student>();
 stu.add(s1);
 stu.add(s2);
 for (Object str:stu)
 {
 	  if (str instanceof Student) {
 		   System.out.println(((Student) str).age+((Student) str).name+((Student)str).rollno);
 		
 	}
 	  else
    System.out.println(str);
 }
 System.out.println("Created al list");
  List<Object> al=new ArrayList<Object>();
  al.add("Ravi");
  al.add("Vijay");
  al.add(1223);
  al.add("Ravi");
al.add(s2);
al.add("#$@$I@");
  al.add("Ajay");
  al.addAll(stu);
 
 for (Object str:al)
{
	  if (str instanceof Student) {
		   System.out.println(((Student) str).age+((Student) str).name+((Student)str).rollno);
		
	}
	  else
   System.out.println(str);
}
 System.out.println("removed the stu object collection");
 al.removeAll(stu);
  for (Object str:al)
 {
 	  if (str instanceof Student) {
 		   System.out.println(((Student) str).age+((Student) str).name+((Student)str).rollno);
 		
 	}
 	  else
    System.out.println(str);
 }
  
 System.out.println("cleared the al list");
 al.clear();
 for (Object str:al)
 {
 	  if (str instanceof Student) {
 		   System.out.println(((Student) str).age+((Student) str).name+((Student)str).rollno);
 		
 	}
 	  else
    System.out.println(str);
 }
 

   }
}

