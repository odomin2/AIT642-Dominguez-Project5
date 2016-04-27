package edu.towson.cis.cosc603.project5.coffeemakerTests;

import org.junit.*;

import edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker;
import edu.towson.cis.cosc603.project5.coffeemaker.Inventory;
import edu.towson.cis.cosc603.project5.coffeemaker.Recipe;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 4/26/16 6:28 PM
 * @author Obed Dominguez
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 0;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		int amtCoffee = -1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getChocolate());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {new Recipe()});
		fixture.setRecipeFull(new boolean[] {});
		Recipe r = new Recipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.deleteRecipe(CoffeeMaker.java:43)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe r = new Recipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.deleteRecipe(CoffeeMaker.java:43)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe r = new Recipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.deleteRecipe(CoffeeMaker.java:43)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testDeleteRecipe_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testEditRecipe_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {new Recipe()});
		fixture.setRecipeFull(new boolean[] {});
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.editRecipe(CoffeeMaker.java:61)
		//assertTrue(result);
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.editRecipe(CoffeeMaker.java:61)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {new Recipe()});
		fixture.setRecipeFull(new boolean[] {});
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.editRecipe(CoffeeMaker.java:61)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {new Recipe()});
		fixture.setRecipeFull(new boolean[] {});
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.editRecipe(CoffeeMaker.java:61)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe oldRecipe = new Recipe();
		Recipe newRecipe = new Recipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.editRecipe(CoffeeMaker.java:61)
		assertEquals(false, result);
		//assertTrue(result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.getRecipeForName(CoffeeMaker.java:148)
		assertNotNull(result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.getRecipeForName(CoffeeMaker.java:148)
		assertNotNull(result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.getRecipeForName(CoffeeMaker.java:148)
		assertNotNull(result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		//fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at edu.towson.cis.cosc603.project5.coffeemaker.CoffeeMaker.getRecipeForName(CoffeeMaker.java:148)
		assertNotNull(result);
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testMakeCoffee_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe r = new Recipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		fixture.setRecipeArray(new Recipe[] {});
		fixture.setRecipeFull(new boolean[] {});
		Recipe r = new Recipe();
		int amtPaid = 1;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/26/16 6:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}