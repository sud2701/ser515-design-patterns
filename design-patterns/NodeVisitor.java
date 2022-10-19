public abstract class NodeVisitor {

	public abstract void visitProduct(Product product);

	public abstract Reminder visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}
