package robot;

import java.util.Random;
import java.util.*;

public class Fighter extends Robot{
	private boolean seed;
	
	public Fighter() {
		super();
	}
	public Fighter(String a, int b) {
		super(a,b);
	}
	
	public void show() {
		System.out.println("Fighter "+this.name);
	}
	
	Fighter fire(Fighter r) {
		Fighter r2 = new Fighter();
		if(nextBoolean() == true) {
			r.health = r.health;
			System.out.println(r.name + " a été raté par "+ this.name+". vie: "+r.health);
		}else if(nextBoolean() == false){
			 r.health -= 2;
			 System.out.println(r.name + " a été touché par "+ this.name+". vie: "+r.health);
		}
		return r;
	}

	private boolean nextBoolean() {
		Random rand = new Random();
		seed = rand.nextBoolean();
		return seed;
	}
	
	public String toString() {
		return "Fighter "+this.name;
	}
	
	public static void main(String[] args) {
		
		Fighter F1 = new Fighter("Marc", 10); 
		Fighter F2 = new Fighter("Papi", 10);
		
		while(F1.health != 0 || F2.health != 0) {
			if(F1.health != 0 && F2.health != 0) {
		       F1.fire(F2);
	           F2.fire(F1);
			}else if(F1.health == 0 && F2.health == 0){
				System.out.println("Combat terminé");	
			}
		}

	}

}
