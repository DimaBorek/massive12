package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userNum=0,minNumer=3, oddArrIndex=0;
        int[] randArr;
        int[] oddArr;

        boolean flag=true, oddFlag=true;
        do
        {
            Scanner str=new Scanner(System.in);
            if(str.hasNextInt())
            {
                userNum=str.nextInt();
                if(userNum>minNumer) flag=false;
                else  System.out.println("again");
            }
            else System.out.println("again");
        }while(flag);

        randArr=new int[userNum];

        for (int i = 0; i < randArr.length; i++)
        {
            randArr[i] = (int)(Math.random()*(userNum+1));
            if(randArr[i]%2==0) oddArrIndex++;
            System.out.print(randArr[i]+" ");
        }

        oddArr=new int[oddArrIndex];
        System.out.println();

        for (int i = 0,j=0; i < oddArrIndex; i++)
        {
            do
            {
                oddFlag=true;
                if(randArr[j]%2==0)
                {
                    oddArr[i]=randArr[j];
                    oddFlag=false;
                }
                j++;
            }while(oddFlag);
            System.out.print(oddArr[i]+" ");
        }
    }
}
