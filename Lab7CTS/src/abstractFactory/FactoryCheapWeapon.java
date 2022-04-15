package abstractFactory;

public class FactoryCheapWeapon implements IFactory {

	@Override
	public IWeapon createWeapon() {
		// TODO Auto-generated method stub
		return new CheapWeapon();
	}

	@Override
	public ICostume createCostume() {
		// TODO Auto-generated method stub
		return new CheapCostume();
	}
}