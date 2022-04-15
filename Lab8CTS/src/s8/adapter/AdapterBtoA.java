package s8.adapter;

import s8.Client;
import s8.DiscountA;
import s8.IDiscountB;

public class AdapterBtoA extends DiscountA implements IDiscountB {

	@Override
	public double calculateDiscountB(Client client) {
		//v1:
//		this.calculateDiscountA(client.getNrOrders());
//		return 0;
		
		//v2:
		int total=0;
		for (int i=0; i<client.getNrOrders(); i++)
			total+=client.getOrders()[i];
		this.calculateDiscountA(total);
		return 0;
	}
	
}