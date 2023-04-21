package validation;

public class InputValidation {
	public static <T>boolean validation(String valid_type,T valid_param){
		if (valid_type.equals("user_input_coin")&&valid_param instanceof String){
			String user_input = (String) valid_param;
			if (user_input.matches("[1|2]")) return true;
		}

		return false;
	}
}
