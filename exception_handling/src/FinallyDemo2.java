
public class FinallyDemo2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Risky code");
			//System.exit(0);			
		} catch (Exception e) {
			System.out.println("Handling code");
		}
			finally {
				System.out.println("cleap up code");
			}
		}
	}


