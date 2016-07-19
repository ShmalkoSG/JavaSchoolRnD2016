package ru.sbertech.test.Lesson3.BeforeGenerics;

/**
 * Created by svetlanashmalko on 19.07.16.
 */
import java.util.ArrayList;

/**
 * Created by Student on 18.07.2016.
 */
public class CollectionsBeforeGenerics {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();

        for (int i=0; i<3; i++){
            apples.add(new Apple());
        }

        for (int i=0; i<3; i++){
            System.out.println(apples.get(i).getId());
        }
    }
}