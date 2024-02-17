package Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import model.Customer;
import model.Orders;
import utils.HibernateUtils;

public class OneToManyTest {
	Date date=new Date();
	public void saveCustomerOrders() {

	Session session= HibernateUtils.getSession();
	
	Customer cu=new Customer();
	cu.setName("raja");
	cu.setCreateDate(date);
	
	Orders ord1=new Orders();
	ord1.setLocation("banglore");
	ord1.setCustomer(cu);
	
	Orders ord2=new Orders();
	ord2.setLocation("delhi");
	ord2.setCustomer(cu);
	
	Orders ord3=new Orders();
	ord3.setLocation("hyderabad");
	ord3.setCustomer(cu);
	
	session.save(cu);
	Set<Orders> set=new HashSet<Orders>();
	set.add(ord1);
	set.add(ord2);
	set.add(ord3);
	
	for(Orders orders:set) {  
		session.save(orders);
	}
	session.beginTransaction().commit();
	session.close();
}

	public static void main(String[] args) {
		OneToManyTest rj=new OneToManyTest();
		rj.saveCustomerOrders();
	}
}