package com.java.basics;
public class OperatorJavaExample {
   public static void main(String args[]) {
	   
	  //Arithmetic Operators 
      int num1 = 100;
      int num2 = 20;
      
      System.out.println("num1 + num2: " + (num1 + num2) );
      System.out.println("num1 - num2: " + (num1 - num2) );
      System.out.println("num1 * num2: " + (num1 * num2) ); 
      System.out.println("num1 / num2: " + (num1 / num2) );
      System.out.println("num1 % num2: " + (num1 % num2) );
      
      //Assignment Operators
      int num3 = 10;
      int num4 = 20;

      num4 = num3;
      System.out.println("= Output: "+num4);

      num4 += num3;
      System.out.println("+= Output: "+num4);
	      
      num4 -= num3;
      System.out.println("-= Output: "+num4);
	      
      num4 *= num3;
      System.out.println("*= Output: "+num4);
	      
      num4 /= num3;
      System.out.println("/= Output: "+num4);
	      
      num4 %= num3;
      System.out.println("%= Output: "+num4);
      
      //Auto Increment & Auto Decrement
      int num5=100;
      int num6=200;
      num5++;
      num6--;
      System.out.println("num1++ is: "+num5);
      System.out.println("num2-- is: "+num6);
      
      //Logical
      boolean b1 = true;
      boolean b2 = false;

      System.out.println("b1 && b2: " + (b1&&b2));
      System.out.println("b1 || b2: " + (b1||b2));
      System.out.println("!(b1 && b2): " + !(b1&&b2));
      
      //Relational
      int num7 = 10;
      int num8 = 50;
      if (num7==num8) {
	 System.out.println("num7 & num8 are equal");
      }
      else{
	 System.out.println("num7 & num8 not equal are not equal");
      }

      if( num7 != num8 ){
	 System.out.println("num7 and num8 are not equal");
      }
      else{
	 System.out.println("num7 and num8 are equal");
      }

      if( num7 > num8 ){
	 System.out.println("num7 is greater than num8");
      }
      else{
	 System.out.println("num7 is not greater than num8");
      }

      if( num7 >= num8 ){
	 System.out.println("num7 is greater than or equal to num8");
      }
      else{
	 System.out.println("num7 is less than num8");
      }

      if( num7 < num8 ){
	 System.out.println("num7 is less than num8");
      }
      else{
	 System.out.println("num7 is not less than num8");
      }

      if( num1 <= num2){
	 System.out.println("num1 is less than or equal to num2");
      }
      else{
	 System.out.println("num1 is greater than num2");
      }
      
   }
}