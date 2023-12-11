package timeUtils;

public class Main {
	
	public static void main(String[] args) {
		int tulos = TimeUtils.timeToSec("12:01:56");
		System.out.println(tulos);
		String tulos2 = TimeUtils.secToTime(1255);
		System.out.println(tulos2);
		

	}
}
