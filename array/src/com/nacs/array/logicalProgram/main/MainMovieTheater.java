package com.nacs.array.logicalProgram.main;

import com.nacs.array.logicalProgram.MovieTheater;

public class MainMovieTheater {
	public static void main(String[] args) {
		MovieTheater theater1 = new MovieTheater();
		String[][] seats = new String[3][];
		String flag = "Booked";

		theater1.bookTickets(new String[] { null, "Booked", null },
				new String[] { "Booked", "Booked", null, "Booked", "Booked" },
				new String[] { "Booked", null, null, "Booked", "Booked", null });
		System.out.println();
		theater1.bookedSeats();
		theater1.bookTickets(seats);
		System.out.println();
	}

}
