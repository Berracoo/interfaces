public class CustomerManager {

    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;

    }
    public void add(){
        // iş kodları yazılır
        customerDal.Add(); // CustomerManager ın customerDal ı var ve biz onu çağırıcaz.

    }
}
