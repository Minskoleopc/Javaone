
public class day22B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test a = new Test(Day.SUN);
		a.DisplayCourse();
		a.DisplayCourse2(Day.MON);
		
		Day [] days = Day.values();
		
		for(Day d:days) {
			System.out.println(d);
			System.out.println(d.ordinal());
		}
		
		

	}

}

enum Day {

	SUN, MON, TUE, WED, THU, FRI, SAT;

}

class Test {
	Day day;

	public Test(Day day) {
		this.day = day;
	}

	public void DisplayCourse() {

		switch (day) {
		case SUN:
			System.out.println("Python");
			break;
		case MON:
			System.out.println("Excel");
			break;
		case TUE:
			System.out.println("Selenium");
			break;
		case WED:
			System.out.println("Java");
			break;
		case THU:
			System.out.println("Javascript");
			break;
		case FRI:
			System.out.println("HTML");
			break;
		case SAT:
			System.out.println("Python");
			break;

		}

	}

	public void DisplayCourse2(Day a) {

		if (Day.SUN == a) {
			System.out.println("Python");
		} else if (Day.MON == a) {
			System.out.println("Python2");

		} else if (Day.TUE == a) {
			System.out.println("Python3");

		} else if (Day.WED == a) {
			System.out.println("Python4");

		} else if (Day.THU == a) {
			System.out.println("Python5");

		} else if (Day.FRI == a) {
			System.out.println("Python6");

		} else if (Day.SAT == a) {
			System.out.println("Python7");

		}

	}

}
