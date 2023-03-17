package set;

import java.io.IOException;

public class Main {
	
	public static void main (String[] args) throws IOException, InterruptedException {
		Set conjunto = new Set();
		Menu menu = new Menu(conjunto);
		
		menu.exibirMenu();
		
	}
}
