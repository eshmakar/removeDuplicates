package com.test;

public class RemoveDuplicates {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();
            String arr[] = {"awasd", "hello", "awasd", "hello", "wefs"};
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        count++;
                        sb.append(arr[j] + "\n");
                    }
                }
            }

            System.out.println("Удалено дубликатов строк: " + count);
            System.out.println(sb);
        }
    }