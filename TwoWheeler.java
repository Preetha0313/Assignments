package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 987654321l;
	boolean isPunctured = false;
	String bikeName = "pulsar";
	double runningKM = 65437.876;
	 
	public static void main(String[] args) {
      
		TwoWheeler myTwoWheeler = new TwoWheeler();
		System.out.println("no of wheels = " + myTwoWheeler.noOfWheels);
		System.out.println("no Of Mirrors = " + myTwoWheeler.noOfMirrors);
		System.out.println("chassis Number = " + myTwoWheeler.chassisNumber);
		System.out.println("is Punctured = " + myTwoWheeler.isPunctured);
		System.out.println("bike Name = " + myTwoWheeler.bikeName);
		System.out.println("running KM = " +myTwoWheeler.runningKM);
		}

}
