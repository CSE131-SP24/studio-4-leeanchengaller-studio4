package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (shape.equals("ellipse")) {
			
			if (isFilled == true) {
				StdDraw.filledEllipse(a, b, c, d);
			}
			if (isFilled == false) {
				StdDraw.ellipse(a, b, c, d);	
			}
		}

		if (shape.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(a, b, c, d);
			}
			if (isFilled == false) {
				StdDraw.rectangle(a, b, c, d);	
			}
		}
		
		if (shape.equals("triangle")) {
			double e = in.nextDouble();
			double g = in.nextDouble();
			double[] x = {a, c, e};
			double[] y = {b, d, g};
			if (isFilled == true) {
				StdDraw.filledPolygon(x, y);
			}
			if (isFilled == false) {
				StdDraw.polygon(x, y);	
			}
		}
	}
}
