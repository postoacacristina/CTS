package factoryMethod;

public class FactoryNormalWeapon implements IFactory {

	@Override
	public IWeapon create() {
		// TODO Auto-generated method stub
		return new CheapWeapon();
	}

}