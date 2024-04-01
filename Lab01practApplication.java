package com.example.lab01pract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//write these two import statements
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class Lab01practApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab01practApplication.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf.xml");
		Customer c = (Customer) ac.getBean("Cust");
		Ticket t = (Ticket) c.getTick();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Enter Customer Details\n2.Get Customer Details\n3.Exit");
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the customer Name:");
				c.setCName(sc.next());
				System.out.println("Enter the Customer Address");
				c.setCAddress(sc.next());
				System.out.println("Enter the Customer id");
				c.setCustid(sc.nextInt());
				System.out.println("Enter the Ticket id");
				t.setTickId(sc.nextInt());
				System.out.println("Enter the Ticket Seat Number");
				t.setTSeatNo(sc.nextInt());
				System.out.println("Enter the Ticket price");
				t.setTickPrice(sc.nextInt());
				c.setTick(t);
				System.out.println("Details are inserted successfully");
				break;
			case 2:
				System.out.println("Customer Details");
				System.out.println("Customer Name: "+c.getCName());
				System.out.println("Customer Address: "+c.getCAddress());
				System.out.println("Customer Id: "+c.getCustid());
				System.out.println("Ticket Details");
				System.out.println("Ticket id: "+t.getTickId());
				System.out.println("Ticket seat No: "+t.getTSeatNo());
				System.out.println("ticket Price: "+t.getTickPrice());
				break;
			case 3:
				System.exit(0);
				break;
			}
			
		}

	}

}
