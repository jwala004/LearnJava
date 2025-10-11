package java8.naveenautomationlabs.interviewquestions;

public class HashMapTest {

	/*
	 * Why String is popular HashMap key in Java? Why HashMap key should be
	 * immutable in java?
	 * 
	 * As we know String is immutable, its hashcode is cached at the time of
	 * creation and it doesn't need to be calculated again. This makes it a great
	 * candidate for key in a Map and it's processing is faster than other HashMap
	 * key objects. This is why String is mostly used Object as HashMap keys.
	 * 
	 * String as key provides better stability to HashMap. Using mutable objects as
	 * key, fails in runtime. It creates null key.
	 * 
	 * For this basic reasoning, key objects are suggested to be IMMUTABLE.
	 * IMMUTABILITY allows you to get same hash code every time, for a key object.
	 * So it actually solves most of the problems in one go. Also, this class must
	 * honor the hashCode() and equals() methods contract.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
