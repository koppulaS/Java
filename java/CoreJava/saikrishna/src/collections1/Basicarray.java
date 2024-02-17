package collections1;

import java.util.ArrayList;
import java.util.List;

public class Basicarray {

	
	public static void main(String[] args) {
		
		//list1 can store only String objects//
		List<String> list1=new ArrayList<String>();
		
		list1.add("batman");        //1.
		list1.add("eternals");
		list1.add("deccanchronicle");
		list1.add("colonial");
		list1.add("bhamakalapam");
		list1.add("batman");          //2.  it accepts duplicate values.
		list1.remove(2);
		
		//list2 can store any type of object
				ArrayList list2=new ArrayList();
		
		list2.add("coma");
		list2.add(54);
		list2.add("karmanghat");
		list2.add(7778);
		
		
		 
		//print reference to list shall print elements in the list the way we added in a sequence//
		System.out.println(list1);
		
		//iterating with ArrayList//
		for(String names:list1) {
			System.out.println(names); ////list1	
			}
		
		
		//iterating with loop//
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
		System.out.println(list2);
		
		//2.GET THE SPECIFIC ELEMENT FRM THE LIST
		String name=list1.get(2); //by specially we get the value what we want//
		System.out.println(name);
		
		Object o=list2.get(2);    //object is used because it is the parent class of all classes 
		System.out.println(o);                    //Or
	                            	//we have 2 different 1.String and 2.Integer so we use object//
		
		
		  //3.UPDATE ELEMENT IN LIST
		list1.set(2,"therapy" );
		System.out.println(list1);
		
		//4.REMOVE ELEMENT FROM LIST
		list1.remove(2);
		System.out.println(list1);
		
		//REMOVE ALL
		list1.clear();
		
		}
		
	}

