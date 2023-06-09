public class FloorAndCeil {
/*
    (Floor and Ceil) Write two methods myFloor and myCeil that take a positive double num
    variable int myFloor(double num) and int myCeil(double num).
    The myFloor method takes num and returns the largest integer number that is less than or equal to x.
    The myCeil function takes num and finds the smallest number that is greater than or equal to x. Do
    not use any Math class methods. Incorporate this method into an application that sends a double
    value to the functions and tests their ability to calculate the required output.
*/

    public static int myFloor(double num){
        int numModulus10Result;
        int numDivideBy10Result;
        int secondNumGottenFromSecondEvaluation = 0;
        if(num > 0){
           num = num * 10;
           numModulus10Result = (int) (num % 10);
           numDivideBy10Result = (int) (num/10);
           num = numDivideBy10Result;

            //NOTE: I am taking the modulus value here just incase sometime later
            // we might need the decimal values for computation.
            // and when I need it, I might need some sort of selection control structure to drive result
                /* if(numModulus10Result > 10){
                        numModulus10Result / 10;
                 }*/


        }else{
            System.exit(0);
          /*  num = num * 10;
            numDivideBy10Result = (int) (num/10);
            num = numDivideBy10Result - 1;
            */
        }
        return (int)num;
    }

    public static int myCeil(double num){
        int numDividesBy10Result = 0;
        if(num > 0){
            num = num * 10;
            numDividesBy10Result = (int)(num / 10);
            num = numDividesBy10Result + 1;
            //NOTE: I did not take the modulus result because in real sense we don't need it to compute this task.
        }
        else{
            System.exit(1);
        }
        return (int)num;
    }
}
