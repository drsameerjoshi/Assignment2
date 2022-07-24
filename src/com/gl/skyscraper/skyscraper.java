package com.gl.skyscraper;

import java.util.*;

	public class skyscraper {
			    public static void main(String args[]) {
			    	System.out.println("How many floors does the buiding have in total?: ");
			        Scanner sc = new Scanner(System.in);
			        int f = sc.nextInt();
			        int x[] = new int[f+1];
			        for(int i=1;i<f+1;i++){
			            System.out.println("What is the floor size on the given day?: "+i);
			            int m=sc.nextInt();
			            x[m]=i;
			        }
			        int j=f;
			        boolean flag;
			        System.out.println("Here's the order of construction: ");
			        for(int i=1;i<=f;i++){
			            flag=false;
			            System.out.println("Day "+i+" :");
			            while(j>=1 && x[j]<=i){
			                flag=true;
			                System.out.print(j +" ");
			                j--;
			            }
			            if(flag==true){
			                System.out.println();
			            }
			        }
			    }
			}