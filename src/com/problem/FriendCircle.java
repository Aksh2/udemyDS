package com.problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FriendCircle {

	public static void main(String[] args) {
		int[][] connections = {
				{1,1,0,0,0},
				{1,1,1,0,0},
				{0,1,1,0,0},
				{0,0,0,1,1},
				{0,0,0,1,1}
		};	
		
		ArrayList<ArrayList<Integer>> listOfCircles = new FriendCircle().getCircles(connections);
		for(ArrayList<Integer> circle: listOfCircles) {
			System.out.println(circle);
		}
		
		
	}
	
	ArrayList<ArrayList<Integer>> getCircles(int[][] connections){
		ArrayList<ArrayList<Integer>> listOfCircles = new ArrayList<ArrayList<Integer>>();
		boolean[] visited = new boolean[connections.length];
		for(int row=0;row<connections.length; row++) {
			if(visited[row]== true) {
				continue;
			}
			
			visited[row] = true;
			Queue<Integer> circleQ = new LinkedList<Integer>();
			circleQ.add(row);
			ArrayList<Integer> listOfFriends = new ArrayList<Integer>();
			while(!circleQ.isEmpty()) {
				int userId = circleQ.poll();
				listOfFriends.add(userId);
				
				for(int userFriendsId=0; userFriendsId< connections[0].length; userFriendsId++) {
					if(connections[userId][userFriendsId]==1 && visited[userFriendsId]!= true) {
						circleQ.add(userFriendsId);
						visited[userFriendsId] = true;
					}
				}
			}
			
			listOfCircles.add(listOfFriends);
		}
		return listOfCircles;
	}

}
