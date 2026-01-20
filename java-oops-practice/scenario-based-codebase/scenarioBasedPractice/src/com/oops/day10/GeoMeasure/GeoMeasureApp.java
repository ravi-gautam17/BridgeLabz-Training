package com.opps.day10.GeoMeasure;

import java.util.*;

public class GeoMeasureApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Line> lines = new ArrayList<>();

		System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
		Line l1 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
		Line l2 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		lines.add(l1);
		lines.add(l2);

		LineComparator.compare(l1, l2);
		sc.close();
	}
}
