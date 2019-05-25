package _05_vault;

import java.util.Random;

public class Vault {
	
	int secretCode;
	
	Vault(){
		secretCode = new Random().nextInt(1_000_001);
	}
	
	public static void main(String[] args) {
		
		Vault vault = new Vault();
		JamesBond jamesbond = new JamesBond();
		
		System.out.println(jamesbond.findCode(vault));

		
	}


	boolean tryCode(int code){

		if (code == secretCode) {
			return true;
		}else {
			return false;
		}
	}
}
