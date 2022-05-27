package com.chainsys.doctor_miniproject.entry;

import java.util.Scanner;

import com.chainsys.miniproject.ui.DoctorUi;

public class startup {
	public static void main(String []args){
		
		Scanner input =null;
		input = new Scanner(System.in);
		int choice = 0;
		int ch =0;
		try {
		do {	
		System.out.println("---------------   DOCTOR MANAGEMENT	---------------");
		System.out.println("\n"+"1. Add Doctor"+"\n"+
				"2. Update Doctor"+"\n"+
				"3. Delete Doctor"+"\n"+
				"4. Search Doctor By Id"+"\n"+""
				+ "5. Fetch All"+"\n"+"6.Exit\n");
		System.out.println("Enter the number (1-5) : ");
		choice = input.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("---------------------------- Add Doctor ----------------------------\n");
				DoctorUi.addNewDoctor();
				break;
				}
			case 2:{
				System.out.println("---------------------------- Edit Doctor ----------------------------\n");
				System.out.println("\n"+"1. To Edit All Deta "+"\n"+
						"2. To Edit firstName "+"\n"+
						"To Edit Salary ");
				switch (ch) {
				case 1:{
					DoctorUi.editDoctor();
					break;
				}
				case 2:{
					DoctorUi.updatenameOfDoctor();
					break;
				}
				case 3:{
					DoctorUi.updateStandardFee();
					break;
				}
				case 4:{
					System.out.println("Back to main menu!!!!");
					continue;
				}
				default:
					System.out.println("please Enter Correct Option !!!");
				}
				
				break;
			}
			case 3:{
				System.out.println("---------------------------- Delete Doctor ----------------------------\n");
				DoctorUi.deleteDoctorById();
				break;
			}
			case 4:{
				System.out.println("---------------------------- Get Doctor By Id ----------------------------\n");
				DoctorUi.getDoctorById();
				break;
			}
			case 5:{
				System.out.println("---------------------------- Get All Doctor ----------------------------\n");
				DoctorUi.getAllDoctor();
				break;
			}
			case 6:{
				System.out.println("Exiting program !!!");
				System.exit(choice);
			}
			default:
			 System.out.println("Please Enter Correct Option!!!");
			}
		
		}while(choice!=6);
		}finally {
			input.close();
		}
	}
}




//DoctorDao.insertDoctor();
//TestDoctorDao.testInsertDoctor();
//	TestDoctorDao.testUpdateDoctor();
//	TestDoctorDao.testGetDoctorById();
//	TestDoctorDao.testGetAllDoctors();
//	TestDoctorDao.testDeleteDoctor();
	
	//System.out.println("Enter 1 for Add ");
