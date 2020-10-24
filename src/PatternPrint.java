
public class PatternPrint {

	public void print() {
		
		String test ="sheep";
		
		char[] stream = test.toCharArray();
		
		for(int i=stream.length-1;i>=0;i--) {
			System.out.print(stream[i]);
		}
		
		System.out.println();
		for(int i=0;i<=5;i++) {
			
			
		
				for(int k=1;k<=i;k++) {
				
				System.out.print(" ");
				
			}
				for(int j=5;j>=i;j--) {
					
					System.out.print("*");
					
				}
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PatternPrint pp= new PatternPrint();
		pp.print();

	}

}
