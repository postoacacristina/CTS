package abstractFactory;

public class HighBudgetFactory implements IFactory {

	@Override
	public IWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new MagicWeapon();
	}

	@Override
	public ICostume createCostume() {
		// TODO Auto-generated method stub
		return new MagicCostume();
	}

}