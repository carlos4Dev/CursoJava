package examenmodulo2;

import java.util.StringTokenizer;

public class Articulo {
	private String titulo;
	private String cuerpo;

	public Articulo(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}

	public Articulo() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public void mostrarCuerpoConToken() {		
		
		StringTokenizer tokens = new StringTokenizer(this.getCuerpo(),
				".");
		while(tokens.hasMoreTokens())
		{
			System.out.println(tokens.nextToken());
		}
	}

}
