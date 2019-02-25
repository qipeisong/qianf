package JavaCore;

/*设定工厂模式，降低两者之间的依赖*/

public class SimpleFactoryMode {
	public static void main(String[] args) {
	//Product  phone = new Phone();//两者之间依赖性太强
   // phone.work();
	Product phone = ProductFactory.GetProduct("phone");
	phone.work();
	}
}

interface Product{
	public void work();
}

class Phone implements Product{
	public void work() {
		System.out.println("手机开始");
	}
}

class Computer implements Product{
	public void work (){
		System.out.println("电脑开始工作");
	}
}

class ProductFactory{	
	public static Product GetProduct(String name) {
		if("phone".equals(name)) {
			return new Phone();
		}else  if("computer".equals(name)) {
			return new Computer();
		}else {
			return null;
		}
	}	
}