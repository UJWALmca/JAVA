package vlab;

import java.util.Scanner;

class person {
	int id;
	String name;
	int age;
	long phone;

	person(int id, String name, int age, long phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public void getname() {
		System.out.println("the id: " + id);
		System.out.println("the name: " + name);
		System.out.println("the age:" + age);
		System.out.println("the phone:" + phone);
	}
}

interface employee {
	void displaysalary();
}

class staff extends person implements employee {
	int salary;

	staff(int id, String name, int age, long phone, int salary) {
		super(id, name, age, phone);
		this.salary = salary;
	}

	public void displaysalary() {
		System.out.println("the salary is :" + salary);
	}
}
interface student {
	void displaycgpa();
}



class studenta extends person implements student {
	float cgpa;

	studenta(int id, String name, int age, long phone,float cgpa) {
		super(id, name, age, phone);
		this.cgpa = cgpa;
	}

	public void displaycgpa() {
		System.out.println("the salary is :" + cgpa);
	}
}


class one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int a = sc.nextInt();
		System.out.println("enter name");
		String b = sc.next();
		System.out.println("enter age");
		int c = sc.nextInt();
		System.out.println("enter phonen no");
		long d = sc.nextLong();
		System.out.println("enter salary");
		int e = sc.nextInt();
		staff st = new staff(a, b, c, d, e);
		st.getname();
		st.displaysalary();
		
		System.out.println("enter id");
		int a1 = sc.nextInt();
		System.out.println("enter name");
		String b1 = sc.next();
		System.out.println("enter age");
		int c1 = sc.nextInt();
		System.out.println("enter phonen no");
		long d1 = sc.nextLong();
		System.out.println("enter cgpa");
		float e1=sc.nextFloat();
		studenta sta = new studenta(a1, b1, c1, d1, e1);
		sta.getname();
		sta.displaycgpa();

	}
}
