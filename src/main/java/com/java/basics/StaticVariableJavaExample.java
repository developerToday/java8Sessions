package com.java.basics;
public class StaticVariableJavaExample {
   public static String myClassVar="class or static variable";
   String str = "";
	
   public static void main(String args[]){
      StaticVariableJavaExample obj = new StaticVariableJavaExample();
      StaticVariableJavaExample obj2 = new StaticVariableJavaExample();
      StaticVariableJavaExample obj3 = new StaticVariableJavaExample();
      
      //All three will display "class or static variable"
      System.out.println(obj.myClassVar);
      System.out.println(obj2.myClassVar);
      System.out.println(obj3.myClassVar);

      //changing the value of static variable using obj2
      obj2.myClassVar = "Changed Text";

      //All three will display "Changed Text"
      System.out.println(obj.myClassVar);
      System.out.println(obj2.myClassVar);
      System.out.println(obj3.myClassVar);
   }
}