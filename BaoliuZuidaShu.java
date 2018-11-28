package com.test;

import java.io.*;
public class BaoliuZuidaShu{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null){
            int cn = Integer.parseInt(br.readLine().trim());
            StringBuffer sb = new StringBuffer();
            sb.append(line);
            for(int i=0;i<cn;i++){
                int j=0;
                while(j+1<sb.length()&&sb.charAt(j)>=sb.charAt(j+1)){
                    j++;
                }
                if(j<=sb.length()-1){
                    sb.deleteCharAt(j);
                }
            }
            System.out.println(sb.toString());
        }

     
    }
    
}
