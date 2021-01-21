package org.comstudy21.ch01_2;
import java.util.Scanner;

public class Ch02Homework {
   static Scanner scan = new Scanner(System.in);
   static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
   static int month, day;
   static int total;
   static int nextMonth, nextDay;
   public static void main(String[] args) {
      System.out.println("월 입력>>> ");
      month = scan.nextInt();
      System.out.println("일 입력>>> ");
      day = scan.nextInt();
      calendar();
   }
   static void calendar() {
      System.out.println("calendar 함수 ...");
      System.out.print(String.format("%d월 %d일의 100일 후는",month, day));
      // 100을 total 변수에 저장
      // 현재달의 남을 날짜를 total에서 뺀다.
      // 
      // total 변수에서 한달씩 날짜를 뺀다.
      // total의 날짜 부족하다면 빼는것을 멈춘다.
      total = 100 - (days[month-1] - day);
      int index = month;
      // index가 12가 되면 0으로 변경한다
      int size = days.length;
      while(total > days[index % size]) {
         total -= days[index % size];
         index++;
      }
      nextMonth = index % size + 1;
      nextDay = total;
      System.out.print(nextMonth + "월");
      System.out.println(nextDay + "일입니다.");
   }
}