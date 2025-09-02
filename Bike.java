package day2java;

public class Bike {
	String Bkname;
	int BKNum;
	String BKModel;
	int Bkcost;
	double Bkrating;
	public static void main(String[]args) {
		Bike B1 = new Bike();
		B1.Bkname = "gt650";
		B1.BKNum = 2354;
		B1.BKModel = "hunter";
		B1.Bkcost = 150000;
		B1.Bkrating = 2.5;
		System.out.println("BIKE NAME :"+B1.Bkname);
		System.out.println("BIKE MODEL : "+B1.BKModel);
		System.out.println("BIKE NUMBER "+B1.BKNum);
		System.out.println("Bike COst :"+B1.Bkcost);
		System.out.println("BIKE Rating:"+B1.Bkrating);	
		Bike B2 = new Bike();
		B2.Bkname = "hero";
		B2.BKNum = 4256;
		B2.BKModel = "splendetr";
		B2.Bkcost = 10000;
		System.out.println("BIKE NAME :"+B2.Bkname);
		System.out.println("BIKE MODEL : "+B2.BKModel);
		System.out.println("BIKE NUMBER "+B2.BKNum);
		System.out.println("Bike COst :"+B2.Bkcost);
		System.out.println("BIKE Rating:"+B2.Bkrating);
		Bike B3 = new Bike();
		B3.Bkname = "royalenfled";
		B3.BKNum = 8089;
		B3.BKModel = "himalayan";
		B3.Bkcost = 60000;
		System.out.println("BIKE NAME :"+B3.Bkname);
		System.out.println("BIKE MODEL : "+B3.BKModel);
		System.out.println("BIKE NUMBER "+B3.BKNum);
		System.out.println("Bike COst :"+B3.Bkcost);
		System.out.println("BIKE Rating:"+B3.Bkrating);
		
		
		
		
		
	}
	
	

}
