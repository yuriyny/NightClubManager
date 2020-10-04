package model;

import java.io.Serializable;
import java.util.ArrayList;

public class ChampagneBag implements Serializable {
	ArrayList<Champagne> arr;
	private int size;
	private String price;
	private int bought = 0;
	public ChampagneBag(int size, String price){
		arr = new ArrayList<Champagne>(size);
		this.size = size;
		this.price = price;
		for(int i = 0; i < size; i++){
			arr.add(new Champagne(price));
		}
	}
	
	public void remove(){
		size--;
		arr.remove(size);
		bought ++;
		
	}
	public int getSize(){
		return arr.size();
	}
	
	public String getPrice(){
		return price;
	}
	public int getBought(){
		return bought;
	}

}
