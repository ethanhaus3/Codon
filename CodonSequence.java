package edu.sbcc.cs105;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CodonSequence{
	//private ArrayList<String> nucList = new ArrayList<String>();
	private ArrayList<String> codonList = new ArrayList<String>();
	private String currentCodonString = "";
	private ArrayList<ProteinSequence> proteinSequences = new ArrayList<ProteinSequence>();
	ProteinSequence pS = new ProteinSequence();
	int counter = 0;
	
	
	public void addNucleotide(String nucleotide){
		
		currentCodonString = currentCodonString + nucleotide;
		counter++;
		while(counter==3) {
			codonList.add(currentCodonString);
			currentCodonString = "";
			counter = 0;
			
		}
		
		
		
		
//		for(int i = 0; i<nucList.size()-2;i=i+3) {
//			currentCodonString = nucList.get(i) + nucList.get(i+1) + nucList.get(i+2);
//			
//			codonList.add(currentCodonString);
//		}
		
		
	}
	
//	public ArrayList<ProteinSequence> addToList(ArrayList<String> list1, ArrayList<ProteinSequence> list2) {
//		if(list1.size() > 2) {
//			for(int i = 0; i< list1.size();i=i+3) {
//				currentCodonString = list1.get(i) + list1.get(i+1) + list1.get(i+2);
//				
//				//list2.add(list1.get(i));
//				//list2.add(list1.get(i+1));
//				//list2.add(list1.get(i+2));
//				
//				list2.add(currentCodonString);
//			}
//			return list2;
//		}else {
//			return list2;
//		}
//	}
	
	
		
	public int findAllProteinSequences() {
		
		int sequences = 0;
		//int result = 0;
	
		for(int i = 0; i<codonList.size();i++) {
			if(codonList.get(i).compareToIgnoreCase("AUG") == 0 || codonList.get(i).compareToIgnoreCase("GUG") == 0 || codonList.get(i).compareToIgnoreCase("UUG") == 0) {
				
				pS.setStartCodonIndex(i);
				for(int x = i;x<codonList.size();x++) {
					if(codonList.get(x).compareToIgnoreCase("UAA") == 0 || codonList.get(x).compareToIgnoreCase("UAG") == 0 || codonList.get(x).compareToIgnoreCase("UGA") == 0) {
						
						pS.setStopCodonIndex(x);
						sequences++;
						
							//String yes = Integer.toString(e);
						proteinSequences.add(pS);
						//System.out.println(i);
						//System.out.println(x);
						
					}
				}
			}
		}
		return sequences;
	
}
	
	public ProteinSequence getProteinSequence(int whichSequence) {
		//proteinSequences = addToList(codonList,proteinSequences);
		int index = proteinSequences.size();
		if(whichSequence < index-1) {
			return proteinSequences.get(whichSequence);
		}else {
			return null;
		}
		
		
	}
	
	public void print() {
		//int number = findAllProteinSequences();
		//System.out.println("Number of Sequences: " + number);
		//proteinSequences = addToList(codonList,proteinSequences);
		for(int i = 0;i<codonList.size();i++) {
			System.out.println(codonList.get(i));
		}
		
	}
	
}
