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
}
