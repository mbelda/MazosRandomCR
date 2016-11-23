package tot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
	
	//Comunes
	private Carta esqueletos = new Carta("Esqueletos", true , 1);
	private Carta esp_hielo = new Carta("Espiritu de hielo", true, 1);
	private Carta duendes = new Carta("Duendes", true, 2);
	private Carta esp_fuego = new Carta("Espiritus de fuego", true, 2);
	private Carta descarga = new Carta("Descarga", true, 2);
	private Carta duendes_lanza = new Carta("Duendes con lanza", true, 2);
	private Carta caballero = new Carta("Caballero", true, 3);
	private Carta arqueras = new Carta("Arqueras", true, 3);
	private Carta esbirros = new Carta("Esbirros", true, 3);
	private Carta canon = new Carta("Cañon", true, 3);
	private Carta flechas = new Carta("Flechas", true, 3);
	private Carta rompe = new Carta("Rompemuros", true, 3);
	private Carta tesla = new Carta("Tesla", true, 4);
	private Carta mortero = new Carta("Mortero", true, 4);
	private Carta orda = new Carta("Orda de esbirros", true, 5);
	private Carta barbaros = new Carta("Barbaros", true, 5);
	private Carta giganoble = new Carta("Gigante noble", true, 6);
	
	//Especiales
	
	//private Carta golemhielo = new Carta("Golem de hielo", true, 2);
	private Carta megaesb = new Carta("Megaesbirro", true, 3);
	private Carta lapida = new Carta("Lapida", true, 3);
	private Carta mosq= new Carta("Mosquetera", true, 4);
	private Carta minipekka = new Carta("Minipekka", true, 4);
	private Carta valqui = new Carta("Valquiria", true, 4);
	private Carta monta = new Carta("Montapuercos", true, 4);
	private Carta horno = new Carta("Horno", true, 4);
	private Carta bola = new Carta("Bola de fuego", true, 4);
	private Carta giga = new Carta("Gigante", true, 5);
	private Carta recolector = new Carta("Recolector de elixir", true, 5);
	private Carta torrebomb = new Carta("Torre Bombardera", true, 5);
	private Carta mago = new Carta("Mago", true, 5);
	private Carta chozaduendes = new Carta("Choza de duendes", true, 5);
	private Carta torreinf = new Carta("Torre infernal", true, 5);
	private Carta cohete = new Carta("Cohete", true, 6);
	private Carta chozabarb = new Carta("Choza de barbaros", true, 7);
	private Carta trio = new Carta("Trio de mosqueteras", true, 9);
	
	
	//Epicas

	private Carta espejo = new Carta("Espejo", true, 0);
	private Carta rabia = new Carta("Rabia", true, 2);
	private Carta barrilete = new Carta("Barril de duendes", true, 3);
	private Carta guardia = new Carta("Guardia", true, 3);
	private Carta veneno = new Carta("Veneno", true, 4);
	private Carta baby = new Carta("Baby dragon", true, 4);
	private Carta ejesque= new Carta("Ejercito de esqueletos", true, 4);
	private Carta princosc = new Carta("Principe oscuro", true, 4);
	private Carta hielo = new Carta("Hielo", true, 4);
	private Carta principe = new Carta("Principe", true, 5);
	private Carta lanza = new Carta("Lanzarrocas", true, 5);
	private Carta bruja = new Carta("Bruja", true, 5);
	private Carta globo = new Carta("Globo", true, 5);
	private Carta ballesta= new Carta("Ballesta", true, 6);
	private Carta rayo = new Carta("Rayo", true, 6);
	private Carta esqgigante= new Carta("Esqueleto gigante", true, 6);
	private Carta pekka = new Carta("Pekka", true, 7);
	private Carta golem = new Carta("Golem", true, 8);
	
	
	//Legendarias
	
	//private Carta tronco = new Carta("Tronco", true, 2);
	//private Carta magohielo = new Carta("Mago de hielo", true, 3);
	//private Carta princesa = new Carta("Princesa", true, 3);
	//private Carta minero = new Carta("Minero", true, 3);
	//private Carta lenador= new Carta("Leñador", true, 4);
	//private Carta draginf= new Carta("Dragon infernal", true, 4);
	//private Carta cementerio= new Carta("Cementerio", true, 5);
	private Carta chispitas = new Carta("Chispitas", true, 6);
	//private Carta sabueso= new Carta("Sabueso de lava", true, 7);
	
	private Carta[] cartas = {esqueletos, duendes, descarga, esp_hielo, esp_fuego,
			duendes_lanza, caballero, arqueras, esbirros, canon, flechas, rompe, tesla,
			mortero, orda, barbaros, giganoble, megaesb, lapida, mosq,
			minipekka, valqui, monta, horno, bola, giga, recolector, torrebomb, mago,
			chozaduendes, torreinf, cohete, chozabarb, trio, espejo, rabia, barrilete,
			guardia, baby, ejesque, veneno, princosc, hielo, principe, lanza, bruja,
			globo, ballesta, rayo, esqgigante, pekka, golem, chispitas};
	private List<Carta> cartas1 = new ArrayList<Carta>();
	private List<Carta> cartas2 = new ArrayList<Carta>();

	private List<Carta> cartasAux = new ArrayList<Carta>();

	public Juego(){}
	
	public void play(){
		Scanner in = new Scanner(System.in);
		
		//Jugador1
		System.out.println("Jugador 1:");
		
		for(int i=0; i<4; i++){
			if(i>0){
				System.out.print("Mazo :");
				for(int j=0; j<cartas1.size(); j++){
					System.out.print(cartas1.get(j).getName() +" ("+
							cartas1.get(j).getElixir() + ") ");
				}
				System.out.println("");
			}
			
			int randomNum1;
			do{randomNum1 = (int)(Math.random() * cartas.length);}
			while(!cartas[randomNum1].isShow());
			cartas[randomNum1].setShow(false);
			
			
			int randomNum2;
			do{randomNum2 = (int)(Math.random() * cartas.length);}
			while(!cartas[randomNum2].isShow());
			cartas[randomNum2].setShow(false);
			
			
			System.out.println("Elige: " + '\n'+
					"1." + cartas[randomNum1].getName() + " ("+  cartas[randomNum1].getElixir() +")"+ '\n' +
					"2." + cartas[randomNum2].getName() + " ("+  cartas[randomNum2].getElixir() +")");
			int num = in.nextInt();
			if(num == 1){
				cartas1.add(cartas[randomNum1]);
				cartas2.add(cartas[randomNum2]);
			}else{
				cartas1.add(cartas[randomNum2]);
				cartas2.add(cartas[randomNum1]);
			}
			
			for(int k=0; k<100; k++){
				System.out.println("");
			}
		}
		
		//Jugador2
		System.out.println("Escribe algo");
		String ok6 = in.next();
		System.out.println("Jugador 2:");
		
		for(int i1=0; i1<4; i1++){
			if(i1>0){
				System.out.print("Mazo :");
				for(int j=0; j<cartasAux.size(); j++){
					System.out.print(cartasAux.get(j).getName() +" (" +
								cartasAux.get(j).getElixir() + ") ");
				}
				System.out.println("");
			}
			
			int randomNum1;
			do{randomNum1 = (int)(Math.random() * cartas.length);}
			while(!cartas[randomNum1].isShow());
			cartas[randomNum1].setShow(false);
			
			
			int randomNum2;
			do{randomNum2 = (int)(Math.random() * cartas.length);}
			while(!cartas[randomNum2].isShow());
			cartas[randomNum2].setShow(false);
			
			
			System.out.println("Elige: " + '\n'+
					"1." + cartas[randomNum1].getName() + " ("+  cartas[randomNum1].getElixir() +")"+ '\n' +
					"2." + cartas[randomNum2].getName() + " ("+  cartas[randomNum2].getElixir() +")");
			int num = in.nextInt();
			if(num == 1){
				cartas2.add(cartas[randomNum1]);
				cartasAux.add(cartas[randomNum1]);
				cartas1.add(cartas[randomNum2]);
			}else{
				cartas2.add(cartas[randomNum2]);
				cartasAux.add(cartas[randomNum2]);
				cartas1.add(cartas[randomNum1]);
			}
		
			for(int k=0; k<100; k++){
				System.out.println("");
			}
					
		}
		
		
		//Mostrar mazo 2
		for(int k=0; k<cartas2.size(); k++){
			System.out.println(cartas2.get(k).getName() +" ("+
					cartas2.get(k).getElixir() + ") ");
		}
		
		System.out.println("Escribe algo");
		String ok = in.next();
		for(int k=0; k<100; k++){
			System.out.println("");
		}
		
		
		//Mostrar mazo 1
		System.out.println("Escribe algo");
		String ok2 = in.next();
		
		for(int k=0; k<cartas1.size(); k++){
			System.out.println(cartas1.get(k).getName() +" ("+
					cartas1.get(k).getElixir() + ") ");
		}
		System.out.println("Escribe algo");
		String ok3 = in.next();
		for(int k=0; k<100; k++){
			System.out.println("");
		}
		}
	}
