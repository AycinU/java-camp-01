
public class Ödev6 {

	public static void main(String[] args) {
		String ogrenci1 = "Ateş";
		String ogrenci2 = "Aylin";
		String ogrenci3 = "Burak";
		
		 System.out.println(ogrenci1);
		 System.out.println(ogrenci2);
		 System.out.println(ogrenci3);
		    //ancak bu yol cok uzun sürer
		 
 System.out.println(     ); 
		 
		 String[] ogrenciler = new String[3];
		 ogrenciler[0]="Ateş";
		 ogrenciler[1]="Aylin";
		 ogrenciler[2]="Burak";
		 
		 for(int i=0;i<ogrenciler.length;i++) {
		   System.out.println(ogrenciler[i]);
	}
	
		 System.out.println(     ); 
		 
	for(String ogrenci:ogrenciler) {
		System.out.println(ogrenci);

		
		
		
}
}
	
	
	
	
}