package edu.sbcc.cs105;

import java.util.ArrayList;

public class ProteinSequence{
	private int startCodonIndex;
	private int stopCodonIndex;
	
	//private ArrayList<ProteinSequence> list = new ArrayList<ProteinSequence>();
	//list.add(CodonSequence.proteinSequences);
	
	
	public int getStartCodonIndex() {
		
		return startCodonIndex;
	}
	
	public int getStopCodonIndex() {
		
		return stopCodonIndex;
	}
	
	public void setStartCodonIndex(int index) {
		startCodonIndex = index;
		
	}
	
	public void setStopCodonIndex(int index) {
		stopCodonIndex = index;
		
	}
}
