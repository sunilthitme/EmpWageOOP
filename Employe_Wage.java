package com.employeOOP;

public class Employe_Wage {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
			Employe_Wage ob=new Employe_Wage();
			int presentAbsent= ob.random();
			int workingHour=0;
			int wagePerHour=20;
			int totalWorkingHour=0;
			int dayinMonth=20;
			int maxWorkingHour=100;
			int totalWage=0;
		   
			for(int day=0; day<dayinMonth ; day++) {
				switch(presentAbsent) {
				case 1:
				       workingHour=8;
				       System.out.print("Emplyee is Present Full time	");
			            break;
				case 2:
				        workingHour=4;
				        System.out.print("Emplyee is Present Part time ");
				        break;
				 default:
					     workingHour=0;
					     System.out.print("Emplyee is Absent");
					     break;
			
			}
			totalWorkingHour+=workingHour;
			int dailyWage=workingHour*wagePerHour;
			totalWage+=dailyWage;
			
			System.out.println("\t" +"Day " + day + " wage is ::"  + dailyWage);
			}
				
			System.out.println("Monthly wage is::"+totalWage);
			}

		
        public static int random() {
        	int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 3;
        	return  presentAbsent;
        }

}

