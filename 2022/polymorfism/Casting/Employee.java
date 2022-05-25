public class Employee{
 public String name;
 public double salary
 public Date dob;
 
 public String getDetails(){
  return "Name: " + name + "\n" +
         "Salary: " + salary + "\n";
 }
}

public class Manager extends Employee{
 public String department;
  public String getDetails(){
  return "Name: " + name + "\n" +
         "Salary: " + salary + "\n" + 
		 "Department: " + department + "\n" +
 }
}