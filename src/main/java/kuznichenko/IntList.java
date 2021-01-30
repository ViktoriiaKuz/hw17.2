package kuznichenko;
/*
 * @Author: Kuznichenko Viktoriia
 * @version: 1.0.0
 */

public interface IntList {


        void add(int i);

        void insert(int index, int value);

        void set(int index, int value);

        int size();

        int capacity();

        int getByIndex(int index);

        int[] getIndexByValue(int value);

        boolean contains(int value);

        void removeValue(int value);

        void removeByIndex(int index);

        kuznichenko.IntList subList(int fromIndex, int toIndex);

        int[] toArray();
    }


