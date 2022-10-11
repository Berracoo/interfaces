public class Main {
    public static void main(String[] args) {
        // interface ler bir class kabul edilmiyor ama classlar ve abstract classlar gibi referans tutabiliyorlar.
        // A class can implement multiple interfaces.
        // interfaceler de newlenemez. // direk interface i yapamazsın ama onu implemente eden sınıfları yapabilirsin.
        ICustomerDal customerDal = new OracleCustomerDal();
        // implemente edilmes istenen durumlarda ayrıcr aimpplemente edilmeesini istiyorsak o zaman kullanırız.

        // data access, iş  ve arayüz katmanları arasındaki geçişleri interfacler yardımıyla yaparız. Bağımlılıkları önlemek için

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add(); // direk çağırınca içi boş olduğu için null gönderecek gene stratejimizi uyguluyoruz.

    }

}