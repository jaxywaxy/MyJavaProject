package com.firstjava.project;

public class MultiplicationTable {
	// print 5 times table
	void print() {
		print(9);
	}

	void print(int table) {
		print(table, 1, 10);

	}

	void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}

	}

}