package container;

import java.io.FileWriter;   
import java.io.IOException;  

public class Container {
	private Form[] forms = new Form[5];
	private FileWriter myWriter;
	
	void print(Out o) throws IOException {
		 if(o.getSaida() == 1) {
			 for (Form form : this.forms) {
				 System.out.println(form.toString());
				 
				}
			 
		 } else {
			myWriter = new FileWriter("texto.txt");
			 try { 
			 for (Form form : this.forms) {
				 myWriter.write(form.toString()+ " ");
				 myWriter.flush();
			 }
			 myWriter.close();
			 System.out.println("Escrito com sucesso no arquivo.");
			 
			 } catch (IOException e) {
			      System.out.println("Ocorreu um erro!");
			      e.printStackTrace();
			    }
		 }
	}

	void adicionar(Form form, int index) {
		this.forms[index] = form;
	}
	
	void remover(Form form, int index) {
		this.forms[index] = null;
	}

}
