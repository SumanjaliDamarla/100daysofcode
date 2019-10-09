import java.util.Scanner;
class Cops {
	int numOfCops;
	int dist;
	public final int HOUSES = 100;
	Cops() {
	}
	public void setValues(int numOfCops, int speed, int time) {
		this.numOfCops = numOfCops;
		this.dist = speed * time;
	}
	public int getSafeCount(int[] cops) {
		boolean[] safeHouses = new boolean[HOUSES];
		int safeCount = HOUSES;
		for(int i = 0; i < HOUSES; i++) {
			safeHouses[i] = true;
		}
		for(int i = 0; i < numOfCops; i++) {
			for(int j = cops[i] - dist; j <= cops[i] + dist; j++) {
				if(safeHouses[j])	safeCount--;
				safeHouses[j] = false;
			}
		}
		return safeCount;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		Cops cops = new Cops();
		int[] safeCount = new int[T];
		for(int i = 0; i < T; i++) {
			int numOfCops = s.nextInt();
			int speed = s.nextInt();
			int time = s.nextInt();
			cops.setValues(numOfCops, speed, time);
			int[] copsList = new int[numOfCops];
			for(int j = 0; j < numOfCops; j++) {
				copsList[j] = s.nextInt();
			}
			safeCount[i] = cops.getSafeCount(copsList);
		}
		for(int i = 0; i < T; i++) {
			System.out.println(safeCount[i] + " ");
		}
	}
}
