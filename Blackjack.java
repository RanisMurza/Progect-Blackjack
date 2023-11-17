import java.util.Scanner;

public class Blackjack {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//приветствие
		System.out.println("Добро пожаловать в консольную игру \"БЛЭКДЖЕК\"");
		startYN();
	}
	public static void startYN() {
		
		System.out.println("Пожалуйста, нажмите клавишу \"S\" для начала игры.");
		String ansStart = sc.nextLine();
		if(ansStart.equals("S")) {
			System.out.println("Начнем игру!");
		} else {
			startYN();
		}
	}
}