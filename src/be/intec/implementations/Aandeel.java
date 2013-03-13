package be.intec.implementations;

import java.util.ArrayList;

import be.intec.interfaces.Observer;
import be.intec.interfaces.Subject;

public class Aandeel implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	private String type;
	
	private float index;
	
	private String business;
	
	public Aandeel (String type, float interest, String bank) {
		this.type = type;
		this.index = interest;
		this.business = bank;
	}
	
	public float getIndex() {
		return index;
	}
	
	public void setIndex(float index) {
		this.index = index;
		notifyObservers();
	}
	
	public String getBusiness() {
		return this.business;
	}
	
	public String getType() {
		return this.type;
	}
	
	@Override
	public void registerObserver ( Observer observer ) {
		observers.add(observer);		
	}
	
	@Override
	public void removeObserver ( Observer observer ) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer ob : observers) {
			System.out.println("Notifying " + ob.toString() + " on change in stock index");
			ob.update(this.index);
		}
		
	}
	
}
