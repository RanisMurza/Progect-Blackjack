import java.util.Scanner;

public class Blackjack {
	
	public static Scanner sc = new Scanner(System.in);
	
	//количество очков у игрока
	public static int playerCount=0;
	//количество очков у Дилера
	public static int dealerCount=0;

	public static String rankDealer;
	public static String suitDealer;
	public static int sumDealer=0;
	//переменные чтобы хранить скрытую карту
	public static String rankDealerH;
	public static String suitDealerH;
	public static int hiddenCard=0;

	public static String rankPlayer;
	public static String suitPlayer;
    public static int sumPlayer=0;
	
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