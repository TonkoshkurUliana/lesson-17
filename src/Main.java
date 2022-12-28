import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1,43,2,34,9,17,2,1,6,55};

        System.out.println("Масив:");
        System.out.println(Arrays.toString(a));
        Collection collection = new Collection(a);
        Iterator iteratorForward = collection.createForward();

        System.out.println("1.Зробити заміну непарних елементів на нуль");
        while ( iteratorForward.hasNext()){
            System.out.print( iteratorForward.next() +" ");
        }
        System.out.println();
        System.out.println("________________________________________________________________________________________");
        Integer[] b = {1,2,3,4,5,6,7,8,3,2,224,244,22,23,56,87,345};
        System.out.println("Масив:");
        System.out.println(Arrays.toString(b));
        collection = new Collection(b);
        Iterator iteratorBackword = collection.createBackword();

        System.out.println("2. Виводити від останнього до першого значення через одну цифру");
        while ( iteratorBackword.hasNext()){
            System.out.print( iteratorBackword.next()+" ");
        }

        System.out.println();
        System.out.println("________________________________________________________________________________________");
        Integer[] c = {1,2,3,4,5,6,7,8,3,2,224,244,22,23,56,87,345};
        System.out.println("Масив:");
        System.out.println(Arrays.toString(c));
        collection = new Collection(c);
        Iterator iteratorAnonymous = collection.createAnonymous();

        System.out.println("3.Перевірити кожен третій елемент масиву від останнього чи він непарний, \n якщо так то вивести дані елементи на консоль.");
        while ( iteratorAnonymous.hasNext()){
            int next = (int) iteratorAnonymous.next();
            if (next % 2 != 0) {
                System.out.print(next + " ");
            }
        }

        System.out.println();
        System.out.println("________________________________________________________________________________________");
        Integer[] d = {1,2,3,4,5,3,7,8,3,2,224,244,22,23,56,87,345};
        System.out.println("Масив:");
        System.out.println(Arrays.toString(d));
        collection = new Collection(d);
        Iterator iteratorCreatedClass = collection.createdClass();

        System.out.println("4.Перевірити кожен п’ятий елемент масиву, якщо він парний то відняти від нього число 100");
        while ( iteratorCreatedClass.hasNext()){
            int next = (int) iteratorCreatedClass.next();
            if (next % 2 == 0) {
                System.out.print(next - 100 + " ");
            }
        }

    }
}