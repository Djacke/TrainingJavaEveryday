package com.training;

import com.training.interfaces.WindDll64new;

public class WindDll64NewTest {

	public static void main(String[] args) {
		double v_set = 50;
		double d1[] = new double[10001];
		double d2[] = new double[1001];
		for(int i=0;i<10001;i++){
			d1[i] = 0;
		}
		try{
			WindDll64new.INSTANCE.GetDavenportWind(v_set, d1, d2);
			for(double dd : d2){
				System.out.println(dd);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
