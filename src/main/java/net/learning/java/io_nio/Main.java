package net.learning.java.io_nio;

import java.io.*;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Main {

    public static void main(String[] args) {

        /*
         * TODO: Streams and writters and paths and console
         */

        /*
         *  Input/Output stream from txt to txt
         */

        try(FileInputStream in = new FileInputStream("/home/andrei/Desktop/test_in.txt");
        FileOutputStream out = new FileOutputStream("/home/andrei/Desktop/test_out.txt")) {

            int c;

            while((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
