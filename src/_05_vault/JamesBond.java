package _05_vault;

public class JamesBond {
	int findCode(Vault nani){
		for (int i = 0; i < 1000000; i++) {
			if (nani.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
