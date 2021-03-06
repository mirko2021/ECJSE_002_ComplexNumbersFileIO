package yatospace.mathematica.numbers.test;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File; 

import yatospace.mathematica.numbers.model.Complex;

public class ComplexReportProgram {
	public static final String INPUT_PATH  = "C:\\Users\\VM\\eclipse-workspace\\002_ComplexNumbersFileIO\\IFolder\\input.txt"; 
	public static final String OUTPUT_PATH = "C:\\Users\\VM\\eclipse-workspace\\002_ComplexNumbersFileIO\\OFolder\\output.txt"; 
	
	public static void main(String ... args) {
		try (PrintWriter pwFout = new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File(OUTPUT_PATH)),"UTF-8"));
			Scanner scanner=new Scanner(new File(INPUT_PATH), "UTF-8")){
			
			String text = scanner.nextLine();
			System.out.println("Prvi broj ucitan iz ulazne datoteke.");
			Complex a = Complex.loadComplex(text);
			pwFout.println(a); System.out.println("Prvi broj je upisan u datoteku.");
			
			text = scanner.nextLine();
			System.out.println("Drugi broj ucitan iz ulazne datoteke.");
			Complex b = Complex.loadComplex(text);
			pwFout.println(b); System.out.println("Drugi broj je upisan u datoteku.");
			
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
			
			pwFout.println(c);
			System.out.println("Vrijednost zbira upisana u izlanu datoteku.");
			pwFout.println(d);
			System.out.println("Vrijednost razlike uspisana u izlaznu datoteku.");
			pwFout.println(e); 
			System.out.println("Vrijednost proizvoda upisana u izlaznu datoteku.");
			if(z) {
				pwFout.println("ND");
				System.out.println("Vrijednost kolicnika : nedefinisana. Upisano u izlaznu datoteku.");
			}
			if(!z) {
				pwFout.println(f); 
				System.out.println("Vrijednost kolicnika je upisana u datoteku.");
				
			}
			
			pwFout.println(a.module());
			System.out.println("Moduo prvog broja je upisan u izlaznu datoteku.");
			pwFout.println(b.module());
			System.out.println("Moduo drugog broja je upisan u izlaznu datoteku.");
			pwFout.println(c.module());
			System.out.println("Moduo zbira je upisan u izlaznu datoteku.");
			pwFout.println(d.module());
			System.out.println("Moduo razlike je upisan u izlaznu datoteku.");
			pwFout.println(e.module());
			System.out.println("Moduo proizvoda je upisan u izlaznu datoteku.");
			if(z) {
				pwFout.println("ND");
				System.out.println("Moduo kolicnika : nedefinisana. Upisano u izlaznu datoteku.");
			}
			if(!z) {
				pwFout.println(f.module());
				System.out.println("Moduo kolicnika upisan u izlaznu datoteku.");
			}
			
			if(a.module()==0) {
				pwFout.println("ND");
				System.out.println("Faza prvog broja je : nedefinisana. Upisano u izlaznu datoteku.");
			}
			else {
				pwFout.println(a.phase()); 
				System.out.println("Faza prvog broja je upisana u izlaznu datoteku.");
			}
			if(b.module()==0) {
				pwFout.println("ND");
				System.out.println("Faza drugog broja je : nedefinisana. Upisano u izlaznu datoteku.");
			}
			else {
				pwFout.println(b.phase());
				System.out.println("Faza drugog broja je upisana u izlaznu datoteku.");
			}
			if(c.module()==0) {
				pwFout.println("ND");
				System.out.println("Faza zbira : nedefinisana. Upisano u izlaznu datoteku.");
			}
			else {
				pwFout.println(c.phase());
				System.out.println("Faza zbira je upisana u izlaznu datoteku.");
			}
			if(d.module()==0) {
				pwFout.println("ND");
				System.out.println("Faza razlike : nedefinisana. Upisano u izlaznu datoteku.");
			}
			else {
				pwFout.println(d.phase());
				System.out.println("Faza razlike je upisana u izlaznu datoteku.");
			}
			if(e.module()==0) {
				pwFout.println("ND");
				System.out.println("Faza proizvoda : nedefinisana. Upisano u datoteku.");
			}
			else {
				pwFout.println(e.phase());
				System.out.println("Faza proizvoda upisana je u datoteku.");
			}
			if(z) {
				pwFout.println("ND");
				System.out.println("Faza kolicnika : nedefinisana. Upisano je u datoteku.");
			}
			if(!z) 
				if(f.module()==0) {
					pwFout.println("ND");
					System.out.println("Faza kolicnika : nedefinisana. ");
				}
				else {
					pwFout.println(f.phase());
					System.out.println("Faza kolicnika je upisana u izlaznu datoteku.");
				}
		}catch(Exception ex) {
			System.out.println("Dogodila se greska.");
		}
	}
}
