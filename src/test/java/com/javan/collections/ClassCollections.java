package com.javan.collections;

import java.util.ArrayList;
import java.util.List;
//import java.util.Iterator;
//import java.util.stream.Stream;

public class ClassCollections {

	public static void main(String[] args) {

		List<Company> companyList = new ArrayList<Company>();
		
		Company comp1 = new Company("Microsoft", 10);
		Company comp2 = new Company("VERIZON", 9);
		Company comp3 = new Company("Syndigo", 7);
		
		
		companyList.add(comp1);
		companyList.add(comp2);
		companyList.add(comp3);
		
		for(int i =0; i < companyList.size();i++) {
			System.out.println("Line 24" + companyList.get(i).getEmployeeNumber());
			if(companyList.get(i).getEmployeeNumber() < 10) {
				int employerNumbers = companyList.get(i).getEmployeeNumber() + (10 - companyList.get(i).getEmployeeNumber());
				System.out.println("Line 27" + employerNumbers);
				//companyList.replaceAll(i, employerNumbers);
			}
			
		}
		
		//System.out.println("Before : " + companyList);
		
		
		
//		for(int i =0; i < companyList.size(); i++) {
//				System.out.println(companyList);
//				Company employeeNumber = ne
//			
////			Company compEmployee = new companyList.get(i);
//			
//		}
			
		
		// This is to print companyList:
//		for(int i =0; i	 < companyList.size();i++) {
//			System.out.println("line 38 /n" + companyList.get(i));
//			Company comp = companyList.get(i);
//			System.out.println("This is line number: 40" + companyList);
//			System.out.println("This is about the companyList size" + companyList.size());
//			
//						
//			System.out.println("Line 44" + comp.getCompanyName());
//			if(comp.getCompanyName().equalsIgnoreCase("Verizon")){
//				System.out.println("Line 46" + comp.getCompanyName());
//				companyList.remove(i);
//			}
//			
////			System.out.println(">>> " + comp.getCompanyName());
//		}
		
		//System.out.println("After : " + companyList);
		
		
		
		
		
//		Iterator iterator = CompanyList.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//	}
			
//		CompanyList.add("Microsoft");
//		CompanyList.add("Amazon");
//		CompanyList.add("Verizon");
//		
//		System.out.println(CompanyList.toString()); // print string representation using toString()
//		
//		Stream.of(CompanyList.toString()).forEach(System.out::println);
		
	}

}
