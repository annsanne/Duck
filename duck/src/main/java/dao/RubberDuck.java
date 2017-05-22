package dao;

public class RubberDuck extends Duck{
	public RubberDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "橡胶的";
		String b = super.display();
		return a+b;
	}
}
