package kuznichenko;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntListAndStackImpl stack = new IntListAndStackImpl();
        stack.push(9);
        stack.push(2);
        stack.push(7);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(8);
        stack.push(7);

        System.out.println(Arrays.toString(stack.toArray()));

        System.out.println(stack.pop());

        stack.add(6);

        //System.out.println(stack.peek());

        //stack.set(2,4); //валидация

        //cпросить как динамически увеличивать длинну(кроме add) или add должен быть внутри?

        //stack.insert(2,6); //валидация

        //stack.removeByIndex(3); //валидация

        //stack.removeValue(8); //валидация

        //System.out.println(stack.contains(7));

        // я намеряно сделала массив, а не Integer, т к может быть два числа одинаковых
        //int [] array = stack.getIndexByValue(7); //валидация
        //System.out.println(Arrays.toString(array));

        //тут оставила как по заданию, но предпочла бы массив
        //System.out.println(stack.getByIndex(2));  //валидация

        //System.out.println(stack.size());

        //System.out.println(stack.capacity());

        System.out.println(Arrays.toString(stack.toArray()));

        //int[] ints = stack.toArray();
        //String s = Arrays.toString(ints);
        //System.out.println(s);

        //or
        //IntList sublist = stack.subList(0, 5);
        //System.out.println(Arrays.toString(sublist.toArray()));

    }
}

