package java1;

public class MobileClass {

		public void sendMessage() {
			String message="Hi";
			System.out.println("Message content:"+message);
		}
		public void shareDocument() {
			String document="html";
			System.out.println("Document is :"+document);
		}
	     public void call() {
	    	 String calling="pavi";
	    	 System.out.println("Connecting to :"+calling);
	     }
		public static void main(String[] args) {
			MobileClass mob=new MobileClass();
			mob.sendMessage();
			mob.shareDocument();
			mob.call();

		}


	}
