package lianxi;

public class Cat extends Animal implements pet {
	String name;
    public Cat(String name) {
		super(4);
		this.name=name;
		// TODO Auto-generated constructor stub
	}
    public Cat()
    {
    	this("");
    }
	


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("cat is playing");
		
	}
	
}
