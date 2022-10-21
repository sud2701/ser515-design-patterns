public class Reminder {

    private NodeVisitor nv;

    Reminder(){
        System.out.println("Visitor Pattern Started!!");
        nv=new ReminderVisitor();
    }
    public void visitProduct(Product p) {
        p.accept(nv);
    }

    @SuppressWarnings("unused")
    public void visitTrading(Trading t) {
        t.accept(nv);
    }

    public void visitFacade(Facade f) {
        nv.visitFacade(f);
    }


}
