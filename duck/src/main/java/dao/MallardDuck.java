package dao;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "野生的";
		String b = super.display();
		return a+b;
	}
}
