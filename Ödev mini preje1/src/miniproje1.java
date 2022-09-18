
public class miniproje1 {

	public static void main(String[] args) {

		int sayi = 13;
		int remainder = sayi % 2;
		System.out.println(remainder);
		
		System.out.println(          );
		
		boolean asal = true;
		 if (sayi==1) {
			 System.out.println("Geçersiz Asal değil");
			 return;
		 }
		
		
	 for (int i=2; i<sayi;i++) {
	    if(sayi % i ==0 )
		    asal = false;
		
	    if(asal) {
		  System.out.println("Sayı asal");
	    }else {
	    	System.out.println("Asal değil");
	    }
		 break;
		
		
		
		
		
		
		
	}

}
}