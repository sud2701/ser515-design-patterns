public class Reminder {

    private NodeVisitor nv;

    Reminder(){
        System.out.println("Visitor Pattern Started!!");
        nv=new ReminderVisitor();
    }
    public void visitFacade(Facade facade) {
        nv.visitFacade(facade);
    }

    @SuppressWarnings("unused")
    public void visitProduct(Product product) {
        product.accept(nv);
    }

    @SuppressWarnings("unused")
    public void visitTrading(Trading trading) {
        trading.accept(nv);
    }
}
