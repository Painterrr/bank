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
         // �޴�
         System.out.println("���� ����: 1");
         System.out.println("���� Ȯ��: 2");
         System.out.println("�ܾ� Ȯ��: 3");
         System.out.println("�Ա�: 4");
         System.out.println("���: 5");
         System.out.println("����: 0");
         System.out.print("�Է°��� Ȯ�����ּ��� : ");
         int inputOperator = scn.nextInt();

         if (inputOperator == 0) {
            break;
         } else if (inputOperator == 1) {
            while (true) {
               System.out.print("�̸��� �Է��ϼ��� :");
               String name = scn.next();
               System.out.print("���¹�ȣ�� �Է��ϼ��� :");
               int accountNum = scn.nextInt();
               boolean flag = false;
               
               // �ߺ��˻�
               for (int i = 0; i < top; i++) {
                  if(accountArr[i] == accountNum) {
                     System.out.println("�ߺ��˴ϴ�. �ٽ� �Է��ϼ���");
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
               System.out.println("���°� �����Ǿ����ϴ�.");
               System.out.println("������ �̸�: " + nameArr[top-1] + ", ������ ���¹�ȣ : " + 
               accountArr[top-1] + ", �ܾ� : " + restArr[top-1]);
               break;
            }
         } else if(inputOperator == 2) {
            // �ܾ� Ȯ��
            
            if(top == 0) {
               System.out.println("�ƹ��͵� ����... ����");
               continue;
            }
            
            for(int i = 0; i < top; i++) {
               System.out. println("-----------------");
               System.out.println("�̸� : " + nameArr[i] + ", ���¹�ȣ : " + accountArr[i] +
                     ", �ܾ� : " + restArr[i]);
               System.out.println("-----------------");
            }
         } else if(inputOperator == 4) {
            System.out.println("�̸��� �Է��ϼ���");
            String name = scn.next();
            System.out.println("���¹�ȣ�� �Է��ϼ���");
            int account = scn.nextInt();
            
            //�˻�
            boolean flag = false;
            for(int i = 0; i < top; i++) {
               if(name.equals(nameArr[i]) && account == accountArr[i]) {
                  System.out.println("�̸� : " + nameArr[i] + ", ���¹�ȣ : " + accountArr[i] +
                        ", �ܾ� : " + restArr[i]);
                  flag = true;
                  
                  System.out.println("�Ա� �ݾ��� �Է��ϼ���");
                  int money = scn.nextInt();
                  restArr[i] += money;
                  System.out.println("�Ա� �Ϸ� �� �ܾ� : " + restArr[i]);
                  break;
               }
            }
            if(flag == false) {
               System.out.println("�˻� ��� �����ϴ�.");
            }
         } else if(inputOperator == 5) {
            System.out.println("�̸��� �Է��ϼ���");
            String name = scn.next();
            System.out.println("���¹�ȣ�� �Է��ϼ���");
            int account = scn.nextInt();
            
            //�˻�
            boolean flag = false;
            for(int i = 0; i < top; i++) {
               if(name.equals(nameArr[i]) && account == accountArr[i]) {
                  System.out.println("�̸� : " + nameArr[i] + ", ���¹�ȣ : " + accountArr[i] +
                        ", �ܾ� : " + restArr[i]);
                  flag = true;
                  
                  System.out.println("��� �ݾ��� �Է��ϼ���");
                  int money = scn.nextInt();
                  if(money > restArr[i]) {
                     System.out.println("�ܾ׺���");
                     break;
                  }
                  restArr[i] -= money;
                  System.out.println("��� �Ϸ� �� �ܾ� : " + restArr[i]);
                  break;
               }
            }
            if(flag == false) {
               System.out.println("�˻� ��� �����ϴ�.");
            }
         } else if(inputOperator == 3) {
            System.out.println("�̸��� �Է��ϼ���");
            String name = scn.next();
            System.out.println("���¹�ȣ�� �Է��ϼ���");
            int account = scn.nextInt();
            
            //�˻�
            boolean flag = false;
            for(int i = 0; i < top; i++) {
               if(name.equals(nameArr[i]) && account == accountArr[i]) {
                  flag = true;
                  
                  System.out.println("�ܾ�3333333 : " + restArr[i]);
                  break;
               }
            }
            if(flag == false) {
               System.out.println("�˻� ��� �����ϴ�.");
            }
         }
      }
   }
}