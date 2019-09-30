import java.util.*;
class Lecandy {
    Scanner s;
    int elephantCount;
    int availableCandies;
    public Lecandy() {
	s = new Scanner(System.in);
    }
    public void setElephantCount(int elephantCount) {
	this.elephantCount = elephantCount;
    }
    public void setAvailableCandies(int availableCandies) {
	this.availableCandies = availableCandies;
    }
    public String zooIsHappy() {
	int candiesNeeded = 0;
        for(int i = 0; i < elephantCount; i++) {
	    candiesNeeded += s.nextInt();
	}
	if(availableCandies >= candiesNeeded) return "Yes";
	return "No";
    }
    public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int T = s.nextInt();
	Lecandy l = new Lecandy();
	String[] isHappy = new String[T];
	for(int i = 0; i < T; i++) {
	    l.setElephantCount(s.nextInt());
	    l.setAvailableCandies(s.nextInt());
	    isHappy[i] = l.zooIsHappy();
	}
	for(String value:isHappy) {
	    System.out.println(value);
	}
    }
}
