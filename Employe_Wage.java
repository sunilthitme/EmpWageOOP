package com.employeOOP;

public class Employe_Wage {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
			Employe_Wage ob=new Employe_Wage();
			int presentAbsent= ob.random();
			
			 int workingHour;
			   int wagePerHour=20;
			   if(presentAbsent==1) {
			       workingHour=8;
			       System.out.print("Employee is Present Full time	");
			   }
			   else {
				     workingHour=0;
				     System.out.print("Employee is Absent");
			   }
		int dailyWage=workingHour*wagePerHour;
		System.out.println("\t"+"Employee daily wage is" +dailyWage);
			   }
		   
        public static int random() {
        	int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 2;
        	return  presentAbsent;
        }

}

