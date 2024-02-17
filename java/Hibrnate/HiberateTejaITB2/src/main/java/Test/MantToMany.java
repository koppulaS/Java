package Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToMany;

import org.hibernate.Session;
import org.jboss.jandex.Main;

import model.Customer;
import model.Items;
import utils.HibernateUtils;

public class MantToMany {



	Date d=new Date();
	
	public void SaveCustomerItems() {
		
		 Session session=HibernateUtils.getSession();
			 
		Items i1=new Items();
		 i1.setItemName("iqooz3");
		
		 
		 Items i2=new Items();
		 i2.setItemName("samsung");
		 
		 
		 Items i3=new Items();
		 i3.setItemName("jio");
		
		 
		 List<Items>itmslist=new ArrayList<Items>();
		 itmslist.add(i1);
		 itmslist.add(i2);
		 itmslist.add(i3);
		 
		for(Items i:itmslist) {
			session.save(i);
		}
		 
		 Customer c1= new Customer();
		 c1.setName("rajesh");
		 c1.setCreateDate(d);
		 c1.setItems(itmslist);
		
		
		 Customer c2= new Customer();
		 c2.setName("veera pratap reddy");
		 c2.setCreateDate(d);
		 
		
		 List<Customer> list=new ArrayList<Customer>();
		 list.add(c1);
		 list.add(c2);
		 
		 for(Customer cu:list){
			session.save(cu);
		 }
		 
		session.beginTransaction().commit();
		session.close();
		 
	}
	public static void main(String[] args) {
		 MantToMany m1=new  MantToMany();
		 m1.SaveCustomerItems();
	}
}
