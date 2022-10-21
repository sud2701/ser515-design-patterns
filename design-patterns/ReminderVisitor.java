@SuppressWarnings(value="unused")
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	public void visitProduct(Product product) {

		System.out.println("Visiting Product");
	}

	public void visitTrading(Trading trading) {
		System.out.println("Visiting Trading");
	}

	public void visitFacade(Facade facade) {

		System.out.println("Visiting Facade");
	}

}
