package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		System.out.println(ogretmenKrediManager.hesapla(0));
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
				new OgretmenKrediManager(),new TarimKrediManager(), new OgrenciKrediManager()
			
		};
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
