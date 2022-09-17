
public class recapDemo1 {

	public static void main(String[] args) {
		
		int Sayi1=27,Sayi2=25,Sayi3=2;
		
		int enBuyuk;
		if(Sayi1<Sayi2)
		{
			enBuyuk=Sayi2;
		}
		else
		{
			enBuyuk=Sayi1;
		}
		if(enBuyuk<Sayi3)
		{
			enBuyuk=Sayi3;
		}
		else {
			System.out.println("En Büyük Sayı: "+enBuyuk);
		}
		
		/* HOCANIN Çözümü
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) {
			
			enBuyuk = sayi2;
		}
		
		if(enBuyuk < sayi3) {
			
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = " +enBuyuk);
		*/
		
		

	}

}
