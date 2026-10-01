package main;

import java.util.Scanner;

import controller.CustomerController;
import modal.CustomerModal;

public class main {

	public static void main(String [] args) {
		CustomerController cm=new CustomerController();
		Scanner obj=new Scanner(System.in);
		
		while(true) {
			System.out.println("1)create user  \n 2)Display specific User"
					+ " \n 3)All user \n 4)update details \n 5)delete customer ");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				cm.createcus();
				break;
			case 2:
				cm.userdis();
				break;
			case 3:
				cm.alldis();
				break;
			case 4:
				cm.update();
				break;
			case 5:
				cm.delete();
				break;
			
			
			}
		}
		
	}

}
