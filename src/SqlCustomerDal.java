public class SqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void Add() {
        System.out.println("SQL eklendi.");
    }
}
