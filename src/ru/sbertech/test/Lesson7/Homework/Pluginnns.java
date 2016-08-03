package ru.sbertech.test.Lesson7.Homework;

import java.io.File;
import java.io.FileFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by svetlanashmalko on 03.08.16.
 */
public class Pluginnns {
    public static void main(String[] args) {
        File pluginDir;
        // Получаем массив jar-файлов из папки plugins
        pluginDir = new File("Text/pluginName");




        System.out.println(pluginDir.list());


        File[] jars = pluginDir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isFile() && file.getName().endsWith(".jar");
            }
        });

        //Для каждого файла из папки создаем отдельный URLClassLoader и получаем объект типа Class по имени.

        Class[] pluginClasses = new Class[jars.length];

        for (int i = 0; i < jars.length; i++) {
            try {
                URL jarURL = jars[i].toURI().toURL();
                URLClassLoader classLoader = new URLClassLoader(new URL[]{jarURL});
                pluginClasses[i] = classLoader.loadClass("ru.sbertech.test.Lesson7.Homework.HelloPlugin");

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Создаем по объекту из каждого класса и вызываем метод invoke():



        for (Class clazz : pluginClasses) {
            try {
                Plugin instance = (Plugin) clazz.newInstance();
                instance.invoke();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }




}
