package application;

import validation.InputValidation;

import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("사용자와 대결하고 싶다면 1, 컴퓨터와의 대결을 하고싶다면 2를 눌러주세요");
		String user_input_coin = InputImport.getInputSettings().readLine();
		try{
			if (!InputValidation.validation("user_input_coin",user_input_coin)){
				throw new IllegalArgumentException("Please press 1 or 2");
			}
		}catch (IllegalArgumentException e){
			System.out.println("Not Accept Value");
			return;
		}
	}
}
