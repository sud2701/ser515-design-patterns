public class PersonFactory extends Person{


    PersonFactory(ProductMenu productMenu){
        super(productMenu);
        System.out.println("Factory Pattern Started: ");
    }

    @Override
    public void showMenu() {

    }

    @Override
    public void CreateProductMenu() {
    }

    public Person createPerson(int usertype){
        if(usertype==1){
            return new Seller();
        }
        else if(usertype==0){
            return new Buyer();
        }
        else{
            System.out.println("Invalid Value!!");
            System.exit(-1);
        }
        return null;
    }
}
