package OOPAtm;

public class Main {  
    // Object Oriented(Nesne Yönelimli ) ATM Programı    
    // Login Class'ı Kullanıcı Girişini Kontrol Edecek.   
    // Hesap Class'ı Hesap İşlemlerini Yapacak.   
    // ATM ise atmmizi çalıştıracak.
        
    public static void main(String[] args) {
        Atm atm = new Atm();
        
        Account account = new Account("Mustafa Murat","12345", 2000);
        
        atm.calis(account);
        System.out.println("Programdan Çıkılıyor...");
    }
}
