package IntList.Interfce;

public class IntArrayList implements IntList {
    private int[] elements;
    private int size;

    public IntArrayList() {
        elements = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == elements.length) {
            int newSize = (int) (elements.length * 1.5);
            elements = resizeArray(newSize);
        }
        elements[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return elements[index];
    }

    private int[] resizeArray(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        return newArray;
    }
}