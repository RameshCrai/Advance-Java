package Fonts;

import java.awt.GraphicsEnvironment;

public class Listfontjava {
	public static void main(String[] args) {
		String fnames[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String f : fnames) {
			System.out.println("fonts " + f);

		}
		System.out.println("fonts " + fnames.length);

	}

}
