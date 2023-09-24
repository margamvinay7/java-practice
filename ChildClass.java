/**
 * The code defines a parent class and a child class that extends the parent class, and creates an
 * object of the child class.
 */
class ParentClass{
	int a;
	ParentClass(int a){
		System.out.println("Inside ParentClass parameterized constructor!");
		this.a = a;
	}
	
	ParentClass(){
		System.out.println("Inside ParentClass default constructor!");
	}
}
class ChildClass extends ParentClass{

	ChildClass(int a){
		System.out.println("Inside ChildClass constructor!!");		
	}

	public static void main(String[] args) {

		ChildClass obj = new ChildClass(2);
System.out.println(obj.a);
	}

}
