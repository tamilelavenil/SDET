package foundation;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SelfDividingNumbers {
/* Receive Input as two integers left and right
 * add numbers from left to right in list 1(condition numbers 1-9 are allowed, numbers containing 0 not allowed
 * iterate throught list1 and add num 1-9 and selfdividing numbers from list 1 to list2
 * return list2
 */
@Test
public void Test1() {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
	Assert.assertEquals(list, selfDividingNumbers(1, 22));
	;
}

@Test
public void Test2() {
	List<Integer> list = Arrays.asList(48, 55, 66, 77);
	Assert.assertEquals(list, selfDividingNumbers(47, 85));
	;
}

public List<Integer> selfDividingNumbers(int left, int right) {

	List<Integer> a = new ArrayList();
	List<Integer> b = new ArrayList();
	for (int i = left; i <= right; i++) {
		if (i >= 1 && i <= 9 || !String.valueOf(i).contains("0")) {
			a.add(i);
		}
		// add all the numbers between left to right
	}

	for (Integer integ : a) {
		if (integ >= 1 && integ <= 9) {
			b.add(integ); //adding numbers 1 to 9
		}
		if (integ > 9) {
			int n = integ;
			int r = 0;
			int count = 0;
			while (n > 0) {
				r = n % 10;
				if (integ % r == 0) {
					count++; //if self divisible increase count
				}
				n = n / 10;
				if (count == 2 || count == 3) {
					b.add(integ); //adding self divisible numbers
				}
			}
		}

	}
	return b;
}

}

