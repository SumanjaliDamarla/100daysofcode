import java.util.Scanner;
class FrgtnLng {
	int newWordCount;
	int oldWordCount;
	public final String PRESENT = "YES";
	public final String ABSENT = "NO";
	public Frgtnlng() {
	}
	public void setValues(int newWordCount,	int oldWordCount ) {
		this.oldWordCount = oldWordCount;
		this.newWordCount = newWordCount;
	}
	public String getIsOld(String oldWords[], String newWords[]) {
		String word = ABSENT;
		return word;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		FrgtnLng lng = new FrgtnLng();
	}
}
