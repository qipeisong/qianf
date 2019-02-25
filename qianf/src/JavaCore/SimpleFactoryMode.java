package JavaCore;

/*�趨����ģʽ����������֮�������*/
/***/
/*hahahahhahaha*/

public class SimpleFactoryMode {
	public static void main(String[] args) {
	//Product  phone = new Phone();//����֮��������̫ǿ
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
		System.out.println("�ֻ���ʼ");
	}
}

class Computer implements Product{
	public void work (){
		System.out.println("���Կ�ʼ����");
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
