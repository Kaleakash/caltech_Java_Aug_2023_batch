package mno;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("mailage: 50km/lt");
	}
}
class Honda extends Bike {
	@Override
	void speed() {
		System.out.println("speed	: 50km/hr");
	}	
}
class Pulsar extends Bike {
	void mailage() {
		System.out.println("mailage : 40km/lt");
	}
	@Override
	void speed() {
		System.out.println("speed   : 90km/hr");
	}
}
public class AbstractKeywordExample {
	public static void main(String[] args) {
		Honda hh = new Honda();			hh.mailage();  hh.speed();
		Pulsar pu = new Pulsar();		pu.mailage();  pu.speed();
	}

}

