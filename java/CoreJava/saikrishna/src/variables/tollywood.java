package variables;

public class tollywood {
	
	public void raja() {//zero argument method or no argument method or non paralized method//
		System.out.println("chola dynasty");
	}
	
	public void students (int number) {//argument method or paralized method//
		System.out.println(number);
	}
	public void netbankingtypes(int numbers) {//argument method//
		System.out.println(numbers);
	}
	public void mobilenames(String name) {//argument method//
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		tollywood ref=new tollywood();
		ref.students(198);
		ref.netbankingtypes(12);
		ref.mobilenames("redminote");
		ref.raja();
	}

}
