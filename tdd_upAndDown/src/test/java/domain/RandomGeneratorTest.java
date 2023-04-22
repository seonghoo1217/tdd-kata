package domain;

import model.RandomGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorTest {

	private static RandomGenerator randomGenerator;

	@BeforeEach
	public void initObject(){
		randomGenerator=new RandomGenerator();
	}

	@Test
	@DisplayName("컴퓨터_숫자생성_범위_옳바른지")
	public void 숫자생성_범위(){
		assertThat(randomGenerator.generateTargetNumber()).isBetween(1,100);
	}
}
