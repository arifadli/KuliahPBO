public class One 
{ 
  void m1() 
  { 
     System.out.println("m1 method in class One"); 
   } 
 } 
 public class Two extends One 
 { 
   void m2() 
   { 
      System.out.println("m2 method in class Two"); 
    } 
 } 
public class Test 
{ 
  public static void main(String[] args) 
  { 
     One o = new Two(); // Super class reference refers to sub class object. 
     Two t = (Two)o; // Converting super class reference type into sub class reference type. 
      t.m1(); // Calling m1 method using reference variable of sub class. 
      t.m2(); // Calling m1 method using reference variable of sub class. 
   } 
 }