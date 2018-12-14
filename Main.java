import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

    scenario1();
    scenario2();
    scenario3();
    scenario4();
    scenario5();







    }


    public static void scenario1(){
        Random random = new Random();

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for(int i = 0; i<count; i++){
            int a = random.nextInt(6) + 1;
            if(a == 1 || a == 3 || a == 5){
                numTrue++;}
                else{
                    numFalse++;
            }


        }

        System.out.println("\nScenario 1: Expected result 50%\nCount of True : " + numTrue + "\nCount of False: " + numFalse + "\nCondition Reached: " + ((float)numTrue/(float)count)*100 + "%");



    }

    public static void scenario2(){
        Random random = new Random();

        int numTrue = 0;
        int numFalse = 0;
        int count = 100000;

        for(int i = 0; i<count; i++){
            int a = random.nextInt(10) + 1;
            if(a == 2 || a == 4 || a == 6 || a == 7 || a == 8 || a == 9 || a == 10){
                numTrue++;}
            else{
                numFalse++;
            }


        }

        System.out.println("\nScenario 2: Expected result 70%\nCount of True : " + numTrue + "\nCount of False: " + numFalse + "\nCondition Reached: " + ((float)numTrue/(float)count)*100 + "%");



    }

    public static void scenario3(){
        Random random = new Random();

        boolean aTrue;
        boolean bTrue;

        int numTrue = 0;
        int numFalse = 0;

        int count = 100000;

        for(int i = 0; i<count; i++){
            int a = random.nextInt(6) + 1;
            if(a == 2 || a == 4 || a == 6){
                aTrue = true;}
                else{
                    aTrue = false;
            }


            int b = random.nextInt(6) + 1;
            if(b == 1 || b == 3 || b == 5){
                bTrue = true;
            }
            else{
                bTrue = false;
            }


            if(aTrue == true && bTrue == true){
                numTrue++;
            }
            else{
                numFalse++;
            }


        }

        System.out.println("\nScenario 3: Expected result 25%\nCount of True : " + numTrue + "\nCount of False: " + numFalse + "\nCondition Reached: " + ((float)numTrue/(float)count)*100 + "%");



    }






    public static void scenario4(){
        Random random = new Random();

        boolean aTrue;
        boolean bTrue;
        boolean cTrue;

        int numTrue = 0;
        int numFalse = 0;

        int count = 100000;

        for(int i = 0; i<count; i++){
            int a = random.nextInt(6) + 1;
            if(a == 1 || a == 2){
                aTrue = true;}
            else{
                aTrue = false;
            }


            int b = random.nextInt(6) + 1;
            if(b == 3 || b == 4){
                bTrue = true;
            }
            else{
                bTrue = false;
            }

            int c = random.nextInt(6) + 1;
            if(c == 5 || c == 6){
                cTrue = true;
            }
            else{
                cTrue = false;
            }


            if(aTrue == true && bTrue == true && cTrue == true){
                numTrue++;
            }
            else{
                numFalse++;
            }


        }

        System.out.println("\nScenario 4: Expected result 3.704%\nCount of True : " + numTrue + "\nCount of False: " + numFalse + "\nCondition Reached: " + ((float)numTrue/(float)count)*100 + "%");



    }




    public static void scenario5(){
        Random random = new Random();

        boolean bTrue;
        boolean cTrue;
        boolean dTrue;

        int numTrue = 0;
        int numFalse = 0;

        int count = 100000;

        for(int i = 0; i<count; i++){
            int a = random.nextInt(6) + 1;



            int b = random.nextInt(6) + 1;

            if(b != a){
                bTrue = true;
            }
            else{
                bTrue = false;
            }

            int c = random.nextInt(6) + 1;

            if(c != a && c != b){
                cTrue = true;
            }
            else{
                cTrue = false;
            }

            int d = random.nextInt(6) + 1;

            if(d != a && d != b && d != c){
                dTrue = true;
            }
            else{
                dTrue = false;
            }



            if(bTrue == true && cTrue == true && dTrue == true){
                numTrue++;
            }
            else{
                numFalse++;
            }


        }

        System.out.println("\nScenario 5: Expected result 27.778%\nCount of True : " + numTrue + "\nCount of False: " + numFalse + "\nCondition Reached: " + ((float)numTrue/(float)count)*100 + "%");



    }


}
