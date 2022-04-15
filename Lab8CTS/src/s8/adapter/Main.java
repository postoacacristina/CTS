package s8.adapter;

import s8.Client;
import s8.IDiscountA;
import s8.IDiscountB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []v=new int[2];
		v[0]=100;
		v[1]=150;
		Client client=new Client("Cristina", 2, v);
		IDiscountB discount=new AdapterBtoA();
		discount.calculateDiscountB(client);
		//IDiscountA discount2=new AdapterBtoA();
		
	}

}