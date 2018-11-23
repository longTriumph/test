package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Dianhuahaoma{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while((line=br.readLine())!=null){
            String str = line.trim();
            count(str);
        }
              
    }
    public static void count(String s){
        int numG=0;int numO=0;int numW=0;int numT=0;int numZ=0;int numU=0;int numX=0;int numS=0;
        int numI=0;int numF=0;
        char[] ch1= s.toCharArray();
        for(int i=0;i<ch1.length;i++){
            switch(ch1[i]){
                    case 'G':numG++;break;
                    case 'O':numO++;break;
                    case 'W':numW++;break;
                    case 'T':numT++;break;
                    case 'Z':numZ++;break;
                    case 'U':numU++;break;
                    case 'X':numX++;break;
                    case 'S':numS++;break;
                    case 'I':numI++;break;
                    case 'F':numF++;break;
            }
            
            
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<numG;i++) sb.append('0');//8
        for(int i=0;i<numI-numG-numX-numF+numU;i++) sb.append('1');//0
        for(int i=0;i<numZ;i++) sb.append('2');//0
        for(int i=0;i<numO-numZ-numW-numU;i++) sb.append('3');//1
        for(int i=0;i<numW;i++) sb.append('4');//2
        for(int i=0;i<numT-numW-numG;i++) sb.append('5');//3
        for(int i=0;i<numU;i++) sb.append('6');//4
        for(int i=0;i<numF-numU;i++) sb.append('7');//5
        for(int i=0;i<numX;i++) sb.append('8');//6
        for(int i=0;i<numS-numX;i++) sb.append('9');//7
        System.out.println(sb.toString());
    }
}