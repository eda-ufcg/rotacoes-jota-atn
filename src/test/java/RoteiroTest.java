import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class RoteiroTest {
    	
    @Test
    public void testIsAVL() {
    	BST bst = new BST();
    	assertTrue(bst.isAVL());
    	int[] values = new int[]{41,20,11,29,
    		32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
    	assertTrue(bst.isAVL());

    	bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertFalse(bst.isAVL());

		bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertFalse(bst.isAVL());    	

    	bst = new BST();
    	bst.add(10);
    	assertTrue(bst.isAVL());
    	bst.add(5);
    	assertTrue(bst.isAVL());
    	bst.add(1);
    	assertFalse(bst.isAVL());

    	bst = new BST();
    	bst.add(10);
    	assertTrue(bst.isAVL());
    	bst.add(5);
    	assertTrue(bst.isAVL());
    	bst.add(6);
    	assertFalse(bst.isAVL());

        bst = new BST();
    	values = new int[]{90,13,4,8,37,16,24,44,
    		42,88,51,72,81,84,92};
    	for (int i : values)
    		bst.add(i);
		assertFalse(bst.isAVL());

        bst = new BST();
		values = new int[]{23, 12, 40, 9, 25, 60, 50};
    	for (int i : values)
    		bst.add(i);
		assertTrue(bst.isAVL());
    }

	@Test
	public void testIsLeftPending() {

		BST bst = new BST();

		bst.add(100);
		bst.add(50);
		bst.add(25);

		assertTrue(bst.isLeftPending());

		bst = new BST();

		bst.add(100);
		bst.add(50);

		assertTrue(bst.isLeftPending());

		bst = new BST();

		bst.add(100);
		bst.add(150);

		assertFalse(bst.isLeftPending());

	}

	@Test
	public void testIsRightPending() {

		BST bst = new BST();

		bst.add(100);
		bst.add(150);
		bst.add(125);

		assertTrue(bst.isRightPending());

		bst = new BST();

		bst.add(100);
		bst.add(150);

		assertTrue(bst.isRightPending());

		bst = new BST();

		bst.add(100);
		bst.add(50);

		assertFalse(bst.isRightPending());

	}

}
