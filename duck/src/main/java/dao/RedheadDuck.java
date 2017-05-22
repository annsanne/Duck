package dao;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public String swim(){
		return super.swim();
	}
	public String display(){
		String a = "红头的";
		String b = super.display();
		return a+b;
	}
}
