
public class Main {
    public static void main(String[] args) {
        // Object Oriented(Nesne Yönelimli ) ATM Programý
        
        // Login Class'ý Kullanýcý Giriþini Kontrol Edecek.
        
        // Hesap Class'ý Hesap Ýþlemlerini Yapacak.
        
        // ATM ise atmmizi çalýþtýracak.
        
    	Atm atm = new Atm();
        
        Hesap hesap = new Hesap("Mustafa Murat","12345", 2000);
        
        atm.calis(hesap);
        System.out.println("Programdan Çýkýlýyor...");
        
        
        
        
    }
 
}
