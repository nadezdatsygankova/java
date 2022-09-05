package homework;

public class HW2 {
    int number = 3;
    public static void main(String[] args) {
        HW2 first = new HW2();
        System.out.println("---- N3");
        System.out.println("Task ..." + first.number);
        System.out.println("Task  char..." + first.number);

        System.out.println("---- N4");
        int x= 15;
        int y = 20;
        int z = 30;
       //a
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
       //b
        System.out.print(x + " " + y + " " + z + "\n" );
        //c
        System.out.println("int x = " + x);
        System.out.println("int y = " + y);
        System.out.println("int z = " + z);

        //5
        System.out.println("---- N5");
        System.out.println(x + ", " + y +", " + z);

        //6
        System.out.println("---- N6");
        System.out.println("Sum of x and y = " + (x+y));
        System.out.println("Mul of x and y = " + (x*y));
        System.out.println("Sub of x and y = " + (x-y));
        //7
        System.out.println("---- N7");
        int apple = 40;
        int student = 6;

        System.out.println("Of " + apple
                + " apples to divide into " + student + " students, every student will get "
                + (apple / student) + " and "+ (apple %student) +" with the teacher");
       //8
        System.out.println("---- N8");
        apple = 100;
        student = 21;
        System.out.println("Of " + apple
                + " apples to divide into " + student + " students, every student will get "
                + (apple / student) + " and "+ (apple %student) +" with the teacher");
       //9
        System.out.println("---- N9");
        int limons = 6;
        int apples = limons + 24;
        int pears = apples - 12;
        int sum = limons + apple + pears;
        System.out.println(sum);

        //10
        System.out.println("---- N10");
        String firstRow = "У сороконожки заболели ножки:";
        int all = 40;
        int a = 8;
        int b = 5;
        int c = 7;
        int d = 2;
        String fourthRow = "Помоги сороконожке";
        String fifthRow = "Посчитать здоровые ножки.";
        int result =  all - a - b- c - d;
        System.out.println(firstRow);
        System.out.println(a +"ноют, " + b + "гудят,");
        System.out.println(c +"хромают, " + d + "болят.");
        System.out.println(fourthRow);
        System.out.println(fifthRow);
        System.out.println("Ответ: " + result);

        //Part 2
        System.out.println("---- N11");
        System.out.println(35/7);
        System.out.println(48/8);
        System.out.println(54/6);

        //12
        System.out.println("---- N12");
        System.out.println("because: " + "48%8 = " + 48%8 );
        //13
        System.out.println("---- N13");
        int firstCol = 10;
        int secondCol = -5;
        int thirdCol = 100;
        int forthCol = 2;
        int fifthCol = 2;
        int sixthCol = 2;


        int k =5;
        int l = 10;
        int m = l + firstCol;

        int firstColK = k + firstCol;
        int firstColL = l + firstCol;
        int firstColM = m + firstCol;

        int secondColK = k + secondCol;
        int secondColL = l + secondCol;
        int secondColM = m + secondCol;

        int thirdColK = k * thirdCol;
        int thirdColL = l * thirdCol;
        int thirdColM = m * thirdCol;


        int forthColK = k / forthCol;
        int forthColL = l / forthCol;
        int forthColM = m / forthCol;

        int fifthColK = k % fifthCol;
        int fifthColL = l % fifthCol;
        int fifthColM = m % fifthCol;

        int sixthColK = (int) Math.pow(k,sixthCol);
        int sixthColL =(int) Math.pow(l,sixthCol);
        int sixthColM = (int) Math.pow(m,sixthCol);

        int seventhColK = k+1;
        int seventhColL = l+1;
        int seventhColM = m+1;

        int eighthColK = k-1;
        int eighthColL = l-1;
        int eighthColM = m-1;

        System.out.println("        |" + "+" + firstCol
                + " | " + secondCol + " |"
                + " *" + thirdCol
                + "   | " + "/" + forthCol
        + "    |" + " %" + fifthCol
        + "    |" + " ^" + sixthCol
        + "    |" + " ++"
        + "    |" + " -- " );

        System.out.println("k = "+ k
                + "   | " + firstColK
                + " | " + secondColK
                + "  |  " + thirdColK
                + "   |  " + forthColK
                + "    |  " + fifthColK
                + "    | " + sixthColK
                + "    |  " + seventhColK
                + "    |  " + eighthColK
         );

        System.out.println("l = " + l
                + "  | " + firstColL
                + " | " + secondColL
                + "  |  " + thirdColL
                + "  |  " + forthColL
                + "    |  " + fifthColL
                + "    | " + sixthColL
                + "   |  " + seventhColL
                + "   |  " + eighthColL
        );
        System.out.println("m = " + m
                + "  | " + firstColM
                + " | " + secondColM
                + " |  " + thirdColM
                + "  |  " + forthColM
                + "   |  " + fifthColM
                + "    | " + sixthColM
                + "   |  " + seventhColM
                + "   |  " + eighthColM
        );


        //14
        //xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))

        int x1 = 7;
        int y1 = 18;
        int n1 = 3;

//        int resultSum = Math.pow(x1,n1)*((5*x1 + 7*y1) / (8*x1 + 10*y1)) / ((3*x1 - y1)/(x1 + y1));
        double resultSum = Math.pow(x1,n1)*((5*x1 + 7*y1) / (8*x1 + 10*y1)) / ((3*x1 - y1)/(x1 + y1));
        System.out.println("---- N14");
        System.out.println(resultSum);

     //15
        int everyDay = 15 / 5;
        int resultSuiteDays = 69 / everyDay;
        System.out.println("---- N15");
        System.out.println(resultSuiteDays);





    }
}
