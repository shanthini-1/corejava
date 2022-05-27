package com.chainsys.appointments_miniproject.entry;

import java.util.Scanner;


public class Startup {
	public static void main(String args[]) {

		Scanner input = null;
		input = new Scanner(System.in);

		int choice = 0;
		int ch = 0;
		try {
			do {
				System.out.println("---------------   Appointment MANAGEMENT	---------------");
				System.out.println(
						"\n" + "1. Add Appointment" + "\n" + "2. Update Appointment" + "\n" + "3. Delete Appointment"
								+ "\n" + "4. Search Appointment By Id" + "\n" + "5. Fetch All" + "\n" + "6.Exit\n");
				System.out.println("Enter the number (1-5) : ");
				choice = input.nextInt();

				switch (choice) {
				case 1: {
					System.out.println("---------------------------- Add Appointment ----------------------------\n");
//					AppointmentsUi.addNewAppointments();
					break;
				}
				case 2: {

					System.out.println("---------------------------- Edit Appointment ----------------------------\n");
					System.out.println("\n" + "1. To Edit All Deta " + "\n" + "2. To Edit firstName " + "\n"
							+ "3. To Edit Salary " + "\n" + "4. Back to main menu");
					switch (ch) {
					case 1: {
//						AppointmentsUi.editAppointments();
						break;
					}
					case 2: {
//						AppointmentsUi.updateDateOfAppointments();
						break;
					}
					case 3: {
//						AppointmentsUi.updateStandardFee();
						break;
					}
					case 4: {
						continue;
					}
					default:
						System.out.println("please Enter Correct Option !!!");
					}

					break;
				}
				case 3: {
					System.out
							.println("---------------------------- Delete Appointment ----------------------------\n");
//					AppointmentsUi.deleteAppointmentsById();
					break;
				}
				case 4: {
					System.out.println(
							"---------------------------- Get Appointment By Id ----------------------------\n");
//					AppointmentsUi.getAppointmentsById();
					break;
				}
				case 5: {
					System.out
							.println("---------------------------- Get All Appointment ----------------------------\n");
//					AppointmentsUi.getAllAppointments();
					break;
				}
				case 6: {
					System.out.println("Exiting program !!!");
					System.exit(choice);
				}
				default:
					System.out.println("Please Enter Correct Option!!!");
				}

			} while (choice != 6);
		} finally {
			input.close();
		}
	}

}
