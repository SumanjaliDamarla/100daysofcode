import java.util.Scanner;
class CNote {
	int pagesLeft;
	int pagesNeeded;
	int budget;
	int booksCount;
	public final String LUCKY = "LuckyChef";
	public final String UNLUCKY = "UnluckyChef";
	public CNote() {
	}
	public void setValues( int pagesLeft,
		int pagesNeeded,
		int budget,
		int booksCount ) {
		this.pagesLeft = pagesLeft;
		this.pagesNeeded = pagesNeeded;
		this.budget = budget;
		this.booksCount = booksCount;
	}
	public String decideLuck(int numberOfPages[], int cost[]) {
		String lucky = UNLUCKY;
		if(pagesNeeded <= pagesLeft)	lucky = LUCKY;
		for(int i = 0; i < booksCount; i++) {
			if(pagesNeeded - pagesLeft <= numberOfPages[i])
				if(cost[i] <= budget)
					lucky = LUCKY;
		}
		return lucky;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		CNote cnote = new CNote();
		String[] chefLuck = new String[T];
		for(int i = 0; i < T; i++) {
			int pagesNeeded = s.nextInt();
			int pagesLeft = s.nextInt();
			int budget = s.nextInt();
			int booksCount = s.nextInt();
			cnote.setValues(pagesLeft, pagesNeeded, budget, booksCount);
			int[] numberOfPages = new int[booksCount];
			int[] cost = new int[booksCount];	
			for(int j = 0; j < booksCount; j++) {
				numberOfPages[j] = s.nextInt();
				cost[j] = s.nextInt();
			}
			chefLuck[i] = cnote.decideLuck(numberOfPages, cost);
		}
		for(int i = 0; i < T; i++) {
			System.out.println(chefLuck[i] + " ");
		}
	}
}
