package main;

public class ControlarLampada {

	public static void main(String[] args) {
		boolean[] lamps = new boolean[3];

		switchOn(0, lamps);
		switchOff(0, lamps);

		switchOn(1, lamps);

		for (int i = 0; i < lamps.length; i++) {
			System.out.println("Lâmpada " + (i + 1) + " está " + (lamps[i] ? "acesa" : "apagada"));
		}
	}

	public static void switchOn(int index, boolean[] lamps) {
		lamps[index] = !lamps[index];
	}

	public static void switchOff(int index, boolean[] lamps) {

	}

}
