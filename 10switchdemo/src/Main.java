
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçitiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}
	}

}
