package com.example.myprog2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import java.util.Scanner;

import org.springframework.context.support.*;
@SpringBootApplication
public class Myprog2Application {

	public static void main(String[] args) {
		SpringApplication.run(Myprog2Application.class, args);
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(Myprog2Application.class, args);
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("my2.xml");
		Customer1 c = (Customer1) ac.getBean("customer");
		Ticket2 t = (Ticket2) c.getTick();
		while(true) {
		System.out.println("1. insert the details\n 2. Display details \n"
		+ "3. exit");
		System.out.println("enter the choice");
		int a = sc.nextInt();
		switch(a) {
		case 1:
		System.out.println("enter the customer name");
		c.setName(sc.next());
		System.out.println("enter the customer address");
		c.setAddress(sc.next());
		System.out.println("enter the ticket number");
		t.setTicno(sc.nextInt());
		System.out.println("enter the ticket seat no");
		t.setSeatno(sc.nextInt());
		System.out.println("enter the ticket price");
		t.setPrice(sc.nextInt());
		System.out.println("enter the ticket Type -economic/gold/platinum");
		t.setTicktype(sc.next());
		c.setTick(t);
		System.out.println("thanks for input");
		break;
		case 2:
		System.out.println("Customer Details:");
		System.out.println("Name:"+c.getName()+" "+"Address:"+c.getAddress());
		System.out.println("Ticket Details");
		t = c.getTick();
		System.out.println("Ticket No: "+t.getTicno());
		System.out.println("Ticket Type: "+t.getTicktype());
		System.out.println("Ticket Seat No: "+t.getSeatno());
		System.out.println("Ticket Price: "+t.getPrice());
		break;
		case 3:
		System.exit(0);
		}
		}
	}

}
