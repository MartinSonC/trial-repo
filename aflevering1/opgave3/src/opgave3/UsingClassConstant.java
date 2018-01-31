package opgave3;

public class UsingClassConstant {
	/*Betragt nedenstående program.
	Foretag en lille ændring i programmet, så det udskriver følgende linjer:
	+-+-+-+
	+-+-+-+
	+-+-+-+
	Kør også det ændrede program med forskellige værdier af klassekonstanten, specielt 0, 1 og 2.*/
	
	public static final int LINES = 3;
	
	public static void main(String[] args) {
		for (int i = 1; i <= LINES ; i++) {
			for (int j = 1; j <= LINES; j++) {
				System.out.print("+-");
			}
			System.out.println("+");
		}
	}
}
