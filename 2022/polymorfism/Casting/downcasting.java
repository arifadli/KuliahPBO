//Parent class  
class Parent {   
    String name;   
    
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Child extends Parent {   
    int age;       
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
class Downcasting{  
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "Ari Fadli";   
        Child c = (Child)p;       
        c.age = 36;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }   
}  