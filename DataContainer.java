package homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {

  private T[] data;

  public DataContainer(T[] min) {
    this.data = min;
  }

  public int add(T item) {
    int number;
    if (item == null) {
      return -1;
    }
    for (int i = 0; i < data.length; i++) {
      if (data[i] == null) {
        data[i] = item;
      } else {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
      }
    }
    return number = (int) item;
  }

  public T get(int index) {
    return data[index];
  }

  public T[] getItem() {
    return data;
  }

  public boolean delete(int index) {
    if (data.length >= index) {
      return false;

    }
    for (int i = index + 1; i < data.length; i++) {
      data[i - 1] = data[i];
    }
    data = Arrays.copyOf(data, data.length - 1);

    return true;
  }

  public boolean delete(T item) {
    if (item == null) {
      return false;
    }

    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(item)) {

        return delete(i);
      }
    }
    return false;
  }

  public void sort(Comparator<T> comparator) {
    for (int i = 0; i < data.length; ) {
      boolean moved = false;
      for (int j = 0; j < data.length - 1 && !moved; j++) {
        moved = comparator.compare(data[i], data[j]) > 0;
        if (moved) {
          T tmp = data[j];
          data[j] = data[i];
          data[i] = tmp;
        }
      }
      if (!moved) {
        i++;
      }
    }
  }

  @Override
  public String toString() {
    if (data[0] == null) {
    }
    return null;
  }
}



