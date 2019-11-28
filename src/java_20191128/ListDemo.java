package java_20191128;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 데이터(객체)의 중복을 허용한다
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"terra",2500));
		list.add(new Product(2,"신라면",1000));
		list.add(new Product(3,"서울우유",3000));
		
		for (int i = 0; i < list.size(); i++) {
			Product temp = list.get(i);
			System.out.println(temp);
		}
		
		//모두삭제 => list.remove(int index) 사용해서
		for (int i = 0; i < list.size(); i++) {
			list.remove(i--);
		}
		
		//enhanced for loop 출력가능(제너릭으로 선언한 경우만 가능)
		for (Product temp : list) {
			System.out.println(temp);
		}
	}
}
class Product{
	int number;
	String name;
	double price;
	Product(int number, String name, double price){
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
}