package homework4;

import java.util.Arrays;
import java.util.Comparator;

public class DataConteinerMain {

  public static void main(String[] args) {
    DataContainer<String> container = new DataContainer<>(new String[4]);

    int index1 = container.add("Привет");
    int index2 = container.add("Как деле");
    int index3 = container.add("Работаю");
    int index4 = container.add("Давай потом");
    String text1 = container.get(index1);
    String text2 = container.get(index2);
    String text3 = container.get(index4);
    String text4 = container.get(index4);
    System.out.println(text1);
    System.out.println(text2);
    System.out.println(text3);
    System.out.println(text4);
    container.delete(text1);
    System.out.println(Arrays.toString(container.getItem()));
    container.sort(String::compareTo);
    System.out.println(container.get(index1));
    System.out.println(container);

  }

}
