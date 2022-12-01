package robot;

public class  Robot {
	protected int health;
	protected String name;
	
	public Robot() {
		this.health = 10;
		this.name = "";
	}
	
	public Robot(String b, int a) {
		this.name = b;
		this.health= a;
	}
	public Robot(String a) {
		this.name = a;
	}
	
	public int getHealth() {return health;}
	public String getName() {return name;}
	
	public void setHealth(int a) {
		this.health = a;
	}
	public void setName(String b) {
		this.name = b;
	}
	
	public String toString() {
		return "Robot "+this.name;
	}
	
    Robot fire(Robot r) {
    	Robot r2 = new Robot();
    	
    	if(!isDead(r)) {
		r.health -= 2;
		System.out.println(r.name + " a été touché par "+ this.name+". vie: "+r.health);
    	}
		return r;
	}
	
	public  boolean isDead(Robot r) {
		if(r.health == 0) {
			System.out.println(r.name + " est mort");
			return true;
		}
		return false;
	}
	
	public void show() {
		System.out.println("Robot "+this.name);
	}

	public static void main(String[] args) {
		Robot bob = new Robot("bob", 10);
		Robot john = new Robot("john", 10);
		
		bob.show();
		john.show();
		
		bob.fire(john);
		

	}

}
