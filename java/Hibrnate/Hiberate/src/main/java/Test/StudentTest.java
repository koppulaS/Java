package Test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Student;
import utils.HibernateUtils;

public class StudentTest {

	public void saveStudent() {
		Session session=HibernateUtils.getSession();  
		
		Student s1=new Student();
		s1.setName("Teja");
		s1.setPhone(898989);
		s1.setEmail("teja.ch@gmail.com");
		session.save(s1);
		Transaction tx=session.beginTransaction();
		            tx.commit();
	            	session.close();
		
	}
	public void updateStudent() {
		Session session=HibernateUtils.getSession();
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Aanand");
		s1.setPhone(898989);
		s1.setEmail("anand.ch@gmail.com");
		session.update(s1);
		Transaction tx=session.beginTransaction();
		            tx.commit();
	            	session.close();
		
	}
	public void deleteStudent() {
		Session session=HibernateUtils.getSession();
		
		Student s1=new Student();
		s1.setId(1);
		session.delete(s1);
		Transaction tx=session.beginTransaction();
		            tx.commit();
	            	session.close();
		
	}

	public void getStudent() {
		Session session=HibernateUtils.getSession();
		Student s=session.load(Student.class, 1);
		System.out.println(s.getEmail()+"  "+s.getName());
		Transaction tx=session.beginTransaction();
		            tx.commit();
	            	session.close(); 
		
	}
	
	public void getAll() {
		Session session=HibernateUtils.getSession();
		@SuppressWarnings("unchecked")
		List<Student> s=session.createQuery("from Student").list();
	for(Student ss:s) {
		System.out.println(ss.getName());
	}
		Transaction tx=session.beginTransaction();
		            tx.commit();
	            	session.close();
		
	}
	public static void main(String[] args) {
		StudentTest student=new StudentTest();
		student.saveStudent();
		//student.updateStudent();
		//student.getStudent();
		//student.getAll();
		//student.deleteStudent();
	}

}
