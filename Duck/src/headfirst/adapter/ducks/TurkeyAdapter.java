package headfirst.adapter.ducks;

public class TurkeyAdapter implements headfirst.adapter.ducks.Duck {
	headfirst.adapter.ducks.Turkey turkey;
 
	public TurkeyAdapter(headfirst.adapter.ducks.Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
