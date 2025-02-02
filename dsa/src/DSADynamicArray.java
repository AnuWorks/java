public class DSADynamicArray {

    // Dynamic Array in Java is Array List
    // Dynamic Array basically doubles the standard Array when new elements are inserted
    // Let's say at compile time if Array size of 5 is created, if a new element is inserted Array size will be doubled.


    int size;
    int capacity = 10;
    Object[] array;

    public DSADynamicArray(){
        this.array = new Object[capacity];

    }

    public DSADynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];

    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        // size is end of array
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if (size >= capacity){
            grow();
        }
        for( int i = size; i > index; i-- ){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data){
        for (int i = 0; i < size; i++) {
            if(array[i] == data){
                for (int j = 0; j < (size -i -1); j++) {
                    array[i + j] = array [ i+ j +1];
                }
                array[size - 1] = null;
                size --;
                if(size <= (capacity/3)){
                    shrink();
                }
            }
        }
    }

    public int search(Object data){
        for (int i = 0; i < size; i++) {
            if (array[i] == data){
                return  i;
            }
        }
        return -1;
    }
    private void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }
    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return  size == 0;
    }
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (int i=0; i < capacity; i++){
            string.append(array[i]).append(", ");
        }
        if(string.isEmpty()){
            return "[]";
        }else {
            return "[" + string.substring(0, string.length() - 2) + "]";
        }
    }



    public static void main(String[] args) {
        DSADynamicArray dynamicArray = new DSADynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        System.out.println(dynamicArray.capacity);

        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray);

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        System.out.println(dynamicArray);

        System.out.println(dynamicArray.search("C"));

    }

}
