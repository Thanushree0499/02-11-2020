class RoadTaxCalculation{
	public static void main(String args[]){
	String stateKeyword="KA";
	int vehiclePrice=500000;
	if(stateKeyword=="KA"){
	double roadTax=0.18;
	double finalTax=vehiclePrice*roadTax;
	System.out.println("Tax to be paid is" +finalTax);
	}	
	else if(stateKeyword=="TN"){
	double roadTax=0.20;
	double finalTax=vehiclePrice*roadTax;
	System.out.println("Tax to be paid is" +finalTax);
	}
	else if(stateKeyword=="AP"){
	double roadTax=0.25;
	double finalTax=vehiclePrice*roadTax;
	System.out.println("Tax to be paid is" +finalTax);
	}
	else{
	double roadTax=0.35;
	double finalTax=vehiclePrice*roadTax;
	System.out.println("Tax to be paid is" +finalTax);
	}
}
}
	