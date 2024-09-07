package Lab;

import java.awt.GraphicsEnvironment;

public class ListFonts {
	public static void main(String[] args) {
		// Get the GraphicsEnvironment instance
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		// Retrieve all available font family names
		String[] fonts = ge.getAvailableFontFamilyNames();

		// Print out each font name
		System.out.println("List of available fonts:");
		for (String font : fonts) {
			System.out.println(font);
		}
	}
}
