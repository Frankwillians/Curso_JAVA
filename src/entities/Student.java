package entities;

public class Student {
	public String name;
	public double N1;
	public double N2;
	public double N3;
	
	
	public double notas () {
		return N1 + N2 + N3; 
	}
	
	public double missingPoints() {
		if(notas() < 60) {
			return 60 - notas();
		}
		
		else {
			return 0;
		}
		

	}

}