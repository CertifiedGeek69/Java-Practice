

public class Oops {
    int abc=10;
    public static void main(String[] args) throws Exception {
        //Polymorphism
        Animals a=new Animals();
        Cat c=new Cat();
        Dog d=new Dog();
        a.animalSound();
        c.animalSound();
        d.animalSound();

        //Inner class
        OuterClass o=new OuterClass();
        OuterClass.InnerClass i=o.new InnerClass();
        //OuterClass.StaticInnerClass sc=new OuterClass.StaticInnerClass();
        
        System.out.println(o.x);
        
        
        System.out.println(i.innerMethod());

        //enum access
        Enum myvar=Enum.Constant;
        System.out.println(myvar);
    }
}
//ABSTRACTION - hiding internal details of an application the outer world
//ABSTRACT CLASS CANNOT HAVE OBJECT
//ABSTRACT CLASS CANNOT BE SEALED
abstract class Base{
    public int roll=12115687;
    public String name="Joydeep";
    abstract void result();
}

class Child extends Base{
    void result(){
        System.out.println("Excellent Result!");
    }
     int sum(int a , int b){
        int c=a+b;
        return c;
    }
}
//ENCAPSUATION --hiding personal entity so that others cant access it or
//binding of fields and methods  in a single unit
class Person{
    private String name="Joydeep";

    public String getname(){
        return name;
    }

    public void setname(String newname){
        this.name = newname;        
    }

}
//POLYMORPHISM 
class Animals{
    public void animalSound(){
        System.out.println("This animal makes sound");
    }
}
class Cat extends Animals{
    public void animalSound(){
        System.out.println("Cat says meoww!");

    }
    
}
class Dog extends Animals{
    public void animalSound(){
        System.out.println("dog says bark!");
    }
}
//INNER CLASS 
class OuterClass{
    int x=21;
    class InnerClass{
        public int innerMethod(){
            return x;
        }
    }
    static class StaticInnerClass{
        static int z=123;
    }
}

//INTERFACE-Basicaly abstract class
interface Interface1{
    void getnumber();
}
interface Interface2{
    void getname();
}
class DemoClass implements Interface1,Interface2{
    public void getnumber(){
        System.out.println(12345);
    }
    public void getname(){
        System.out.println("Joydeep");
    }
}

//Enum-special class keeps a group of constants (final variables) 
//they are separated by coma

enum Enum{
    EASY,MEDIUM,HARD,Constant
}