package oct_14;


interface Action{
    void run();
	void sit();
}

class Animal{
	private String name;
	Animal(String sname){
		name=sname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal implements Action{

	Dog(String sname) {
		super(sname);
		System.out.println("Dog generated");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println(this.getName()+"Dog is running");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sit() {
		System.out.println(this.getName()+"Dog is siting");
		// TODO Auto-generated method stub
		
	}
	
}

class Cat extends Animal implements Action{

	Cat(String sname) {
		super(sname);
		System.out.println("Cat generated");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.print(this.getName()+"cat is running\n");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sit() {
		System.out.println(this.getName()+" cat is siting");
		// TODO Auto-generated method stub
		
	}
	
}


public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Action dog=new Dog("dog A");
		Action cat=new Cat("cat A");
		dog.run();
		cat.run();
		
	}

}
