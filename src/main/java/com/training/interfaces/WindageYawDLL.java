package com.training.interfaces;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public interface WindageYawDLL extends StdCallLibrary{

	public abstract double FPFX_GetVersion( );
	public abstract int FPFX_GetStatic(double Param[],double WindageYawGet[]);
	public abstract int FPFX_GetStaticParam(double Param[],double StaticParamGet[]);
	WindageYawDLL Instance = (WindageYawDLL)Native.loadLibrary("WindageYawDLL", WindageYawDLL.class);
}
