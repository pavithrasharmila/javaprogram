package java1;

public class OddorEven {
		public void great() {
			for(int i=1;i<=25;i++) {
				if(i%2==1)
					System.out.println(i);
			}
		}
		public static void main(String[] args) {
			OddorEven obj=new OddorEven();
			obj.great();
		}

	}