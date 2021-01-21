package org.comstudy21.ch01_2;
import java.util.Scanner;

import static java.lang.System.out;
public class Ch01Ex05 {
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      int startDan = 0;
      int endDan = 0;
      
      out.print("시작단>>> ");
      startDan = scan.nextInt();
      out.print("종료단>>> ");
      endDan = scan.nextInt();
      
      if(startDan > endDan) {
         int tmp = startDan;
         startDan = endDan;
         endDan = tmp;
      }
      
      // 3행 3열로 구구단 제목을 출력한다.
      for(int dan=startDan; dan<=endDan; dan+=3) {
         for(int i=0; i<3; i++) {
            if((dan+i) < 10 && (dan+i) <= endDan) {
               System.out.print("***"+(dan+i)+"***\t");
            }
         }
         System.out.println();
         for(int cnt=1; cnt<=9; cnt++) {
            for(int i=0; i<3; i++) {
               if((dan+i) < 10 && (dan+i) <= endDan) {
                  System.out.printf("%d*%d=%d\t", (dan+i), cnt, (dan+i)*cnt);
               }
            }
            System.out.println();
         }
      }
   }

   public static void test(String[] args) {
      // 3행 3열로 구구단 제목을 출력한다.
      for(int dan=2; dan<=9; dan+=3) {
         for(int i=0; i<3; i++) {
            if((dan+i) < 10) {
               System.out.print("***"+(dan+i)+"***\t");
            }
         }
         System.out.println();
         for(int cnt=1; cnt<=9; cnt++) {
            for(int i=0; i<3; i++) {
               if((dan+i) < 10) {
                  System.out.printf("%d*%d=%d\t", (dan+i), cnt, (dan+i)*cnt);
               }
            }
            System.out.println();
         }
      }
   }
}