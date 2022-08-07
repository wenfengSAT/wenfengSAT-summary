package com.summary.java.base;



public class StringSplit {

	
	public void test() {
		int len = 10;
		String str = "a,b,c,d,e,f,g,h,i,j,k,m,n,o,p,q,w,y,z,x,2,9";
		String[] arr = str.split(",");
		int loop = str.length() / len;
		for (int i = 0; i < loop; i++) {
			String result = "";
			for (int j = 0; j < len; j++) {
				int index = i * len + j;
				if (index >= arr.length) {
					break;
				}
				result += arr[index];
			}
			System.out.println("====" + result);
		}

	}
}
