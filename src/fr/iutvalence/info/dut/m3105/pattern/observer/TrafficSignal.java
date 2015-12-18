package fr.iutvalence.info.dut.m3105.pattern.observer;

import java.util.ArrayList;
import java.util.List;


public class TrafficSignal extends Thread implements TrafficSignalContext, TrafficSignalUserInterface
{
	private List<ViewObserver> observers;
	private TrafficSignalState currentState;
	
	public TrafficSignal() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerViewObserver(ViewObserver state){
		observers.add(state);
	}

	@Override
	public void unregisterViewObserver(ViewObserver state) {
		observers.remove(state);
	}	

	@Override
	public void setTrafficSignalState(TrafficSignalState state) {
		notifyStateChange(state.getName());
		this.currentState = state;	
		
	}
	
	private void notifyStateChange(TrafficSignalStateName name) {
		for (ViewObserver viewObserver : observers) {
			viewObserver.notifyStateChange(name);
		}
	}

	@Override
	public void pressButton()
	{
	/*	for(TrafficSignalState s : observers){
			s.buttonPressed();
		}*/
	}
	
	public void run()
	{
		this.setTrafficSignalState(new TrafficSignalGreenState(this));
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.currentState.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}


	
}
