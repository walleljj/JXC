import java.util.ArrayList;
import java.util.List;

import com.lzw.daoImpl.CustomerDaoImpl;
import com.lzw.daoImpl.GoodsDaoImpl;
import com.lzw.daoImpl.OrderDaoImpl;
import com.lzw.daoImpl.WaiterDaoImpl;
import com.lzw.entity.Customer;
import com.lzw.entity.DD;
import com.lzw.entity.Goods;
import com.lzw.entity.Order;
import com.lzw.entity.Waiter;

public class Mainn {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*Waiter w = new Waiter(10001,"李杰","11133811","12312312311");
		WaiterDaoImpl wdi = new WaiterDaoImpl();
		//wdi.addWaiter(w);
		w = wdi.findWaiterById(3001);
		System.out.println(w);*/
		//Customer c = new Customer(12443,"5asd45a","bbb","ccc","ddd","eee",20,"45646546");
		//CustomerDaoImpl cdi = new CustomerDaoImpl();
		/*List<Customer> li = new ArrayList<Customer>();
		li = cdi.findQianzhang();
		for(int i = 0 ; i<li.size() ; i++)
			System.out.println(li.get(i));
		c = cdi.findCustomerById(123);
		System.out.println(c);*/
		//cdi.removeCustomer(c);
		/*Goods g = new Goods(111,"sdfsdfsd","333","444","555","666","777","888","999",000,11111);
		GoodsDaoImpl gdi = new GoodsDaoImpl();
		List<Goods> li = new ArrayList<Goods>();
		int a = gdi.deletGoods(111);
		for(int i = 0 ; i<li.size() ; i++)
			System.out.println(li.get(i));
		System.out.println(a);
		*/
		/*DD dd = new DD();
		Order or = new Order();
		OrderDaoImpl odi = new OrderDaoImpl();
		List<DD> li = new ArrayList<DD>();
		li = odi.findByWaiter("白宝宝");
		for(int i = 0 ; i<li.size() ; i++)
			System.out.println(li.get(i));*/
		

	}

}
