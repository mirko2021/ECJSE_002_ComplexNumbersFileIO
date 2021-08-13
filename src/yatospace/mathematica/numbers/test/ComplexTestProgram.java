package yatospace.mathematica.numbers.test;

import java.util.Scanner;

import yatospace.mathematica.numbers.model.Complex;

/**
 * Complex number test program. 
 * @author VM
 * @version 1.0
 */
public class ComplexTestProgram { 	
	@SuppressWarnings("resource")
	public static void main(String ... args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Unesi prvi broj : "); 
			String text = scanner.nextLine();
			Complex a = Complex.loadComplex(text);
			System.out.println("Uneseni broj je : "+a);
			
			System.out.print("Unesi drugi broj : "); 
			text = scanner.nextLine();
			Complex b = Complex.loadComplex(text);
			System.out.println("Uneseni broj je : "+b);
			
			if(a==null) throw new NullPointerException();
			if(b==null) throw new NullPointerException();
			
			Complex c = a.clone(); 
			Complex d = a.clone(); 
			Complex e = a.clone();
			Complex f = a.clone();
			
			boolean z = b.module()==0;
			
			c.plus(b);
			d.minus(b);
			e.multipy(b);
			if(!z) f.divide(b);
			
			System.out.println("Vrijednost zbira : "+c);
			System.out.println("Vrijednost razlike : "+d);
			System.out.println("Vrijednost proizvoda : "+e);
			if(z) System.out.println("Vrijednost kolicnika : nedefinisana");
			if(!z) System.out.println("Vrijednost kolicnika : "+f);
			
			System.out.println("Moduo prvog broja je : "+a.module());
			System.out.println("Moduo drugog broja je : "+b.module());
			System.out.println("Moduo zbira : "+c.module());
			System.out.println("Moduo razlike : "+d.module());
			System.out.println("Moduo proizvoda : "+e.module());
			if(z) System.out.println("Moduo kolicnika : nedefinisana");
			if(!z) System.out.println("Modu kolicnika : "+f.module());
			
			if(a.module()==0) System.out.println("Faza prvog broja je : nedefinisana");
			else System.out.println("Faza prvog broja je : "+a.phase());
			if(b.module()==0) System.out.println("Faza drugog broja je : nedefinisana");
			else System.out.println("Faza drugog broja je : "+b.phase());
			if(c.module()==0) System.out.println("Faza zbira : nedefinisana");
			else System.out.println("Faza zbira : "+c.phase());
			if(d.module()==0) System.out.println("Faza razlike : nedefinisana");
			else System.out.println("Faza razlike : "+d.phase());
			if(e.module()==0) System.out.println("Faza proizvoda : nedefinisana");
			else System.out.println("Faza proizvoda : "+e.phase());
			if(z) System.out.println("Faza kolicnika : nedefinisana");
			if(!z) 
				if(f.module()==0) System.out.println("Faza kolicnika : nedefinisana");
				else              System.out.println("Faza kolicnika : "+f.phase());
		}catch(Exception ex) {
			System.out.println("Dogodila se greska.");
		}
	}
}
