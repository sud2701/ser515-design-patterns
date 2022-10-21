
@SuppressWarnings(value="unused")
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public void visitProduct(Product product) {
		System.out.println("Visiting Product");

			product.trading.accept(this);
	}

	public void visitTrading(Trading trading) {
		System.out.println("Visiting Trading");

	}

	public void visitFacade(Facade facade) {
		System.out.println("Implementation of Visitor Pattern");
		visitProduct(facade.selectedProduct);
	}

}
