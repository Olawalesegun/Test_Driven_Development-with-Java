public class ReverseMultiplication {
    //  To run the program with test driven development
    //  We won't be needing the Psvm and the method won't have to be static
    //  But, to run it directly we need the Psvm
    public static void main(String[] args) {
        int countCondition = 1;
        for(int count=12; count>=countCondition; count--){
            reverseMultiply(count);
        }

    }

    public static int reverseMultiply(int number){
        int total = 1;
        for(int counter = 12; counter>=0; counter--){
            total = number * counter;
            System.out.println(number + " * " + counter + " = " + total);
        }
        return total;

    }
}
