package _03_23_OTTOBRE._01_BUILDER;

public abstract class ColdDrink implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
