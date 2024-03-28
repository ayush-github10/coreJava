package com.gettersetter;

public class Bank {
     String name;
     long IFSC;
     address addr;
     Customer cus;
     
     
     public static void main(String[] args) {
    	 
    	 address adr = new address("Gali no.2",134,"NOIDA");
    	 
    	 Customer c1 = new Customer("AYUSH",6778665458L,5789965443L,"KANPUR",40000);
		
    	 Bank obj=new Bank("SBI",55678876554L,adr,c1);
    	 
    	 c1.deposit(10000);
    	 
    	
    	 System.out.println(c1.bal);
    	 
    	 c1.withdraw(30000);
    	 System.out.println(c1.bal);
    	 
	}

	public Bank(String name, long iFSC, address address, Customer customer) {
		super();
		this.name = name;
		IFSC = iFSC;
		this.addr = address;
		this.cus = customer;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", IFSC=" + IFSC + ", addr=" + addr + ", cus=" + cus + "]";
	}
     
     
}
