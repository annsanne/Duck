package action;

import dao.Duck;
import dao.FlyNoWay;
import dao.FlyWithRocket;
import dao.FlyWithWings;
import dao.MallardDuck;
import dao.MuteQuack;
import dao.Quack;
import dao.RedheadDuck;
import dao.RubberDuck;
import dao.Squack;

public class DuckTest {
	
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		Duck rubber = new RubberDuck();
		Duck redhead = new RedheadDuck();
		//野生鸭子
		String mallard_display = mallard.display();
		mallard.setQuackBehavior(new Quack());
		String a = mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithWings());
		String b = mallard.performFly();
		System.out.println("这是一只" + mallard_display + "它" + a + "而且"+ b + ",可以" + mallard.swim());
		//橡胶鸭子
		String rubber_display = rubber.display();
		rubber.setQuackBehavior(new Squack());
		String c = rubber.performQuack();
		rubber.setFlyBehavior(new FlyNoWay());
		String d = rubber.performFly();
		System.out.println("这是一只" + rubber_display + "它" + c + "而且"+ d + ",可以" + mallard.swim());
		//红头鸭子
		String redhead_display = redhead.display();
		redhead.setQuackBehavior(new MuteQuack());
		String e = redhead.performQuack();
		redhead.setFlyBehavior(new FlyWithRocket());
		String f = redhead.performFly();
		System.out.println("这是一只" + redhead_display + "它" + e + "而且"+ f + ",可以" + mallard.swim());
	}

}
