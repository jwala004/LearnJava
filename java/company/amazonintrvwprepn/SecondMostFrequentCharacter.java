package company.amazonintrvwprepn;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostFrequentCharacter {

	/*
	 * Find second most frequent character
	 */
	public static void main(String[] args) {

		String str = "bananassss";
		
//		System.out.println(nMostCommon("bananassss", 2));

		System.out.println(SecondMostFrequentCharacter.getSecondMostFrequent(str));
		
	}

//	M1 
	/*
	 * Generic implementation that will given you the n most common character
	 * 
	 * The answer is accomplished through sorting the set of map entries in
	 * descending order by the number of occurrences(value of the entry) and then
	 * picking n-1 (since base zero) indexes from the start of the list.
	 */
	public static char nMostCommon(String str, int n) {
		Map<Character, Long> counter = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		if (counter.size() < n) {
			throw new IllegalArgumentException("Not enough different characters.");
		}
		return counter.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
				.map(Map.Entry::getKey).collect(Collectors.toList()).get(n - 1);
	}

//	M2
	public static char getSecondMostFrequent(String text) {

		char[] charArray = text.toCharArray();

		// calculate char frequencies
		Map<Character, Integer> charFrequenciesMap = new HashMap<Character, Integer>();

		// loop1
		for (char c : charArray) {
			int frequency = 1;
			if (charFrequenciesMap.get(c) != null) {
				frequency = charFrequenciesMap.get(c) + 1;
			}
			charFrequenciesMap.put(c, frequency);
		}

		int currentMostFrequency = 0;
		int currentSecondMostFrequency = 0;
		char mostFrequentChar = '\u0000';
		char secondMostChar = '\u0000';

		// find second most frequent char
		Iterator<Entry<Character, Integer>> charFrequencies = charFrequenciesMap.entrySet().iterator();
		// loop2
		while (charFrequencies.hasNext()) {
			Entry<Character, Integer> entry = charFrequencies.next();

			char currentChar = entry.getKey();
			int frequency = entry.getValue();

			if (frequency > currentMostFrequency) {
				secondMostChar = mostFrequentChar;
				currentSecondMostFrequency = currentMostFrequency;
				currentMostFrequency = frequency;
				mostFrequentChar = currentChar;
			} else if (frequency > currentSecondMostFrequency) {
				currentSecondMostFrequency = frequency;
				secondMostChar = currentChar;
			}
		}
		return secondMostChar;
	}

}
