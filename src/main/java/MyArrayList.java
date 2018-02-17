public class MyArrayList<E> {
    private int masSize = 16;
    private Object[] massive = new Object[masSize];
    private int amountElements;
    private int index;

    public void add(E value) {
        if (index == massive.length)
            enlargementMassive();
        massive[index] = value;
        index++;
        amountElements++;
    }

    private void enlargementMassive() {
        Object[] newMassive = (Object[]) new Integer[massive.length * 2];
        System.arraycopy(massive, 0, newMassive, 0, index - 1);
        massive = newMassive;
    }

    public boolean addIndex(int index, E value) {
        if (index > amountElements || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Размер массива " + amountElements);
        }
        System.arraycopy(massive, index, massive, index + 1, amountElements - index);
        massive[index] = value;
        amountElements++;
        return true;
    }

    public E get(int index) {
        if (index >= amountElements || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Размер массива " + amountElements);
        }
        return (E) massive[index];
    }

    public void remove(int value) {
        for (int i = value; i < index; i++)
            massive[i] = massive[i + 1];
        massive[index] = null;
        index--;
    }

}
