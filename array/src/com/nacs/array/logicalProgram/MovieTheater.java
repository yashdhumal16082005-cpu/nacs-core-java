package com.nacs.array.logicalProgram;

public class MovieTheater {
	private String[][] seats;

	public MovieTheater() {
	}

	public MovieTheater(String[][] seats) {
		this.seats = seats;
	}

	public void bookTickets(String[][] seats) {
		this.seats = seats;

	}

	public void bookedSeats() {
		for (int i = 0; i < seats[i].length; i++) {
			for (int j = 0; j < seats[i].length; j++)

				System.out.println(" " + ((seats[i][j] == null) ? "*" : "B") + " ");
		}
	}

	public void bookTickets(String[] strings, String[] strings2, String[] strings3) {
		// TODO Auto-generated method stub
		
	}
}
