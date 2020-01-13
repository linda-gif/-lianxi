package lianxi;

public class Fish extends Animal implements pet{
    private String name;
	public Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}
	
	public void walk()
	{
		System.out.println("swimming");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	

}
