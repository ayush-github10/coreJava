package constructor;

import java.util.Objects;

public class demo {
     
	int num;
	String name;

	public demo(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public static void main(String[] args) {
         demo obj1=new demo(100, "AYU");
         demo obj2=new demo(100,"AYU");
         demo obj3=new demo(100,"AYU");
         System.out.println(obj1.hashCode());
         System.out.println(obj2.hashCode());
         System.out.println(obj3.hashCode());
	}
	
	//to generate same hashcode... go to source then generate hashcode and equals
	//equals compares the values
	
     @Override
	public int hashCode() {
		return Objects.hash(name, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		demo other = (demo) obj;
		return Objects.equals(name, other.name) && num == other.num;
	}

	//to represent the object
	@Override
	public String toString() {
		return "demo [num=" + num + ", name=" + name + "]";
	}
}
