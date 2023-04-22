package model;

import java.util.Random;

public class RandomGenerator {
	private final Random random=new Random();
	public int generateTargetNumber(){
		return random.nextInt(100) + 1;
	}

	public int generateMyNumber(int target_number){
		int my_number = 0;
		while (target_number==my_number){
			my_number=random.nextInt(100 + 1);
		}

		return my_number;
	}
}
