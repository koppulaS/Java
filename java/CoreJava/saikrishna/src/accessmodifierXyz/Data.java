package accessmodifierXyz;
                                      ///1st preference given to local variable not instance variable means id//
public class Data extends Data2 {
      int id=100; //instance variable    ///if we add this.id this it gives 1st preference to instance variable//
                                         ///if we add super.id then it gives 1st preference to super class variable//
                                        ///if we add constructor then it will re initialize data and gives the value ex=554//
      
      
      
	public void k1() {        
		int id=200;  //local variable//
		System.out.println("id value equals to"+this.id);
		
		}
	
	public Data(int id) {
											super();
											this.id = id;
										}

	public static void main(String[] args) {
		Data d=new Data(554);
		d.k1();
		
	}
}
