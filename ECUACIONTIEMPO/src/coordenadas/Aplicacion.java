package coordenadas;

//import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		DiaDelAņo nuevoDia = new DiaDelAņo(4,3,2019);
		
		System.out.println(nuevoDia.esBisiesto());
		System.out.println(nuevoDia.getDiaDelAņo());
		System.out.println(nuevoDia.getAnguloFromDia());
		System.out.println(nuevoDia.getEcuacionTiempo());

	}

}
