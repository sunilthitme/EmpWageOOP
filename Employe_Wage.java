package com.employeOOP;

public class Employe_Wage {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation");
			Employe_Wage ob=new Employe_Wage();
			int presentAbsent= ob.random();
			
			if (presentAbsent==1) {
				System.out.println("Emplyee is present");
				
			}

			else {
				System.out.println("Employee is Absent ");
			}
		}
        public static int random() {
        	int presentAbsent= (int)(Math.floor(Math.random() * 10)) % 2;
        	return  presentAbsent;
        }

}

