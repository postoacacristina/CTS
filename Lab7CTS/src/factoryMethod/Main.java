package factoryMethod;

public class Main {

	public static void main(String[] args) {
		FactoryCheapWeapon factoryCheapWeapon=new FactoryCheapWeapon();
		IWeapon weapon=factoryCheapWeapon.create();
	}

}