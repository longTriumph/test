package com.test;
import java.util.Scanner;
public class Juzifanzhuan {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] str1 = str.split(" ");
        for(int i=str1.length-1;i>=0;i--){
            if(i==0){
                System.out.print(str1[i]);
            }else{
                System.out.print(str1[i]+" ");
            }
        }
    }
}