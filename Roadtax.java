class Roadtax{
	public static void main(String args[]){
	String stateKeyword= "MP";
	int vehiclePrice=500000;
	switch(stateKeyword){
	case "KA":
	double roadTaxKar=0.18;
	double finalTaxKar=vehiclePrice*roadTaxKar;
	System.out.println("the tax to be paid is" +finalTaxKar);
	break;
	case "TN":
	double roadTaxTn=0.20;
	double finalTaxTn=vehiclePrice*roadTaxTn;
	System.out.println("the tax to be paid is" +finalTaxTn);
	break;
	case "AP":
	double roadTaxAp=0.25;
	double finalTaxAp=vehiclePrice*roadTaxAp;
	System.out.println("the tax to be paid is" +finalTaxAp);
	break;
	case "MP":
	double roadTaxMp=0.30;
	double finalTaxMp=vehiclePrice*roadTaxMp;
	System.out.println("the tax to be paid is" +finalTaxMp);
	break;
	default:System.out.println("Road tax not available for this vehicle");
}
}
}
	
