package foundation;


	import org.junit.Assert;
	import org.junit.Test;

	public class CheckDuplicate {

		/*
		 * input: array of numbers output: true or false logic: create for loop to loop
		 * through all the elements create another for loop to loop through all the
		 * elements apart from the element from parent loop i.e, i+1 create condtional
		 * class inside the nested loop to check if duplicate is present, if yes return
		 * true or return false
		 */


		public boolean checkDup(int[] a) {

			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						return true;
					}
				}

			}
			return false;

		}

		@Test
		public void tst1() {
			Assert.assertEquals(false, checkDup(new int[] {1,2,3,4}));	
		}

		@Test
		public void tst2() {
			Assert.assertEquals(true, checkDup(new int[] {1,2,3,4,1}));	
		}

		@Test
		public void tst3() {
			Assert.assertEquals(false, checkDup(new int[] {}));	
		}

	}

