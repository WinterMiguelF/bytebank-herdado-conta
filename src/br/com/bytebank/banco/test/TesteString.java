package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String outro = new String("Alura"); //má prática, sempre prefira a sintaxe literal
		String nome = "Alura";
		System.out.println(nome.length());

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		String outra = nome.replace("A", "a");

		System.out.println(outra);

		nome.toLowerCase();

		System.out.println(nome);

		char c = nome.charAt(2);
		System.out.println(c);

		int pos = nome.indexOf("ur");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);

		String vazio ="    Alura    ";
		String outroVazio = vazio.trim(); //anula todos os espaços na string
		

		System.out.println(outroVazio);
		System.out.println(outroVazio.isEmpty());
		//impressao sem uso do TRIM
		System.out.println(vazio);
		//contains() - Este método verifica se uma String possui uma sub-String. Perguntaremos se a String vazio possui uma sub-String Alu
		System.out.println(vazio.contains("Alu"));


		
	}

}
