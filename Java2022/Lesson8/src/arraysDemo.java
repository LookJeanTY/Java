
public class arraysDemo {

	public static void main(String[] args) {
		String ogr1="Engin";
		String ogr2="Derin";
		String ogr3="Enes";
		
		System.out.println(ogr1);
		System.out.println(ogr2);
		System.out.println(ogr3);
		
		System.out.println("================================");
		
		String[] ogrenciler = new String[5];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Enes";
		ogrenciler[3]="Tuncay";
		ogrenciler[4]="Ahmet";
		
		for(int i =0;i<ogrenciler.length;i++)
		{
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("================================");
		//Genelde Kullanılan Yöntem
		for (String ogrenci:ogrenciler)
		{
			System.out.println(ogrenci);
		}
		
		
		
	}

}
