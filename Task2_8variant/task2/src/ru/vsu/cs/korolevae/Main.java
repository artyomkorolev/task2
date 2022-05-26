package ru.vsu.cs.korolevae;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
            Locale.setDefault(Locale.ROOT);
            SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new FrameMain().setVisible(true);
                }
            });
        }

        public static SimpleLinkedList readListFromFile(String fileName){
            try {
                Scanner scanner = new Scanner(new File(fileName), "UTF-8") ;
                String line=scanner.nextLine();
              return toList(line);
            }
            catch(FileNotFoundException e) {
                return null;
            }


    }

    public static SimpleLinkedList toList(String line){
        String[] arr=line.split(" ");
        SimpleLinkedList list = new SimpleLinkedList();
        for(int i=0; i< arr.length;i++){
            list.addLast(arr[i]);


        }
        return list;
    }
    public static String toString(SimpleLinkedList list) throws SimpleLinkedList.SimpleLinkedListException {
            StringBuilder sb=new StringBuilder();
            for (Object a: list){
                sb.append(a).append(" ");
            }
        return sb.toString();
    }

    }

