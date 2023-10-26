package xyz;
class Bike {
	void speed() {
		System.out.println("speed	: 60km/hr");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("mailage: 70km/lt");
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
public class MethodOverridingExample {
	public static void main(String[] args) {
		Honda hh = new Honda();			hh.mailage();  hh.speed();
		Pulsar pu = new Pulsar();		pu.mailage();  pu.speed();
	}

}
