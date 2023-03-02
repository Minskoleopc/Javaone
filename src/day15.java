
public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String 
		// conditional statement 
		// switch case
		// arrays
		// loops
		// user defined data type
		// oops 
		// class
		// access modifier (private / protected)
		// Inheritance (single/ multi-level/hierarchy)
		// Interface
		// Polymorphism -- overloading and overriding 
		
		D d = new D();
		d.a();
		d.b();

	}

}

interface A {
	public void a();
	public void b();
	public void c();
	
}

interface B {
	
	public void c();
	public void d();
	public void e();
	
}

interface C {
	
	public void e();
	public void f();
	public void g();
	
}


class D implements A , B , C {

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void g() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void e() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}





