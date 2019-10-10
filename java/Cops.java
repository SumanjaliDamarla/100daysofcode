import java.util.Scanner;
class Cops {
	int numOfCops;
	int dist;
	public final int HOUSES = 100;
	public final boolean SAFE = true;
	public final boolean UNSAFE = false;
	Cops() {
	}
	public void setValues(int numOfCops, int speed, int time) {
		this.numOfCops = numOfCops;
		this.dist = speed * time;
	}
	public int getSafeCount(int[] cops) {
		boolean[] house = new boolean[HOUSES];
		int safeCount = HOUSES;
		for(int i = 0; i < HOUSES; i++) {
			house[i] = SAFE;
		}
		for(int i = 0; i < numOfCops; i++) {
			int lSafe = cops[i] - dist - 1;
			int rSafe = cops[i] + dist - 1;
			if(lSafe < 0)	lSafe = 0;
			if(rSafe >= HOUSES)	rSafe = HOUSES - 1;
			for(int j = lSafe; j <= rSafe; j++) {
				if(house[j])	safeCount--;
				house[j] = UNSAFE;
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
