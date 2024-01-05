import java.util.Scanner;
public class Numbergame
{
    public static void main(String[] args){
        Scanner sobj=new Scanner(System.in);
        int attempts=5;
        int finals=0;
        boolean playagain=true;
        System.out.println("Guess the Number within 5 trials");
        while(playagain)
        {
            int RandomNumber=getRandomNumber(1,100);
            boolean guess=false;
            for(int i=0;i<attempts;i++)
            {

                System.out.println("Trial "+(i+1)+"  Enter your guess:");
                int user=sobj.nextInt();
                if(user==RandomNumber){
                    guess=true;
                    finals+=1;
                    System.out.println("Congratulations! You win.");
                    break;
                }
                else if(user>RandomNumber){
                    System.out.println("Too high! Try again.");
                }
                else{
                    System.out.println("Too low! Try again.");
                }
            }
            if(guess==false)
            {
                System.out.println("Sorry,You lost the attempts.The number was: "+RandomNumber);
            }
            System.out.println("Do you want to play Again?(Yes/No): ");
            String pA=sobj.next();
            playagain=pA.equalsIgnoreCase("Yes");
        }
        System.out.println("That's it,Hope you enjoyed.");
        System.out.println("Here is your Score "+finals);
       }    
        public static int getRandomNumber(int min,int max){
            
            return (int)(Math.random()*(max-min+1)+min);
        }
    
}