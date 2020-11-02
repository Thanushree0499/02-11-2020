class RoadTax1{
	public static void main(String args[]){
	String stateKeyword="KA";
	int vehiclePrice=500000;
	if(stateKeyword=="KA"){
	double roadTax=0.15;
	double finalTax=vehiclePrice*roadTax;
	System.out.println("tax to be paid is"+finalTax);
	}
	else{
	double roadTax=0.25;
	double finalTax=vehiclePrice*roadTax;
	System.out.println("tax to be paid is"+finalTax);
	}
}
}