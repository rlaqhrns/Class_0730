
public class TruckTest {

	public static String addTruck(Truck truck, String driver) {
		return "객체와 문자열 파라미터로 전달되어 결합되어 반환된 값은 : " + truck.getCredit() + driver;
	}

	public static String muplier(Truck truck) {
		return truck.getTire() * 2 + truck.getCredit() + truck.getDriver();
	}

	public static double sum(int x, int y, double z) {
		return (x + y) / z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck(4, 250.2f, 1000, "Bk");
		int[] tire = { 1, 2, 3, 4, 5, 6 };
		double[] repaire = { 200.0, 202.5, 240.6, 250, 4, 300.7, 10.6 };
		int[] credit = { 10, 20, 30, 40, 50, 60 };
		String[] driver = { "홍길동", "장군", "민수", "형수", "철수", "민구" };
		Truck[] truck_1 = new Truck[6];

		double result = sum(truck.getCredit(), truck.getTire(), truck.getRepaire());

		for (int i = 0; i < truck_1.length; i++) {
			truck_1[i] = new Truck(tire[i], repaire[i], credit[i], driver[i]);
		}
//		for (Truck tru : truck_1) {
//			System.out.println("tire : " + tru.getTire());
//			System.out.println("repaire : " + tru.getRepaire());
//			System.out.println("credit : " + tru.getCredit());
//			System.out.println("driver : " + tru.getDriver());
//			System.out.println();
//		}
		System.out.println(result);
		String[] arrStr = new String[truck_1.length];
		for (int i = 0; i < truck_1.length; i++) {
			arrStr[i] = (muplier(truck_1[i]));

		}

//		for (String output : arrStr) {
//			System.out.println(output);
//		}
		for (int i = 0; i < truck_1.length; i++) {
			System.out.println(addTruck(truck_1[i], truck_1[i].getDriver()));
		}

	}

}
