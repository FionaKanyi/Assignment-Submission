public class ControlFlowStatementsOne {
   public void showControlFlowStatements(){
       System.out.println("This will outline the Decision Making statements");
       System.out.println("1. If statements");
       String address = "Nairobi, Mombasa";

       if(address.endsWith("Mombasa")) {
           if(address.contains("Kisumu")) {
               System.out.println("Your city is Kisumu");
           }else if(address.contains("Kitale")) {
               System.out.println("Your city is Kitale");
           }else {
               System.out.println(address.split(",")[0]);
           }
       }else {
           System.out.println("You are not living in Mombasa");
       }

       System.out.println("End of If statements illustration");
       System.out.println("2. Switch statements");
       int num = 2;
       switch (num) {
           case 0 -> System.out.println("number is 0");
           case 1 -> System.out.println("number is 1");
           default -> System.out.println(num);
       }
       System.out.println("End of switch statements illustration");

       System.out.println("This will outline the Loop statements");
       System.out.println("1. For Loop");
       int sum = 0;
       for(int j = 1; j<=10; j++) {
           sum = sum + j;
       }
       System.out.println("The sum of first 10 natural numbers is " + sum);

       System.out.println("1.1 For Each Loop");
       String[] names = {"Java","C","C++","Python","JavaScript"};
       System.out.println("Printing the content of the array names:\n");
       for(String name:names) {
           System.out.println(name);
       }

       System.out.println("2. While Loop");
       int while_i = 0;
       System.out.println("Printing the list of first 10 even numbers \n");
       while(while_i<=10) {
           System.out.println(while_i);
           while_i = while_i + 2;
       }
       System.out.println("3. Do While Loop");
       int i = 0;
       System.out.println("Printing the list of first 10 even numbers \n");
       do {
           System.out.println(i);
           i = i + 2;
       }while(i<=10);
       System.out.println("End of loop statements illustration");

       System.out.println("Illustration of jump statements");
       System.out.println("1. Break statement");
       for(int break_i = 0; break_i<= 10; break_i++) {
           System.out.println(break_i);
           if(break_i==6) {
               break;
           }
       }
       System.out.println("2. Continue statement");
       for(int cont_i = 0; cont_i<= 2; cont_i++) {

           for (int j = i; j<=5; j++) {

               if(j == 4) {
                   continue;
               }
               System.out.println(j);
           }
       }
       System.out.println("End of jump statements illustration");
   }
}
