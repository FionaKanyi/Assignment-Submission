public class LabelledAndUnLabelledBreak {
    public static void main(String [] args){
        System.out.println("Illustration of Unlabelled break statement");
        int i;
        for(i=0; i<10; i++){
            if(i==2)
                break;
            System.out.println(i);
        }
        System.out.println("Yaayy!I came out of loop with i :"+i);

        System.out.println("Illustration of labelled break statement");
        int un_i=2;
        myLabel : if(un_i==2){
            System.out.println("In an labeled if statement");
            break myLabel; //labeled break allowed in if statement
        }
        System.out.println("Yaay!I came out of labeled if");
    }
}
