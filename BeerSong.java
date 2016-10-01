
public class BeerSong {
	public static void main(String[] args) {
		Ninety_Nine_Bottles_of_Beer();
	}
	
	public static void Ninety_Nine_Bottles_of_Beer(){
		int count = 99;
		while(count > 1){
			System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer,");
			count--;
			System.out.println("take one down, pass it around, " + count + " bottles of beer on the wall.");
		}		
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer,");
		System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
	}

}
