public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ProductList productList;

	public void visitProduct(Product product) {
		System.out.println("Visiting Product");
	}

	public Reminder visitTrading(Trading trading) {
		System.out.println("Visiting Trading");
		return null;
	}

	public void visitFacade(Facade facade) {
		System.out.println("Visiting Facade");
	}

}
