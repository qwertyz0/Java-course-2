package ua.edu.chmnu.fks.oop.lab09;

import java.io.*;
import java.nio.file.*;

public class Lab09 {
    public static void copyDirectory(File src, File dst) throws IOException {

        try {

            if (src.isDirectory()) {

                // Если директория отсутствует, то ее нужно создать ("скопировать" имя директории)
                if (!dst.exists()) {
                    dst.mkdir();
                    System.out.println("Directory copied from " + src + "  in " + dst);
                }

                // Определяем массив по содержанию директории-источника
                String files[] = src.list();

                for (String file : files) {
                    // создаем структуру директории-приемника по аналогии с директорией источником
                    File srcFile = new File(src, file);
                    File dstFile = new File(dst, file);
                    // рекурсивное копирование
                    copyDirectory(srcFile, dstFile);
                }
            } else {
                // если переданный в процедуру объект, то он копируется через потоки по-байтно

                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst);

                byte[] buffer = new byte[1024];

                int length;

                //копирование содержимого файла согласно размеру buffer
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                in.close();
                out.close();

                System.out.println("File copied from " + src + " in " + dst);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        File srcFolder = new File("F:\\testLab09\\tstfil.txt");
        File destFolder = new File("F:\\VB install\\tstfil.txt");

        //проверка наличия директории источника
        if (!srcFolder.exists()) {

            System.err.println("Wrong path!");

        } else {

            copyDirectory(srcFolder, destFolder);

        }
    }
}
