package com.test;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	public class ShuChuan{
	    public static void main(String[] args)throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n =Integer.parseInt(br.readLine().toString());
	        String[] str=br.readLine().toString().split(" ");
	        mySort(str,0,str.length-1);
	        StringBuffer sb = new StringBuffer();
	        for(int i=0;i<str.length-1;i++){
	            sb.append(str[i]);
	        }
	        System.out.println(sb.toString());
	        
	    }
	    public static boolean comp(String string1,String string2){
	        String str1=string1+string2;
	        String str2=string2+string1;
	        int s1=Integer.parseInt(str1);
	        int s2=Integer.parseInt(str2);
	        if(s1>=s2){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    public static void mySort(String[] str,int start,int end){
	        if(start<0||start>end||end>str.length-1){
	            return;
	        }
	        String cen= str[start];
	        int i=start;
	        int j=end;
	        while(i<j){
	            while(i<j){
	                if(comp(str[j],cen)){
	                    str[i]=str[j];
	                    i++;
	                    break;
	                }else{
	                    j--;
	                }
	            }
	            while(i<j){
	                if(comp(cen,str[i])){
	                    str[j]=str[i];
	                    j--;
	                    break;
	                }else{
	                    i++;
	                }
	            }
	            str[i]=cen;
	            mySort(str,start,i-1);
	            mySort(str,i+1,end);
	            
	        }
	    }
	    
	    
	}