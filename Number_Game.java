package codsoft;
import java.util.*;
public class Number_Game
{
	public static void main(String args[])
	{
		int random_number,user_input,count,score=0;
		boolean Play_Again=true;
		Random r=new Random();
		Scanner ob=new Scanner(System.in);
		System.out.println("Number Guessing Game");
        		System.out.println("Guessing the number between 1 to 100, you have only 10 " + " attempts.");
		try
		{
			while(Play_Again)
			{
				random_number=r.nextInt(100);
				count=0;
				boolean Guess = false; 
				//System.out.print(random_number);
				while(count<10)
				{
					System.out.print("Attempt No." + (count + 1) + " Enter your guess: ");
					try
					{
						user_input=ob.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Enter Integer number only.");
						ob.nextLine();
						continue;
					}
					count++;	
					if(user_input==random_number)
					{	Guess = true;
						System.out.println("Congratulations....! Number is matched.");
						break;
					}
					else if(user_input>random_number)
					{
						System.out.println("Number is too high.");
					}
					else if(user_input<random_number)
					{
						System.out.println("Number is too low.");			
					}	
				}
				if(!Guess)
				{
					System.out.println("All attempts are done, The number was: "+random_number+".");
				}
				else
				{
					score++;
				}
				System.out.print("Do you want to play again? (y/n): ");
        				String Response = ob.next().toLowerCase();
        				Play_Again= Response.equals("y");
			}
		}
		catch(Exception e)
		{
			System.out.print("Something Went wrong....");	
		}
		System.out.println("Your score: " + score);
		System.out.println("Thanks for playing.....!");
	}
}