package com.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) throws ParseException {
//		GrowthIceThickness1 ness = new GrowthIceThickness1();
		int    IceType=2;
		int    PreNumHour=12;
		double IniEquIceThi=0.0;
		double WindVelocity=5.0;
		double WindAngle=90.0;
		double LineAngle=0.0;
		double PrecipitationInt=0.5/60;
		double DropVelocitySnow=1.0;
		double DropsDiameter=0.1;
		double EquIceThickness[]={};
//		System.out.println(GrowthIceThickness.instance.GrowthIceThickness(IceType,PreNumHour,IniEquIceThi,WindVelocity,WindAngle,LineAngle,PrecipitationInt,
//				DropVelocitySnow,DropsDiameter,EquIceThickness));
//		System.out.println(WindageYawDLL.Instance.FPFX_GetVersion());
//		
//		double[] param = {26,400,22,1,2,0.1,-0.08};
//		double[] WindageYawGet = new double[2];
//		WindageYawDLL.Instance.FPFX_GetStatic(param, WindageYawGet);
//		
//		System.out.println(WindageYawGet[0] + "----" + WindageYawGet[1]);
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyymmddhhmmss");
		String str = "20161125094200";
		String ss=   "1480024800000";
		Date date = sim.parse(str);
		System.out.println(date.getTime());
	}

}
