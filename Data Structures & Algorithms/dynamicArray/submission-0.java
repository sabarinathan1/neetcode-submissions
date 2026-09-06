class DynamicArray {
    int[] array = null;
    int cursor = 0;

    public DynamicArray(int capacity) {
        array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(cursor == array.length){
            resize();
        }
        array[cursor++] = n;
    }

    public int popback() {
        if(cursor == 0) {
           cursor =  array[array.length - 1];
        } else {
            --cursor;
        }
       return array[cursor];
    }

    private void resize() {
       int size =  array.length;
       int arr[] = new int[2 * size];
       for(int i=0; i < size ; i++) {
        arr[i] = array[i];
       }
       array = arr;
    }

    public int getSize() {
        return cursor;
    }

    public int getCapacity() {
        return array.length;
    }
}
