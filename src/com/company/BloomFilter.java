package com.company;

public class BloomFilter
{
    public int filter_len;
    byte[] arr;

    public BloomFilter(int f_len)
    {
        filter_len = f_len;
        // создаём битовый массив длиной f_len ...
        arr = new byte[filter_len];
    }

    // хэш-функции
    public int hash1(String str1)
    {
        // 17
        int code = 0;
        for(int i=0; i<str1.length(); i++)
        {
            //code += (int)str1.charAt(i) * (int)Math.pow(17, i);
            code += code * 17 + (int)str1.charAt(i);
        }
        // реализация ...
        return Math.abs(code % filter_len);
    }
    public int hash2(String str1)
    {
        // 223
        // реализация ...
        int code = 0;
        for(int i = 0; i < str1.length(); i++)
        {
            //code += (int)str1.charAt(i) * (int)Math.pow(223, i);
            code += code * 223 + (int)str1.charAt(i);
        }
        return Math.abs(code % filter_len);
    }

    public void add(String str1)
    {
        // добавляем строку str1 в фильтр
        int h1 = hash1(str1);
        int h2 = hash2(str1);
        arr[h1] = 1;
        arr[h2] = 1;
    }

    public boolean isValue(String str1)
    {
        // проверка, имеется ли строка str1 в фильтре
        if(arr[hash1(str1)] == 1 && arr[hash2(str1)] == 1){
            return true;
        }else
        return false;
    }
}
