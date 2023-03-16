

enum Fruits {
	
		APPLE("red"),
		MANGO("yellow"),
		PAPAYA("orange");
	
		private String colorf;

		private Fruits(String cl) {
			this.colorf = cl;
		}
		
		public String getColor() {
			return this.colorf;
		}
	
}


public class day23D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits [] aa = Fruits.values();
		
		for(Fruits a :aa) {
			System.out.println(a.getColor());
		}
	}
	


}
