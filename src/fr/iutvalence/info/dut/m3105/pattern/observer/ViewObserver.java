package fr.iutvalence.info.dut.m3105.pattern.observer;

public interface ViewObserver {
	
	void notifyStateChange(TrafficSignalStateName name);
	
	void notifyButtonPressed();
	
	void notifySecondEllapsed(int value);
}
