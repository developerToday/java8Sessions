package com.oops.concept.aggregation;
class StudentClass
{
   int rollNum;
   String studentName;
   //Creating HAS-A relationship with Address class
   AggregationDemo studentAddr; 
   StudentClass(int roll, String name, AggregationDemo addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }
   public static void main(String args[]){
       AggregationDemo address = new AggregationDemo(55, "Chennai", "TamilNadu", "India");
       StudentClass obj = new StudentClass(123, "Selvam", address);
       System.out.println(obj.rollNum);
       System.out.println(obj.studentName);
       System.out.println(obj.studentAddr.streetNum);
       System.out.println(obj.studentAddr.city);
       System.out.println(obj.studentAddr.state);
       System.out.println(obj.studentAddr.country);
   }
}