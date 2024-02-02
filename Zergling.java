package Chapter05_Quiz02;

public class Zergling extends unit{
	public Zergling() {
		this.name = "Zergling";
		this.HP = 35;
		this.attack = 5;
	}
	
	@Override
	public void Attack(unit unit) {
		int attack_flag = (int)(Math.random()*10);
		if (attack_flag<5) {
			System.out.println(this.name + " Successful Attacked!");
			unit.HP = unit.HP - this.attack;
		}
		else {
			System.out.println("Attack Failed!");
			unit.Defense();
			System.out.println();
		}
		
	}
	@Override
	public void Defense() {
		System.out.println(this.name + " Successful Defensed!");
		
	}
}


