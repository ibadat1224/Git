package codeTraining;

import java.util.Arrays;

public class Car {

	public static void main(String[] args) {
		String model; 
		String make; 
		int year; 
		double currentSpeed; 
		boolean isRunning; 
		
		public void start() {
			System.out.println("car is starting");
			isRunning = true; 
		}
		
		public void stop() {
			System.out.println("car is stopping");
			isRunning = false; 
		}
		
		public void accelerate(int targetSpeed) {
			
			if(targetSpeed< currentSpeed) {
				System.out.println("you are already running more than target speed");
				return; 
			}
			
			while(currentSpeed<targetSpeed) {
				System.out.print(currentSpeed + " ");
				currentSpeed++ ; 			
			}
			System.out.println();
			
		}

		public void slowDown(int targetSpeed) {
			
			if(targetSpeed> currentSpeed) {
				System.out.println("you are already running less than target speed");
				return; 
			}
			
			while(currentSpeed>targetSpeed) {
				System.out.print(currentSpeed + " ");
				currentSpeed-- ; 			
			}
			System.out.println();
			
		}
		
		public String getCarInfo() {
			return "Make : "+make +" | Year : " +year +" | model + "+ model; 
		}
		
		public void readDirection(String d1,String d2,String d3) {
			System.out.println("truning to direction 1"+ d1);
			System.out.println("truning to direction 2 "+ d2);
			System.out.println("truning to direction 3 "+ d3);
			
		}
		
		public long getTotalDistance(long[] distancArr) {
			
			long sum = 0 ;
			for (long eachDistance : distancArr) {
				sum += eachDistance;
			}
			return sum; 
		}
		
		public long getMaxDistance(long[] distancArr) {
			
			long max = distancArr[0] ; 
			for (int i = 1; i < distancArr.length; i++) {
				if(distancArr[i]>max) {
					max = distancArr[i]; 
				}
			}
			// or you can do simply as below
			//Arrays.sort(distancArr);
			//return distancArr[distancArr.length-1];
			return max; 
		}
		
		public long[] removeEdgeDistance(long[] distancArr) {
			
			long[] newArr = new long[distancArr.length-2];
			Arrays.sort(distancArr);
			System.out.println(Arrays.toString(distancArr));
			for (int i = 1; i < distancArr.length-1; i++) {
				System.out.println();
				newArr[i-1] = distancArr[i];
			}
			return newArr; 
			
		}
		
	}

}