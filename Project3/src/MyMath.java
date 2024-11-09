
public class MyMath {
	public static int reverseNumber(int num) {
		int reverse = 0;
		if (num>0) {
			while(num!=0) {
				int r=num%10;
				reverse = reverse*10+r;
				num=num/10;
				
			}
			
		}
		else {
			System.out.println("can't reverse it");
		
		}
		return reverse;

}
	public static int sumofDigits(int num) {
		int sum=0;
		while (num>0) {
			int temp = num%10;
			sum= sum + temp;
			num = num / 10;
		}
		return sum;
		
	}
	public static int NoofDigits (int num) {
		int count = 0;
		while(num !=0) {
			int temp = num % 10;
			count++;
			 num = num/10;
		}
		return count;
	}
}
	