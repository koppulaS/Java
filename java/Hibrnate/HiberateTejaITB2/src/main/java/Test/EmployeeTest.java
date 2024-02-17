package Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import model.Employee;
import model.Student;
import utils.HibernateUtils;

public class EmployeeTest {

	public void SaveEmployee() {
		Session session=HibernateUtils.getSession();//
		
		Employee e1=new Employee();
		e1.setName("krishna");
		
		e1.setAge(26);
		e1.setDept("developer");
		e1.setEid(3);
		e1.setSalary(1000);
		session.save(e1);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		
	}
	public void updateEmployee () {
		Session session=HibernateUtils.getSession();
		
		Employee e1=new Employee();
	  	e1.setName("prabhas");
		e1.setSalary(50000);
		e1.setAge(45);
		e1.setDept("bigdata");
		e1.setEid(3);
		session.update(e1);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
	}
	public void deleteEmployee() {
		Session session=HibernateUtils.getSession();
		
		Employee e1=new Employee();
		e1.setEid(19);
			
		
		session.delete(e1);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		
	}
	
	public void getEmployee() {
		Session session=HibernateUtils.getSession();
		 Employee e=session.load(Employee.class,9);
		System.out.println(e.getName()+""+e.getSalary());
		Transaction tx=session.beginTransaction();
		            tx.commit();
	            	session.close();
	}
	

	 
	public void getAllEmployees() {
		Session session=HibernateUtils.getSession();
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee emp:list) {
			System.out.println(emp.getName()+""+emp.getDept());
		}
		 Transaction tx=session.beginTransaction();
         tx.commit();
     	session.close();
		
	}
	
	public void aggregateOperations() {
		Session session=HibernateUtils.getSession();
		Criteria criteria=session.createCriteria(Employee.class);
		Integer age=(Integer) criteria.setProjection(Projections.max("age")).uniqueResult();
		
		System.out.println(age);
	}
	
	public void orderByOperation() {
		Session session=HibernateUtils.getSession();
		Criteria crtr=session.createCriteria(Employee.class);
		List<Employee> list=crtr.addOrder(Order.desc("age")).list();
		for(Employee emp:list) {
			System.out.println(emp.getAge()+""+emp.getName());
		}
	}
	 public void restrictionOperations() {                  //ilike,gt,lt//lt=less than
		  Session session=HibernateUtils.getSession();
		  Criteria crtr=session.createCriteria(Employee.class);
		  List<Employee> kkr=crtr.add(Restrictions.lt("age", 45)).list();
		  for(Employee empl:kkr) {
			  System.out.println(empl.getName()+""+empl.getAge());
		  }
	  }
	 public void andOperation() {
		  Session session=HibernateUtils.getSession();
		  Criteria crtr=session.createCriteria(Employee.class);
		Criterion salary= Restrictions.gt("salary", 85000);
		Criterion name= Restrictions.ilike("name", "%kr%");
		LogicalExpression le=Restrictions.and(salary, name);
		List<Employee>srh=crtr.add(le).list();
		for(Employee kmp:srh) {
			System.out.println(kmp.getName()+""+kmp.getSalary());
		}
		  
	 }
	 public void orOperations() {

	  Session session=HibernateUtils.getSession();
	  Criteria crtr=session.createCriteria(Employee.class);
	//Criterion salary= Restrictions.gt("salary", 85000);
	//Criterion name= Restrictions.ilike("name", "%kr%");
	//LogicalExpression le=Restrictions.or(salary, name);
	//List<Employee>srh=crtr.add(le).list();
	  List<Employee>srh=crtr.add(Restrictions.between("salary", 85000, 100000)).list();
	for(Employee kmp:srh) {
		System.out.println(kmp.getName()+""+kmp.getSalary());
	}
	  
 }
	 public void pagenation() {
		 Session session=HibernateUtils.getSession();
		 Query query=session.createQuery("from Employee where salary>75000");
		 query.setFirstResult(2); 
		 query.setMaxResults(3);
		 List<Employee> kint=query.list();
		 for(Employee em:kint) {
			 System.out.println(em.getSalary());
		 }
		 	
	 }
	 public void sqlInjection() {
		 Session session=HibernateUtils.getSession();
		 Query query=session.createQuery("from Employee where salary>:empsalary");
		 query.setInteger("empsalary",80000);
		 List<Employee> list=query.list();
		 for(Employee dint:list) {
			 System.out.println(dint.getSalary());
		 }
		 
	 }
	public void namedQueryExample() {
		 Session session=HibernateUtils.getSession();
		 Query query=session.getNamedQuery("Employee.bySalary");
		 query.setInteger("empsalary", 80000);
		 List<Employee> list=query.list();
		for(Employee emp:list) {
			System.out.println(emp.getSalary());
		}
	}
	 
	public static void main(String[] args) {
		 EmployeeTest tt=new  EmployeeTest();
		// tt.SaveEmployee();
		// tt.updateEmployee();
		// tt.deleteEmployee();
		// tt.getEmployee();
		// tt.getAllEmployees(); 
		// tt.aggregateOperations();
		// tt.orderByOperation();
		// tt.restrictionOperations();
		//tt.andOperation(); 
		// tt.orOperations();
		 //tt.pagenation();
		// tt.sqlInjection();
		 tt.namedQueryExample();
		
	}
	
}
