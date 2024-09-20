package com;

public class Datadriven {

	public static void main(String[] args) {

		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\28march.xlsx","reg");
		int rows = rd.rowcount();
		System.out.println("rows : " + rows);
		int cols = rd.colcount();
		System.out.println("cols : " + cols);

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				String data = rd.getData(i, j);
				System.out.println(data);
			}
		}
	}
}
