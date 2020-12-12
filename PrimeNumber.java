package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	int prime = 13;
	boolean flag = false;
	  for (int i = 2; i <= prime / 2; i++) {
	    if (prime % i == 0) {
		flag = true;
		//System.out.println("inside");
		break;
	} 
}
	//System.out.println(flag);
if(flag == false) {
		System.out.println(prime  + " is a prime number");
	}else {
		System.out.println(prime  + " is not a prime number");
	}

	}

}

