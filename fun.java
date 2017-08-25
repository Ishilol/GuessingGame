import java.util.Scanner;

public class fun {
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		boolean under = false;
		boolean upper = false;
		boolean play = true;
		int a = 0;
		int b = 0;



		do {


			// asking for lower and upper values
			// Insures that random value =/= cheat code
			System.out.println("Please enter in a minimum value (Min: -2147483648 Max: 2147483646)");
			do {
				a = cin.nextInt();
				if (a == 2147483647) {
					System.out.println("Please enter a lower value");
				} else {
					under = true;
				}
			} while (under == false);

			System.out.println("Please enter in an upper value (Max: 2147483647)");
			do {
				b = cin.nextInt();
				if (b < a || b == a) {
					System.out.println("Please enter in a value higher then " + a);
				} else {
					if (a == 666 && b == 666) {
						System.out.println("Please choose a higher upper value");
					} else {
						upper = true;
					}
				}
			} while (upper == false);


			// Insures that random value =/= cheat code
			int rVal = 0;
			boolean R = false;
			do {
				rVal = (int) (a + b * Math.random());
				if (rVal == 666) {
				} else {
					R = true;
				}
			} while (R == false);

			System.out.println("I'm thinking of a number between " + a + " and " + b + ".");
			System.out.println("Can you guess it?");
			int guess = 0;


			String Ins = "a";
			boolean C = false;
			do {
				guess = cin.nextInt();


				//cheat code
				if (guess == 666) {
					System.out.println(rVal);

					//Randomize Insult
				} else {
					int insult = (int) (1 + 6 * Math.random());
					if (insult == 1) {
						Ins = "Snob !";
					} else {
						if (insult == 2) {
							Ins = "Silly pants !";
						} else {
							if (insult == 3) {
								Ins = "Dumby !";
							} else {
								if (insult == 4) {
									Ins = "Uncultured swine !";
								} else {
									if (insult == 5) {
										Ins = "b-b-b-b-b-b-b-BAKA!!!!";
									} else {
										if (insult == 6)
											Ins = "Honzo main !";
									}
								}
							}
						}
					}


					//TOO LOW
					if (guess < rVal) {
						System.out.println("Too low ! " + Ins);
					} else {

						//TOO HIGH
						if (guess > rVal) {
							System.out.println("Too high ! " + Ins);
						} else {
							System.out.println("You win ! " + Ins);
							C = true;
						}

					}
				}
			}
			while (C == false);
			System.out.println("Would you like to keep playing? (0/1)");
			boolean oT = false;
			do
			{
				short ply = cin.nextShort();
				if (ply == 0) {
					play = false;
					oT = true;
				}else {
					if (ply == 1){oT = true;}
				}
			} while (oT == false);
		} while (play == true);
		cin.close();
	}
}
