package Trab07;

public class PrincipalTrab07 {
	
	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto("Mario ", " Nitendo ", 1 , 50 , 200);
		Piloto piloto2 = new Piloto("yoshi ", " Dino " , 4, 50 , 90);
		Piloto piloto3 = new Piloto("Mario verde ", " sega " , 3 , 50 , 150);
		
		piloto1.start();
		piloto2.start();
		piloto3.start();
		
		
		Piloto p1 = new Piloto("Leclerc", "Ferrari", 9, 50, 100);
		Piloto p2 = new Piloto("Verstappen", "RBR/Honda", 3, 50, 110);
		Piloto p3 = new Piloto("Lewis Hamilton", "Mercedes", 15, 50, 150);
		
		p1.start();
		p2.start();
		p3.start();
	}
}
