package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputImport {
	public static BufferedReader getInputSettings(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		return br;
	}
}
