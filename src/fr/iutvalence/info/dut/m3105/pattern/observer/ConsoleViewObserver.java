package fr.iutvalence.info.dut.m3105.pattern.observer;

public class ConsoleViewObserver implements ViewObserver {

	@Override
	public void notifyStateChange(TrafficSignalStateName name) {
		System.out.println("Traffic signal state is " + name);
	}

	@Override
	public void notifyButtonPressed() {
		System.out.println("button pressed!");		
	}

	@Override
	public void notifySecondEllapsed(int value) {
		System.out.println(value);		
	}

}
