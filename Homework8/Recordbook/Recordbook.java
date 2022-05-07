package com.company.denis.Homework8.Recordbook;

import java.util.Scanner;

      public class Recordbook {

          public static Scanner
                  ob = new

                  Scanner(System.in);

          public info info;
          public String city;

          public Recordbook() {
              System.out.print("введите ФИО студента");
              Recordbook(ob.next());
              info = new info();
          }

          public String Recordbook(String next) {
              return city;
          }

          public class info {
              int pr, st, sq;

              public info() {
                  System.out.print("сессия №:");
                  setPr(ob.nextInt());
                  System.out.print("количество не сданных зачётов:");
                  setSt(ob.nextInt());
                  System.out.print("кол-во экзаменов на сл. сессию:");
                  setSq(ob.nextInt());
              }

              public int getPr() {
                  return pr;
              }

              public void setPr(int pr) {
                  this.pr = pr;
              }

              public int getSt() {
                  return st;
              }

              public void setSt(int st) {
                  this.st = st;
              }

              public int getSq() {
                  return sq;
              }

              public void setSq(int sq) {
                  this.sq = sq;
              }

              public void print() {
                  System.out.print(new StringBuilder().append("Студент по фамилии").append(" ").append(getRecordbook()).append(" сдал").append(" ").append(getPr()).append("сессию").append(" ").append(getSt()).append("зачетов").append(" и ").append(getSq()).append("экзаменов").toString());
              }
          }

          private Object getRecordbook() {
              return null;
          }


          static public void main(String[] args) {
              Recordbook ct = new Recordbook();
              ct.info.print();
          }
      }