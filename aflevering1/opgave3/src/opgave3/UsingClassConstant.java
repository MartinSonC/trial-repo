package opgave3;

public class UsingClassConstant {
	/*Betragt nedenst�ende program.
	Foretag en lille �ndring i programmet, s� det udskriver f�lgende linjer:
	+-+-+-+
	+-+-+-+
	+-+-+-+
	K�r ogs� det �ndrede program med forskellige v�rdier af klassekonstanten, specielt 0, 1 og 2.*/
	
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
