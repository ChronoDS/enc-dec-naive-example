import java.io.Reader;
import java.util.Random;

/* this is a naive symmetric encryption algorithm. 
 * NOT FOR USE IN A REAL ENCRYPTION, its really weak and only for principal understanding.
 */ 
public class Basic_Enc{ 
	public static int KEY = 87656789; 
	public static void main(String[] args) {}
	// DO NOT change! use this code for all encryption 
	//decryption tasks in Ex1. 

	public static int enc(int msg, int key) {
		Random rand = new Random(key);
		int s2=0;
		int rd = rand.nextInt(); 
		s2= msg^rd;
		
		return s2;
	}
}