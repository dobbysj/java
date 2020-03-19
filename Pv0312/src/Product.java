
public class Product {
	static int count;
	int serial;
	String name;
	int price;
	double point;	
	String color;
	
	{
		serial = ++count;
	}
	
	Product(){}
	Product(String name, int price, String color){
		this.name=name;
		this.price=price;
		point = price*0.1;
		this.color=color;
	}
}


//아이폰 클래스
class Iphone extends Product{
	String size;
}

class IphoneX extends Iphone{
	
}

class IphoneXS extends Iphone{
	
}


//갤럭시 클래스
class Galaxy extends Product{
	
}

class GalaxyS10 extends Galaxy{
	
}

class GalaxyS20 extends Galaxy{
	
}


//베가 클래스
class Vega extends Product{
	
}

