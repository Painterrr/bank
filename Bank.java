import java.util.Scanner;

public class Bank {

   public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
      int len = 100;
      int[] accountArr = new int[len];
      int[] restArr = new int[len];
      String[] nameArr = new String[len];
      int top = 0;

      while (true) {
         // 메뉴
         System.out.println("계좌 생성: 1");
         System.out.println("계좌 확인: 2");
         System.out.println("잔액 확인: 3");
         System.out.println("입금: 4");
         System.out.println("출금: 5");
         System.out.println("종료: 0");
         System.out.print("입력값을 확인해주세요 : ");
         int inputOperator = scn.nextInt();

         if (inputOperator == 0) {
            break;
         } else if (inputOperator == 1) {
            while (true) {
               System.out.print("이름을 입력하세요 :");
               String name = scn.next();
               System.out.print("계좌번호를 입력하세요 :");
               int accountNum = scn.nextInt();
               boolean flag = false;
               
               // 중복검사
               for (int i = 0; i < top; i++) {
                  if(accountArr[i] == accountNum) {
                     System.out.println("중복됩니다. 다시 입력하세요");
                     flag = true;
                     break;
                  }
               }
               if(flag == true) {
                  continue;
               }
               
               nameArr[top] = name;
               restArr[top] = 0;
               accountArr[top++] = accountNum;
               System.out.println("계좌가 생성되었습니다.");
               System.out.println("생성된 이름: " + nameArr[top-1] + ", 생성된 계좌번호 : " + 
               accountArr[top-1] + ", 잔액 : " + restArr[top-1]);
               break;
            }
         } else if(inputOperator == 2) {
            // 잔액 확인
            
            if(top == 0) {
               System.out.println("아무것도 없다... ㅎㅎ");
               continue;
            }
            
            for(int i = 0; i < top; i++) {
               System.out. println("-----------------");
               System.out.println("이름 : " + nameArr[i] + ", 계좌번호 : " + accountArr[i] +
                     ", 잔액 : " + restArr[i]);
               System.out.println("-----------------");
            }
         } else if(inputOperator == 4) {
            System.out.println("이름을 입력하세요");
            String name = scn.next();
            System.out.println("계좌번호를 입력하세요");
            int account = scn.nextInt();
            
            //검색
            boolean flag = false;
            for(int i = 0; i < top; i++) {
               if(name.equals(nameArr[i]) && account == accountArr[i]) {
                  System.out.println("이름 : " + nameArr[i] + ", 계좌번호 : " + accountArr[i] +
                        ", 잔액 : " + restArr[i]);
                  flag = true;
                  
                  System.out.println("입금 금액을 입력하세요");
                  int money = scn.nextInt();
                  restArr[i] += money;
                  System.out.println("입금 완료 후 잔액 : " + restArr[i]);
                  break;
               }
            }
            if(flag == false) {
               System.out.println("검색 결과 없습니다.");
            }
         } else if(inputOperator == 5) {
            System.out.println("이름을 입력하세요");
            String name = scn.next();
            System.out.println("계좌번호를 입력하세요");
            int account = scn.nextInt();
            
            //검색
            boolean flag = false;
            for(int i = 0; i < top; i++) {
               if(name.equals(nameArr[i]) && account == accountArr[i]) {
                  System.out.println("이름 : " + nameArr[i] + ", 계좌번호 : " + accountArr[i] +
                        ", 잔액 : " + restArr[i]);
                  flag = true;
                  
                  System.out.println("출금 금액을 입력하세요");
                  int money = scn.nextInt();
                  if(money > restArr[i]) {
                     System.out.println("잔액부족");
                     break;
                  }
                  restArr[i] -= money;
                  System.out.println("출금 완료 후 잔액 : " + restArr[i]);
                  break;
               }
            }
            if(flag == false) {
               System.out.println("검색 결과 없습니다.");
            }
         } else if(inputOperator == 3) {
            System.out.println("이름을 입력하세요");
            String name = scn.next();
            System.out.println("계좌번호를 입력하세요");
            int account = scn.nextInt();
            
            //검색
            boolean flag = false;
            for(int i = 0; i < top; i++) {
               if(name.equals(nameArr[i]) && account == accountArr[i]) {
                  flag = true;
                  
                  System.out.println("잔액3333333 : " + restArr[i]);
                  break;
               }
            }
            if(flag == false) {
               System.out.println("검색 결과 없습니다.");
            }
         }
      }
   }
}