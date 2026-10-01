package controller;

import java.util.ArrayList;
import java.util.Scanner;
import modal.CustomerModal;
import services.CustomerService;

public class CustomerController implements CustomerService {
	Scanner obj=new Scanner(System.in);
	ArrayList<CustomerModal> arr=new ArrayList<>();
	int id=0;
	
	public void createcus() {
		System.out.println("Enter the name :");
		String name=obj.nextLine();
		System.out.println("enter your mail id :");
		String mail=obj.nextLine();
		
		CustomerModal cm= new CustomerModal(id,name,mail);
		arr.add(cm);
		id++;
		System.out.println("Customer added Succesfully !!");
		
	}
	
	public void userdis() {
		
		System.out.println("enter the cust id : ");
		int temp=obj.nextInt();
		int index=0;
		
		
		if(temp >=0 && temp<id) {
			for(CustomerModal x:arr) {
				if(x.getCusId()==temp) {
					System.out.println("Details :");
					System.out.println("Customer name : "+arr.get(temp).getName());
					System.out.println("Customer Email : "+arr.get(temp).getEmail());
					
				}
				index++;
			}
	
		}
			else {
				System.out.println("Customer not found ");
			}
		}
	
	
	
	public void alldis() {
		if(arr.isEmpty()) {
			System.out.println("No customer exist");
		}
		else {
		for(CustomerModal x:arr) {
			
		System.out.println("Details :");
		System.out.println("Customer name : "+x.getName());
		System.out.println("Customer Email : "+x.getEmail());
		System.out.println(" ");
		}
		}
			
		
	}
	
	public void update() {
		
		System.out.println("Enter the cust id to update : ");
		int temp=obj.nextInt();
		int index=0;
		
		if(arr.isEmpty()) {
			System.out.println("No Customers Exist");
		}
		
		else {
			for(CustomerModal x:arr) {
				if(x.getCusId()==temp) {
			
			System.out.println("Which should be updated \n 1)name \n 2)email");
			int a=obj.nextInt(); 
			obj.nextLine();
			switch(a) {
			case 1:
				System.out.println("Enter the new name : ");
				String n=obj.nextLine();
				arr.get(index).setName(n);
				System.out.println("Name updated succesfully");
				break;
				
			case 2:
				System.out.println("Enter the new email : ");
				String m=obj.nextLine();
				arr.get(index).setEmail(m);
				System.out.println("Email updated succesfully");
				break;
			}
				}
				index++;
			}
		
		}
	}
	
	public void delete() {
		System.out.println("Enter the customer id to delete : ");
		int temp=obj.nextInt();
		
		int index=0;
		
		
		if(arr.isEmpty()) {
			System.out.println(" No customers exist");
		}
		else {
			for(CustomerModal x:arr) {
				if(x.getCusId()==temp) {
					arr.remove(index);
					System.out.println(" Customer Deleted ");
					
				}
				index++;
			}
		}
		
		
	}
	}
