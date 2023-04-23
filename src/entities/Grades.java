package entities;

public class Grades {

	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	
	public double mediaNotas() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
}
