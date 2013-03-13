package be.intec.implementations;

import be.intec.interfaces.Observer;

public class Internet implements Observer {
	
private String name;
	
	public Internet (String name) {
		
		this.name = name;
		
	}
	
	public void setName ( String name ) {
		
		this.name = name;
		
	}
	
	public String getName () {
		
		return this.name;
		
	}

	@Override
	public void update(float index) {
		System.out.println(this.name + ": Stock index updated, new Rate is: " + index);
	}
	
	@Override
	public String toString(){
		
		return this.name;
		
	}
	
}
