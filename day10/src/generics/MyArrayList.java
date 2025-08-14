package generics;

public class MyArrayList <E>{
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                '}';
    }

    public E get(int index){
        return (E)obj[index];
    }
}
