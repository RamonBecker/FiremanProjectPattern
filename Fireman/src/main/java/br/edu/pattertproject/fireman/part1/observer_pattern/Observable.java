package br.edu.pattertproject.fireman.part1.observer_pattern;

public interface Observable {

	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notify(String message);

	
	public String recuperarEstado();

}
