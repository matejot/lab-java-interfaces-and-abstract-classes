package IntList.Interfce;

public class IntVector implements IntList {
    private int[] elements;
    private int size;

    public IntVector() {
        elements = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == elements.length) {
            elements = resizeArray(elements.length * 2);
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