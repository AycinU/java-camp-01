
public class Ödev8 {

	public static void main(String[] args) {
		//STRINGS
		
    String mesaj = " Bugun hava yagmurlu. ";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı= "+mesaj.length());
		 System.out.println("5.eleman: "+mesaj.charAt(4));
		
		 System.out.println(         );
   System.out.println(mesaj.startsWith("B"));
   System.out.println(mesaj.endsWith("."));
   
   char[] karakterler = new char[5];
    //KOMUTUN DEVAMI HATA VERDİ SİDİM
		 System.out.println(mesaj.indexOf("a")); 
		 System.out.println(mesaj.lastIndexOf("a"));
		 
	System.out.println(mesaj.replace(' ', '-'));
	//düzeltme yapar
	
	System.out.println(mesaj.substring(2));
	//ordan itibaren başlar
	
	 for (String kelime : mesaj.split(" ")) {
	   System.out.println(mesaj);
	 
	}
	     System.out.println(           ) ;
      System.out.println(mesaj.toLowerCase());
      System.out.println(mesaj.toUpperCase());
      System.out.println(           ) ;
      
  System.out.println(mesaj.trim());    
	 
}
}