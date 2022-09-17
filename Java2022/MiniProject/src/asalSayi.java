
public class asalSayi {

	public static void main(String[] args) {

		int number = 3;
		int remainder = number % 2;
		boolean isPrime = true;

		if (number < 2) {
			System.out.println("Geçersiz Sayı");
		}
		if (number == 1) {
			System.out.println("Sayı Asal Değildir");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("SAYI ASALDIR!");

		} else {
			System.out.println("SAYI ASAL DEĞİLDİR!");

		}
	}

}
