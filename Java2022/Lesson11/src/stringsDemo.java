
public class stringsDemo {

	public static void main(String[] args) {
		
		String Mesaj = "Bugun Hava Çok Güzel.";
		System.out.println(Mesaj);
		/*
		System.out.println("Eleman Sayısı: " + Mesaj.length());
		System.out.println("5. eleman: " + Mesaj.charAt(4));
		// Charat belirli bir karakter yakalamak için

		System.out.println(Mesaj.concat(" Yaşasın!")); // Mesajları Birleştirmek İçin
		System.out.println(Mesaj.startsWith("C")); //Boolean Döndürür O Harf İle Başladığını Kontrol Eder
		System.out.println(Mesaj.endsWith(".")); //Boolean Döndürür O Harf İle Bittiğini Kontrol Eder
		char[] Karakterler = new char[5];
		Mesaj.getChars(0, 5, Karakterler, 0); //Getchars Kullanımı İçin Array Açmalıyız
		System.out.println(Karakterler);
		System.out.println(Mesaj.indexOf("av")); //istenilen karakterin kaçıncı eleman olduğunu gösterir.
		System.out.println(Mesaj.lastIndexOf('e'));//aramaya sağdan başlayarak arama yapar.
		*/
		String yeniMesaj = Mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		
		System.out.println(Mesaj.substring(2,5)); // İstenilen indexten İtibaren Kes.(2. İndexten 5.İndexe Kadar.
		
		for(String kelime :Mesaj.split(" ")) {  //Kelimeleri Ayırıp Alt Alta Yazdırma
			System.out.println(kelime);
		}
		
		System.out.println(Mesaj.toLowerCase()); //Bütün Harfleri Küçük Harfe Çevirme İşlemi
		System.out.println(Mesaj.toUpperCase()); //Bütün Harfleri Büyük Harfe Çevirme İşlemi
		
		System.out.println(Mesaj.trim()); //Başındaki ve Sondaki Boşlukları Siler

	}

}
