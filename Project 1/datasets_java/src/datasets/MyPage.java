package datasets;

public class MyPage {
	
	public int id;				// unique sequential integer from 1 to 50,000
	public String name;   		// random sequence of characters of length between 10 and 20
	public String nationality; 	// random sequence of characters of length between 10 and 20
	public int countryCode;	// random integer between 1 and 10
	public String hobby;		// random sequence of characters of length between 10 and 20
	
	public MyPage(int id) {
		this.id = id;
		this.name = Helper.randText("name", 10, 20);
		this.nationality = Helper.randText("nation", 10, 20);
		this.countryCode = Helper.randInt(1, 10);
		this.hobby = Helper.randText("hobby", 10, 20);
	}
	
	public String toString() {
		return id + "," + name + "," + nationality + "," + countryCode + "," + hobby;
	}

}
