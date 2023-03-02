
public class day16b  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DDe dd = new DDe();
		dd.one();
	}

}

interface Aa {
	
	abstract public  void one();
	abstract public  void two();
	abstract public  void three();
}

interface Bb {
	abstract public  void four();
	abstract public  void five();

}

interface Cc extends Aa , Bb {
	abstract public  void six();
	abstract public  void seven();
}


class DDe implements Cc {

	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		System.out.println("three");
	}

	@Override
	public void four() {
		// TODO Auto-generated method stub
		System.out.println("four");
	}

	@Override
	public void five() {
		// TODO Auto-generated method stub
		System.out.println("five");
	}

	@Override
	public void six() {
		// TODO Auto-generated method stub
		System.out.println("six");
	}

	@Override
	public void seven() {
		// TODO Auto-generated method stub
		System.out.println("seven");
	}
	
}
