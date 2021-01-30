package kuznichenko;
/*
 * @Author: Kuznichenko Viktoriia
 * @version: 1.0.0
 */


    public class IntListAndStackImpl  implements IntStack, IntList {

        private int[] values = new int[10];
        private int topIndex = 0;



        @Override
        public void push(int value) {

            values[topIndex] = value;
            topIndex++;


        }


        @Override
        public int pop() {
            int value = values[topIndex-1];
            values[topIndex-1] = 0;
            topIndex--;
            return value;
        }


        @Override
        public int peek() {
            return values[topIndex];
        }


        @Override
        public void add(int i) {
            push(i);

        }


        @Override
        public void insert(int index, int value) {
            if (index > values.length) {
                System.out.println("There is no such index");
                throw new ArrayIndexOutOfBoundsException();
            }
            int[] result = new int[values.length];
            System.arraycopy(values,0, result, 0, index);
            result[index] = value;
            System.arraycopy(values, index, result, index+1, result.length-index-1);
            values = result;
        }


        @Override
        public void set(int index, int value) {
            if (index > values.length){
                System.out.println("There is no such index");
                throw new ArrayIndexOutOfBoundsException();

            }
            values[index] = value;
        }


        @Override
        public int size() {
            int i = 0;
            for (int n : values) {
                if (n != 0) {
                    i++;
                }
            }
            return i;
        }


        @Override
        public int capacity() {
            return values.length;
        }


        @Override
        public int getByIndex(int index) throws ArrayIndexOutOfBoundsException {
            if (index > values.length){

                System.out.println("There is no such index");
                throw new ArrayIndexOutOfBoundsException();

            }

            return values[index];
        }


        @Override
        public int [] getIndexByValue(int value) {

            int b;
            int [] arr = new int[values.length];
            int u = 0;
            for (b = 0; b < values.length; b++) {
                if (values[b] == value) {
                    arr[u] = b;
                    u++;
                }

            }
            return arr;
        }


        @Override
        public boolean contains(int value) {
            for (int n : values) {
                if (n == value) {
                    return true;
                }

            }
            return false;
        }


        @Override
        public void removeValue(int value) {

            for (int b = 0; b < values.length; b++) {
                if (values[b] == value) {
                    values[b] = 0;
                }

            }

        }


        @Override
        public void removeByIndex(int index) {
            if (index > values.length){
                System.out.println("There is no such index");
                throw new ArrayIndexOutOfBoundsException();

            }
            for (int i = 0; i < values.length; i++) {
                values[index] = 0;
            }
        }


        @Override
        public IntList subList(int fromIndex, int toIndex) {
            IntList list = new kuznichenko.IntListAndStackImpl() {};
            int[] res = new int[toIndex - fromIndex];
            System.arraycopy(values, fromIndex, res, 0, res.length);

            for (int y:res) {

                list.add(y);
            }

            return list;
        }


        @Override
        public int[] toArray() {
            return values;
        }


    }


