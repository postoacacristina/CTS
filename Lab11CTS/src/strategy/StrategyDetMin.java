package strategy;

public class StrategyDetMin implements IStrategy{

	@Override
	public int process(int[] v) {
		// TODO Auto-generated method stub
		if(v.length==0) {
			return 0;
		}
		int min=v[0];
		for(int i=1;i<v.length;i++) {
			if(min>v[i]) {
				min=v[i];
			}
		}
		return min;
	}

}
