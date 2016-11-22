package com.training.interfaces;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface GrowthIceThickness extends StdCallLibrary{
	
	public abstract int GrowthIceThickness(int     IceType,
	    int      PreNumHour,
	    double   IniEquIceThi,
		double    WindVelocity,
		double   WindAngle,
		double   LineAngle,
		double   PrecipitationInt,
		double   DropVelocitySnow,
		double   DropsDiameter,
		double   EquIceThickness []);
	
	GrowthIceThickness instance = (GrowthIceThickness)Native.loadLibrary("C:\\Windows\\System32\\GrowthIceThickness.dll", GrowthIceThickness.class);


}
