package java1;

public class Primeiscorrect {
	
	public static void main(String[] args) {
		int a=11;
		int count=0;
		for(int i=1;1<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println("prime");
		else 
			System.out.println("not prime");
	}

	}
