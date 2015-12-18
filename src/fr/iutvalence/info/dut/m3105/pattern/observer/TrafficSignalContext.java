package fr.iutvalence.info.dut.m3105.pattern.observer;


public interface TrafficSignalContext
{
	public void registerViewObserver(ViewObserver state);
	
	public void unregisterViewObserver(ViewObserver state);
	
	public void setTrafficSignalState(TrafficSignalState state);
}
