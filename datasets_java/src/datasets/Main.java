package datasets;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	static int sizeMyPage = 50000;
	static int sizeFriends = 5000000;
	static int sizeAccessLog = 10000000;
	//	static int sizeMyPage = 5;
	//	static int sizeFriends = 500;
	//	static int sizeAccessLog = 1000;

	static String fileMyPage = "mypage.txt";
	static String fileFriends = "friends.txt";
	static String fileAccessLog = "accesslog.txt"; 

	static PrintWriter writer = null;


	public static void main(String[] args) throws FileNotFoundException {
		MyPage[] myPageArray = new MyPage[sizeMyPage];
		Friends[] friendsArray = new Friends[sizeFriends];
		AccessLog[] accessLogArray = new AccessLog[sizeAccessLog];

		/* 
		 * mypage
		 */
		//		for(int i = 1; i <= sizeMyPage; i++) {
		//			myPageArray[i - 1] = new MyPage(i);
		//		}
		//		writer = new PrintWriter("../datasets/" + fileMyPage);
		//		for(int i = 0; i < myPageArray.length; i++) {
		//			writer.println(myPageArray[i].toString());
		//		}
		//		writer.close();

		/* 
		 * friends
		 */
		//		for(int i = 1; i <= sizeFriends; i++) {
		//			friendsArray[i - 1] = new Friends(i);
		//		}
		//		writer = new PrintWriter("../datasets/" + fileFriends);
		//		for(int i = 0; i < friendsArray.length; i++) {
		//			writer.println(friendsArray[i].toString());
		//		}
		//		writer.close();

		/* 
		 * accesslog
		 */
		//		for(int i = 1; i <= sizeAccessLog; i++) {
		//			accessLogArray[i - 1] = new AccessLog(i);
		//		}
		//		writer = new PrintWriter("../datasets/" + fileAccessLog);
		//		for(int i = 0; i < accessLogArray.length; i++) {
		//			writer.println(accessLogArray[i].toString());
		//		}
		//		writer.close();
		//		System.out.println("datasets files are created!");
	}

}
