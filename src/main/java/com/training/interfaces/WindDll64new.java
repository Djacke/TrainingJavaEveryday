package com.training.interfaces;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface WindDll64new extends StdCallLibrary{
	
    public abstract int GetDavenportWind(double V_Set,double Davenport[],double DavenportWind[]);  
    
    public abstract int GetNewWindageYaw(double V_Set,double Param[], double NewWindageYaw[]);
    
    public abstract int GetNewWindDisplace (double V_Set,double Param[], double NewWindDisplace[]);
    
    WindDll64new INSTANCE = (WindDll64new) Native.loadLibrary("WindDll64new", WindDll64new.class); 
}
