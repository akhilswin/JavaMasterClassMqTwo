package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.*;
import org.junit.jupiter.api.Test;

class MainClassTest {
	
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}
	
	@Test
	void testDeleteAndMergeFruitLists() throws Exception {
		// Test will pass
		ArrayList<String> fruitList1 = new ArrayList<String>();
		ArrayList<String> fruitList2 = new ArrayList<String>();
		fruitList1.add("Apple");
		fruitList1.add("Cherry");
		fruitList1.add("Grapes");
		fruitList2.add("Orange");
		fruitList2.add("Mango");
		fruitList2.add("Melon");
		fruitList2.add("Apple");
		String expectedResult[] = { "Cherry", "Grapes", "Orange" };
		List<String> list1 = Arrays.asList(expectedResult);
		FruitList fruitList = new FruitList(fruitList1, fruitList2);
		String result3[] = MainClass.deleteAndMergeFruitLists(3, fruitList.getFruitList1(), 4,
				fruitList.getFruitList2());
		List<String> list2 = Arrays.asList(result3);
		yakshaAssert(currentTest(), (list1.containsAll(list2) ? "true" : "false"), businessTestFile);
	}
}
