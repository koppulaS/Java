package Test;

import org.hibernate.Session;

import model.Employee;
import utils.HibernateUtils;

public class InterviewTest {

	
	public void SaveorUpdateEmpl() {
	Session session=HibernateUtils.getSession();
	Employee e=new Employee();
	e.setName("kapil");
	e.setDept("devops with asws");
	e.setAge(31);
	e.setSalary(56000);
	session.saveOrUpdate(e);
	session.beginTransaction().commit();
	session.close();
	}
	
	public void evictClearExample() {
		 Session session=HibernateUtils.getSession();
		 Employee e1=new Employee();
			e1.setName("AAAA");
			e1.setDept("devops ");
			e1.setAge(31);
			e1.setSalary(78000);
			session.save(e1);
			
			
			 Employee e2=new Employee();
			e2.setName("BBBB");
			e2.setDept(" asws");
			e2.setAge(43);
			e2.setSalary(56000);
			session.save(e2);
			
			 Employee e3=new Employee();
			e3.setName("CCCC");
			e3.setDept("devops with asws");
			e3.setAge(28);
			e3.setSalary(76000);
			 session.save(e3);
			
	}
	public static void main(String[] args) {
		InterviewTest ku=new InterviewTest();
		//ku.SaveorUpdateEmpl();
		ku.evictClearExample();
	}
}
