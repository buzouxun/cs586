package datasets;

public class Friends {

	public int friendRel;			// unique sequential integer from 1 to 5,000,000
	public int personId; 			// ID of a person, from 1 to 50,000
	public int myFriend;			// Reference ID of person you are friend with, from 1 to 50,000
	public int dateOfFriendship;	// random integer between 1 and 1,000,000
	public String desc;				// text of characters of length between 20 and 50. College friends, unknown, family, etc
	
	public Friends(int friendRel) {
		this.friendRel = friendRel;
		this.personId = Helper.randInt(1, 50000);
		this.myFriend = Helper.randInt(1, 50000, this.personId);
		this.dateOfFriendship = Helper.randInt(1, 1000000);
		this.desc = Helper.randText("desc", 20, 50);
	}
	
	public String toString() {
		return friendRel + "," + personId + ","+ myFriend + "," + dateOfFriendship + "," + desc;
	}
	
}
