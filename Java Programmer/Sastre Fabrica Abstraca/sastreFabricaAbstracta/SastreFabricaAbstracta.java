package sastreFabricaAbstracta;
import nivel1.tipoTraje;
import nivel2.*;

public class SastreFabricaAbstracta {
	public int PrecioHombreBlazer() {
		tipoTraje HombreBlazer = new HombreBlazer();
		return (HombreBlazer.bolsillos().costeBolsillos()) +
				(HombreBlazer.piezas().costePiezas()) +
				(HombreBlazer.bolsillos().costeBolsillos()) +
				(HombreBlazer.hilos().costeHilos());
	}
	
	public String RegaloHombreBlazer() {
		tipoTraje HombreBlazer = new HombreBlazer();
		return "Tiene de regalo una " + HombreBlazer.regalo().
				obsequio();
	}
	
	public int PrecioHombreSencillo() {
		tipoTraje HombreSencillo = new HombreSencillo();
		return (HombreSencillo.bolsillos().costeBolsillos()) +
				(HombreSencillo.piezas().costePiezas()) +
				(HombreSencillo.bolsillos().costeBolsillos()) +
				(HombreSencillo.hilos().costeHilos());
	}
	
	public String RegaloHombreSencillo() {
		tipoTraje HombreSencillo = new HombreSencillo();
		return "Tiene de regalo una " + HombreSencillo.regalo().
				obsequio();
	}
	
	public int PrecioHombreDobleBoton() {
		tipoTraje HombreDobleBoton = new HombreDobleBoton();
		return (HombreDobleBoton.bolsillos().costeBolsillos()) +
				(HombreDobleBoton.piezas().costePiezas()) +
				(HombreDobleBoton.bolsillos().costeBolsillos()) +
				(HombreDobleBoton.hilos().costeHilos());
	}
	
	public String RegaloHombreDobleBoton() {
		tipoTraje HombreDobleBoton = new HombreDobleBoton();
		return "Tiene de regalo una " + HombreDobleBoton.regalo().
				obsequio();
	}
	
	public int PrecioMujerBlazer() {
		tipoTraje MujerBlazer = new MujerBlazer();
		return (MujerBlazer.bolsillos().costeBolsillos()) +
				(MujerBlazer.piezas().costePiezas()) +
				(MujerBlazer.bolsillos().costeBolsillos()) +
				(MujerBlazer.hilos().costeHilos());
	}
	
	public String RegaloMujerBlazer() {
		tipoTraje MujerBlazer = new MujerBlazer();
		return "Tiene de regalo una " + MujerBlazer.regalo().
				obsequio();
	}
	
	public int PrecioMujerSencillo() {
		tipoTraje MujerSencillo = new MujerSencillo();
		return (MujerSencillo.bolsillos().costeBolsillos()) +
				(MujerSencillo.piezas().costePiezas()) +
				(MujerSencillo.bolsillos().costeBolsillos()) +
				(MujerSencillo.hilos().costeHilos());
	}
	
	public String RegaloMujerSencillo() {
		tipoTraje MujerSencillo = new MujerSencillo();
		return "Tiene de regalo una " + MujerSencillo.regalo().
				obsequio();
	}
	
	public int PrecioMujerDobleBoton() {
		tipoTraje MujerDobleBoton = new MujerDobleBoton();
		return (MujerDobleBoton.bolsillos().costeBolsillos()) +
				(MujerDobleBoton.piezas().costePiezas()) +
				(MujerDobleBoton.bolsillos().costeBolsillos()) +
				(MujerDobleBoton.hilos().costeHilos());
	}
	
	public String RegaloMujerDobleBoton() {
		tipoTraje MujerDobleBoton = new MujerDobleBoton();
		return "Tiene de regalo una " + MujerDobleBoton.regalo().
				obsequio();
	}	
	
	 public static void main(String[] args) {
		 SastreFabricaAbstracta precios = new SastreFabricaAbstracta();
		 System.out.println("El traje con blazer para hombre cuesta " 
				 + precios.PrecioHombreBlazer() + " euros. " 
				 + precios.RegaloHombreBlazer() + ".");
		 System.out.println("El traje sencillo para hombre cuesta " 
				 + precios.PrecioHombreSencillo() + " euros. " 
				 + precios.RegaloHombreSencillo() + ".");
		 System.out.println("El traje con doble botón para hombre "
		 		+ "cuesta " + precios.PrecioHombreDobleBoton() + 
				 " euros. " + precios.RegaloHombreDobleBoton() + ".");
		 System.out.println("El traje con blazer para mujer cuesta " 
				 + precios.PrecioMujerBlazer() + " euros. " 
				 + precios.RegaloMujerBlazer() + ".");
		 System.out.println("El traje con doble botón para mujer "
		 		+ "cuesta " + precios.PrecioMujerSencillo() + 
				 " euros. " + precios.RegaloMujerSencillo() + ".");
		 System.out.println("El traje con doble botón para mujer "
		 		+ "cuesta " + precios.PrecioMujerDobleBoton() + 
				 " euros. " + precios.RegaloMujerDobleBoton() + ".");
	 }
}
