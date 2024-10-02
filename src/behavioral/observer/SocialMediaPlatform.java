package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaPlatform {
	 private List<Observer> observers = new ArrayList<>();
	    
	    public void addObserver(Observer observer) {
	        observers.add(observer);
	    }

	    public void removeObserver(Observer observer) {
	        observers.remove(observer);
	    }

	    public void notifyUsers(String message) {
	        for (Observer observer : observers) {
	            observer.update(message);
	        }
	    }

	    public void newActivity(String activity) {
	        notifyUsers("New activity: " + activity);
	    }
	}