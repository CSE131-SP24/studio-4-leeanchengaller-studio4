package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		double x = 0.5;
		double y = 0.5;
		double halfwidth = 0.18;
		double halflength = 0.1;
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(x, y, halfwidth, halflength);
		
		double x1 = 0.5;
		double y1 = 0.5;
		double radius = 0.06;
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(x1, y1, radius);
		
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(x, y, halfwidth, halflength);
		
		double x2 = 0.5;
		double y2 = 0.5;
		double halfwid = 0.07;
		double halfleng = 0.005;
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(x2, y2, halfwid, halfleng);
		
		double x3 = 0.5;
		double y3 = 0.5;
		double halfwide = 0.005;
		double halflong = 0.07;
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(x3, y3, halfwide, halflong);

	}
}