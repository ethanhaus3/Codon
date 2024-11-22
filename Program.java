package edu.sbcc.cs105;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CodonSequence cs = new CodonSequence();
		CodonSequence cs2 = new CodonSequence();
		CodonSequence cs3 = new CodonSequence();
		ProteinSequence pS2 = new ProteinSequence();
		ProteinSequence pS3 = new ProteinSequence();
		
		
		File file = new File("testSequence.txt");
		Scanner scnr = new Scanner(file);
		while(scnr.hasNextLine()) {
			String reader = scnr.nextLine();
			//System.out.println(reader);
			cs.addNucleotide(reader);
			
			
		}
		scnr.close();
		Scanner scnr2 = new Scanner(file);
		String first = scnr2.nextLine();
		while(scnr2.hasNextLine()) {
			String rest = scnr2.nextLine();
			cs2.addNucleotide(rest);
		}
		cs2.addNucleotide(first);
		scnr2.close();
		Scanner scnr3 = new Scanner(file);
		String first1 = scnr3.nextLine();
		String second2 = scnr3.nextLine();
		while(scnr3.hasNextLine()) {
			String rest2 = scnr3.nextLine();
			cs3.addNucleotide(rest2);
		}
		cs3.addNucleotide(first1);
		cs3.addNucleotide(second2);
		scnr3.close();		
		
		int number = cs.findAllProteinSequences();
		System.out.println("Number of Sequences: " + number);
		cs.print();
		System.out.println("");
		System.out.println("******");
		System.out.println("");
		int number2 = cs2.findAllProteinSequences();
		System.out.println("Number of Sequences: " + number2);
		System.out.print("Sequence: 0");
		int stop =  0; //cs2.pS.getStartCodonIndex();
		int start = cs2.pS.getStopCodonIndex();
		int number3 = cs3.findAllProteinSequences();
		int stop2 = cs3.pS.getStartCodonIndex();
		int start2 = cs3.pS.getStopCodonIndex();
		
		System.out.print(" Start Codon: " + stop);
		System.out.println(" Stop Codon: " + start);
		cs2.print();
		System.out.println("");
		System.out.println("******");
		
		System.out.println("Number of Sequences: " + number3);
		System.out.print("Sequence: 0");
		
		
		System.out.print(" Start Codon: " + stop2);
		System.out.println(" Stop Codon: " + start2);
		cs3.print();
	}

}
