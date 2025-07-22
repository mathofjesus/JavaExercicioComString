public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		// Criando um objeto da classe Aluno
		Aluno objeto = new Aluno();
		
		objeto.name = "Matheus";
		objeto.prova = 10;
		objeto.teste = 9;
		
		System.out.println(objeto.obterMedia());
		}
	}