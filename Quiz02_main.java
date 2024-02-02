package Chapter05_Quiz02;

import java.util.Scanner;

public class Quiz02_main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Zergling z = new Zergling();
		Marine m = new Marine();
		//업캐스팅 ... 상위 클래스(unit_implements)가 하위 클래스(zergling,marine) 요소에 접근 가능
		unit_implements zer = z;
		unit_implements mar = m;
		while(true) {
			System.out.println("Select num");
			int num = input.nextInt();
			switch(num) {
			case 1:
				zer.Attack(z);
				System.out.println("HP left:" + z.HP);
				if(z.HP < 0) {
					System.out.println("Marine win!");
					System.exit(0);
				}
				break;
			case 2:
				mar.Attack(m);
				System.out.println("HP left:" + m.HP);
				if(m.HP < 0) {
					System.out.println("Marine win!");
					System.exit(0);
				}
				
				break;
			case 3:
				System.out.println("Terminate Game");
				input.close();
				System.exit(0);
			}
		}
	}

}
