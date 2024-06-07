package javacode;

class getaandsettwo  {
    
      public  static void main (String[] args)
      {

        getandset a1 =new getandset();
       //a1.age=12  i can do this because the age is private in the public class to use the variable we have create the getter and setter;
         a1.setName("shivakumar");
         a1.setage(25);
         System.out.println(a1.getName() + "is my name and my age is " +a1.getage() ); 
    }
    
}
