import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ArrayIndexTest {

    private ArrayIndex testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new ArrayIndex();
    }

    @Test
    public void searchEntranceForInteger() throws Exception {
        Integer[] arr1 = {3, 5, 6, 6, 4, 2, 6, 3, 3, 6};
        Integer[] arr2 = {6, 4, 2};
        int result = testObj.searchEntrance(arr1, arr2);

        Assert.assertThat(result, is(3));
    }

    @Test
    public void searchEntranceForIntegerAtTheEnd() throws Exception {
        Integer[] arr1 = {3, 5, 6, 6, 2, 6, 3, 3, 6, 4, 2};
        Integer[] arr2 = {6, 4, 2};
        int result = testObj.searchEntrance(arr1, arr2);

        Assert.assertThat(result, is(8));
    }

    @Test
    public void searchEntranceForIntegerAtTheBeginning() throws Exception {
        Integer[] arr1 = {6, 4, 2, 3, 5, 6, 6, 2, 6, 3, 3, 6, 4, 2};
        Integer[] arr2 = {6, 4, 2};
        int result = testObj.searchEntrance(arr1, arr2);

        Assert.assertThat(result, is(0));
    }

    @Test
    public void ifSubArrayBiggerReturnNegativeOne() {
        Integer[] arr1 = {3, 5, 6, 4, 2, 6, 3, 3, 6};
        Integer[] arr2 = {6, 4, 2};
        int result = testObj.searchEntrance(arr1, arr2);
        Assert.assertThat(result, is(2));
    }

    @Test
    public void ifNotEntranceReturnNegativeOne() {
        Integer[] arr1 = {3, 5, 6, 4, 2, 6, 3, 3, 6};
        Integer[] arr2 = {5, 4, 2};
        int result = testObj.searchEntrance(arr1, arr2);
        Assert.assertThat(result, is(-1));
    }

    @Test
    public void checkArrays() {
        Integer[] arr1 = {2,32,2,2,2,3,0,3,4,5};
        Integer[] arr2 = {2,3};
        int result = testObj.searchEntrance(arr1, arr2);

        Assert.assertThat(result, is(4));
    }

    /*
    @Test
    public void entranceInBigArrayWithRandomEntry() {
        Integer[] arr1 = new Integer[1_000_000];
        Integer[] arr2 = {5, 8, 1, 1, 9};
        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }

        int result = testObj.searchEntrance(arr1, arr2);
        System.out.println(result);
        Assert.assertThat(result,not(-1));
    }
*/

    @Test
    public void checkCloseNumberArray() {
        Integer[] arr1 = {0, 0, 0, 1};
        Integer[] arr2 = {0, 0, 1};

        int result = testObj.searchEntrance(arr1, arr2);
        Assert.assertThat(result, is(1));
    }

}