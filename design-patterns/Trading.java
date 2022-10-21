
public class Trading {

	public OfferingList offList;

	Trading(OfferingList off){
		this.offList=off;
	}

	public void accept(ReminderVisitor nv) {
		System.out.println("Accept Method in Trading");
		nv.visitTrading(this);
	}
}
