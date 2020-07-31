

public class ColorTest {
	public static int sum(int x, int y) {
		return 10 * x + 2 * y;
	}

	public static void main(String[] args) {

		Color col = new Color(5, 3, 1, "홍길동");

		System.out.println(sum(col.getDoorLock(), col.getWindow()));

	}

}
