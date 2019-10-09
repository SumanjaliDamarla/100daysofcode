class CNote {
	int pagesLeft;
	int pagesNeeded;
	int budget;
	int booksCount;
	public CNote() {
	}
	public setValues( int pagesLeft,
		int pagesNeeded,
		int budget,
		int booksCount ) {
		this.pagesLeft = pagesLeft;
		this.pagesNeeded = pagesNeeded;
		this.budget = budget;
		this.booksCount = booksCount;
	}
	public boolean decideLuck(int numberOfPages[], int cost[]) {
		boolean lucky = false;
		if(pagesNeeded <= pagesLeft)	lucky = true;
		for(int i = 0; i < booksCount; i++) {
			if(pagesNeeded - pagesLeft <= numberOfPages[i])
				if(cost[i] <= budget)
					lucky = true;
		}
		return lucky;
	}
}
