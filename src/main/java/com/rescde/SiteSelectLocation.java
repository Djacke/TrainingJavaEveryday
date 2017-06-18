package com.rescde;

import java.util.ArrayList;
import java.util.List;

public class SiteSelectLocation {

	private final double DD = 111.1;
	
	public List<double[]> siteLocation(double[][] towers, double[][] sites, int d){
		int towerCount = towers.length;
		int siteCount = sites.length;
		List<double[]> newSiteList = new ArrayList<>();
		double[][] distance = new double[towerCount][siteCount];
		
		//计算每一个杆塔到气象站的距离,将经纬度转换成公里 * DD
		for(int i=0;i<towerCount;i++){
			for(int j=0;j<siteCount;j++){
				distance[i][j] = Math.sqrt(Math.pow(towers[i][0]-sites[j][0], 2) + Math.pow(towers[i][1]-sites[j][1], 2))*DD;
			}
		}
		//计算每个杆塔到每个气象站的最小距离
		double[] minDis = new double[towerCount];
		for(int i=0;i<towerCount;i++){
			minDis[i] = distance[i][0];
			for(int j=0;j<siteCount;j++){
				if(minDis[i] > distance[i][j]){
					minDis[i] = distance[i][j];
				}
			}
		}
		//计算每个杆塔到离它最近的自动站的距离，去除距离小于d的杆塔
		double[][] unMinDis = new double[towerCount][2];
		int l = 0;
		for(int k=0;k<towerCount;k++){
			if(minDis[k] > d){
				unMinDis[l][0] = towers[k][0];
				unMinDis[l][1] = towers[k][1];
				l++;
			}
		}
		
		double[] disanceTemp = new double[unMinDis.length];
		while(unMinDis.length > 0){
		   double[]	newSiteLoc = unMinDis[0];
		   
		   //循环三次，更新三次圆心
		   for(int i=0;i<3;i++){
			   //计算剩余杆塔到一个新站点的距离，所以disTemp为一维数组
			   for(int j=0;j<unMinDis.length;j++){
				   disanceTemp[j] = Math.sqrt(Math.pow(unMinDis[j][0]-newSiteLoc[0],2) + Math.pow(unMinDis[j][1]-newSiteLoc[1], 2))*DD;
			   }
			   //筛选处于圆内的杆塔
			   double[][] nearbyTower = new double[unMinDis.length][2];
			   int k = 0;
			   for(int j=0;j<disanceTemp.length;j++){
				   if(disanceTemp[j] <= d){
					   nearbyTower[k][0] = unMinDis[j][0];
					   nearbyTower[k][1] = unMinDis[j][1];
					   k++;
				   }
			   }
			   //更新圆心
			   for(int m=0;m<nearbyTower.length;m++){
				   newSiteLoc[0] += nearbyTower[m][0];
				   newSiteLoc[1] += nearbyTower[m][1];
			   }
			   newSiteLoc[0] = newSiteLoc[0]/nearbyTower.length;
			   newSiteLoc[1] = newSiteLoc[1]/nearbyTower.length;
		   }
		   //删除到新气象站的距离小于d的杆塔
		   double[][] uunMinDis = new double[unMinDis.length][2];
		   int n = 0;
		   for(int k=0;k<unMinDis.length;k++){
			   if(disanceTemp[k] <= d){
				   uunMinDis[n][0] = unMinDis[k][0];
				   uunMinDis[n][1] = unMinDis[k][1];
				   n++;
			   }
		   }
		   unMinDis = uunMinDis;
		   
		   newSiteList.add(newSiteLoc);
		}
		return newSiteList;
	}
}
