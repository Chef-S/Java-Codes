public class Age2 {

    public static void main(String args[]){

        try{
            int age = Integer.parseInt(args[0]);  //taking in an integer input throws NumberFormat Exception if not an integer

            if(age<= 12)
               System.out.println("You are very young");

            else if(age > 12 && age <= 20)
               System.out.println("You are a teenager");

            else
                System.out.println("WOW "+age+" is old");
        }

        catch(NumberFormatException e){   //is input is not an integer, occurs while parsing the command line input argument
            System.out.println("Your input is not a number");

        }catch(ArrayIndexOutOfBoundsException e){ //as takes in input from command line which is stored to a Args array in main, if this array is null implies no input given
            System.out.println("Please enter a number on the command line");
        }

    }
}   