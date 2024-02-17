package variables;//default cases
                                                           //DEFAULT CASE DATATYPES
                                                        // PRIMITIVE DATA TYPES          //NON PRIMITIVE OR OBJECTIVE DATATYPES
public class DataTypesTesting {                              //byte =0                      all are null in default case
byte id;                                                     //short=0
short itemid;                                                //int=0
int orderid;                                                 //long=0
long mobile;                                                 //float=0.0 
float miles;                                                 //double=0.0
double cost;                                                //boolean=false
boolean kkr;                                                //char= space
char grade;

String name="bheemlanayak";
Byte id1;
Short itemid1;
Long mobile1;
public void test() {
	System.out.println(id);
	System.out.println(itemid);
	System.out.println(orderid);
	System.out.println(mobile);

	System.out.println(miles);
	System.out.println(cost);
	System.out.println(id1);
	System.out.println(mobile1);
	System.out.println(kkr);
	System.out.println(grade);
}
			
public static void main(String[] args) {
	DataTypesTesting testing=new DataTypesTesting();
	testing.test();
	System.out.println(testing.mobile);
	System.out.println(testing.itemid1);
	
}			 
			 
			 
		
		

}
