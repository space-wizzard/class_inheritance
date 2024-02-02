package Chapter05_Quiz02;

public class Marine extends unit {
	public Marine() {
		this.name = "Marine";
		this.attack = 6;
		this.HP = 40;
	}
	
	

	@Override
	public void Attack(unit unit) {
		int attack_flag = (int)(Math.random()*10);
		if (attack_flag < 5) {
			System.out.println(this.name + " Successfully Attacked!");
			unit.HP=unit.HP-this.attack;
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
