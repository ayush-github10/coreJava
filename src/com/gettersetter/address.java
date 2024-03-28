package com.gettersetter;

public class address {
       String street;
       int doorno;
       String city;
       
       
	public address(String street, int doorno, String city) {
		this.street = street;
		this.doorno = doorno;
		this.city = city;
	}


	@Override
	public String toString() {
		return "address [street=" + street + ", doorno=" + doorno + ", city=" + city + "]";
	}
       
       
}
