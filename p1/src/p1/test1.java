package p1;

class popcorn {
	public void taste() {
		System.out.println("salty");
	}
}

public class test1 {

	public static void main(String[] args) {

		popcorn p = new popcorn() 
		{							// this is anon inner class 

			public void taste() {
				System.out.println("spicy");
			}
		};
		
		p.taste();
		
		popcorn p1 = new popcorn();
		p1.taste();
		
		popcorn p2 = new popcorn()
		{							// this is anon inner class
		 public void taste() {
			 System.out.println("sweet");
		 }
		
		};
		
		p2.taste();


	}

}
