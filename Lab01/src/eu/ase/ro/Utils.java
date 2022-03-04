package eu.ase.ro;

public class Utils {
	static int function(int v[],int k) {
	
	int	i=v[0];
	int	j=0;
	
		for(k=1; k< v.length; k++) {
			if(i== v[k])
				{
				j=j+1;
				}
			else
				if(i>v[k])
			{i=v[k];
			    j=1;
			    
			 }
			
			
			
			
		}
		return j;
	}
}

