public class Trading {

	private OfferingList offeringList;

	private Product product;

	public void accept(NodeVisitor nv) {
		System.out.println("Accept Method in Trading");
		nv.visitTrading(this);
	}
}
