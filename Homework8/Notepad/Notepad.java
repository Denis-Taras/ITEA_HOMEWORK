package com.company.denis.Homework8.Notepad;

import java.util.Scanner;

class Notepad
{
    Scanner sc=new Scanner(System.in);
    int date;
    void runInner()
    {
        data d=new data();
        d.IN();
        d.Recording();
        d.view();
    }
    Notepad()
    {}
    class data
    {
        String Recording[];
        int kol;
        data()
        {}
        void IN()
        {
            System.out.println("Введите дату: ");
            date=sc.nextInt();
        }
        void Recording()
        {
            System.out.println("Сколько записей вы хотите ввести? ");
            kol=sc.nextInt();
            Recording =new String[kol];
            for(int i=0; i<kol; i++)
            {
                System.out.println("Введите запись на дату: " + date );
                Recording[i]=sc.next();
            }
        }
        void view()
        {
            System.out.println(" Дата " + date);
            for(int i=0; i<kol; i++)
            {
                System.out.println("Запись " + Recording[i]);
            }
        }
    }
}
