package datasets;

public class AccessLog {
	
	public int accessId;		// unique sequential integer from 1 to 10,000,000
	public int byWho;			// id of the person who has accessed the Facebook page
	public int whatPage;		// if of the page that was accessed
	public String typeOfAccess;	// random text of characters of length between 20 and 50 explaining if viewed, left a note, added friendship, etc
	public int accessTime;		// random integer between 1 and 1,000,000
	
	public AccessLog(int accessId) {
		this.accessId = accessId;
		this.byWho = Helper.randInt(1, 50000);
		this.whatPage = Helper.randInt(1, 50000, this.byWho);
		this.typeOfAccess = Helper.randText("typeAcs", 20, 50);
		this.accessTime = Helper.randInt(1, 1000000);
	}
	
	public String toString() {
		return accessId + "," + byWho + "," + whatPage + "," + typeOfAccess + "," + accessTime;
	}
	
}
