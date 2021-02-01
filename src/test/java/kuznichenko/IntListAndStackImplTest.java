package kuznichenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntListAndStackImplTest {
    IntListAndStackImpl intListAndStack;

    @BeforeEach
    public void init(){
        intListAndStack = new IntListAndStackImpl();
    }

    @Test
    public void checkNoElementsInArray(){

    int actualResult = intListAndStack.size();
    int expectedResult = 0;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkElementsIndexes(){

        intListAndStack.add(11);
        intListAndStack.add(12);
        intListAndStack.add(13);
        for (int i = 0, j = 0; i < intListAndStack.size(); i++, j++) {
            int actualResult = intListAndStack.getByIndex(i);
            int expectedResult = intListAndStack.getByIndex(j);
            Assertions.assertEquals(expectedResult, actualResult);
        }

    }

    //тест правильный, надо исправлять код, тест помог найти баг - ура! моя маленькая победа!
    @Test
    public void checkIndexesAfterDelete(){

        intListAndStack.add(9);
        intListAndStack.add(4);
        intListAndStack.add(7);
        intListAndStack.add(8);
        intListAndStack.add(103);

        int actualResult = intListAndStack.getByIndex((intListAndStack.size()-1)/2);
        intListAndStack.removeByIndex(2);
        int expectedResult = intListAndStack.getByIndex(2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkArrayBounds() throws ArrayIndexOutOfBoundsException{

        intListAndStack.add(9);
        intListAndStack.add(4);

        boolean actualResult = false;

        try {
           intListAndStack.getByIndex(12);
        }
        catch (ArrayIndexOutOfBoundsException ex){
                actualResult = true;

        }

        int expectedResult = 1;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkSublistReturn(){

        intListAndStack.add(7);
        intListAndStack.add(88);
        intListAndStack.add(170);
        intListAndStack.add(234);
        intListAndStack.add(105);

        IntList newList = intListAndStack.subList(1, 4);
        String actualResult = Arrays.toString(newList.toArray());
        String expectedResult = String.format("[%s, %s, %s, 0, 0, 0, 0, 0, 0, 0]", 88, 170, 234);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkPopDeleteFromEnd(){

        intListAndStack.add(7);
        intListAndStack.add(88);
        intListAndStack.add(170);
        intListAndStack.add(234);
        intListAndStack.add(105);

        int expectedResult = intListAndStack.getByIndex(intListAndStack.size()-1);
        int actualResult = intListAndStack.pop();

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkPushAddToBeggining(){

        intListAndStack.add(7);
        intListAndStack.add(88);
        intListAndStack.add(170);
        intListAndStack.add(234);
        intListAndStack.add(105);

        intListAndStack.push(3);
        int actualResult = intListAndStack.getByIndex(intListAndStack.size()-1);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
