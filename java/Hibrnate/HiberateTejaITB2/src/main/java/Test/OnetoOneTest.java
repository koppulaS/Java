package Test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Customer;
import model.Wallet;
import utils.HibernateUtils;

public class OnetoOneTest {
	
      Date date=new Date();
	private Session Session;
	public void SaveCustomerWallet() {
	   Session session=HibernateUtils.getSession();
	   
	   Customer kk=new Customer();
	   kk.setCid(1);
	   kk.setName("krishna");
	   kk.setCreateDate(date);
	   
	   Wallet nm=new Wallet();
	   nm.setWalletid(1);
	   nm.setBalance(5800.50);
	   nm.setCustomer(kk);
	   
	   session.save(kk);
	   session.save(nm);
	   session.beginTransaction().commit();
	   session.close();
	   
	}
	public void UpdateCustomer() {
		Session session=HibernateUtils.getSession();
		
		 Customer kk=new Customer();
		   kk.setCid(2);
		   kk.setName("pratap reddy");
		   kk.setCreateDate(date);
		   
		   Wallet nm=new Wallet();
		   nm.setWalletid(2);
		   nm.setBalance(581.50);
		   nm.setCustomer(kk);
		   
		   session.save(kk);
		   session.save(nm);
		   session.beginTransaction().commit();
		   session.close();
		   
	}
	public void deleteCustomer() {
		Session session=HibernateUtils.getSession();
		
		 Customer kk=new Customer();
		 kk.setCid(2);
		 
		 Wallet nm=new Wallet();
		 nm.setWalletid(2);
		 
		 session.delete(kk);
		 session.delete(nm);
		 session.beginTransaction().commit();
		   session.close();
		
	}
	 public void getAll() {
		  Session session=HibernateUtils.getSession();
		  Query query=session.createQuery("from Customer");
			List<Customer> rsk=query.list();
			for(Customer cu:rsk) {
				//System.out.println(cu.getName()+""+cu.getCid());
				System.out.println(cu);
				
			}
			    	
	     Session session1=HibernateUtils.getSession();
	     Query query1=session.createQuery("from Wallet");
			List<Wallet> nmk=query1.list();
			for(Wallet cu:nmk) {
				//System.out.println(cu.getBalance()+""+cu.getWalletid());
				System.out.println(cu);
			}
			 Transaction nx=session.beginTransaction();
	         nx.commit();
	     	session.close();
			
	 }
	
	public static void main(String[] args) {
		 OnetoOneTest top=new  OnetoOneTest();
		//top.SaveCustomerWallet();
		// top.UpdateCustomer();
		// top.deleteCustomer();
		 top.getAll();
	}
}
