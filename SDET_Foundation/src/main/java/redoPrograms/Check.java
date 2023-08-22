package redoPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Check {

	public static void main(String[] args) {
		int count=0 , n =1;
		int[] flowerbed = {1,0,0,0,1};
		for (int i = 1; i < flowerbed.length-1; i++) {
			if (flowerbed[i]-1==0&&flowerbed[i]==0&&flowerbed[i]+1==0) {
				flowerbed[i]=1;
				n-=1;
			}
		}
		System.out.println(n<=0);
}
}