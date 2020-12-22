
import java.util.*;

class tictactoe
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char m[][] = new char[3][3];
		int i,a,b,c=0;
		String s1,s2;
		System.out.println("**** Welcome to the Tick-Tac-Toe game ****");
		System.out.println("Player 1 should enter its choice as 'X' and player 2 as 'O'.");
		System.out.println("Player 1, Enter your name :");
		s1 = sc.nextLine();
		System.out.println("Player 2, Enter your name :");
		s2 = sc.nextLine();
		
		for(a=0;a<3;a++)
		{
			for(b=0;b<3;b++)
			{
				m[a][b] = '_';
			}
		}
		
		for(i=0;i<9;i++)
		{
		    if(i%2==0)
		    {
		        System.out.println(s1 + ", enter your row and column numbers among (0,0) (0,1) (0,2) (1,0) (1,1) (1,2) (2,0) (2,1) (2,2)");
		        a = sc.nextInt();
		        b = sc.nextInt();
		        m[a][b] = 'X';
		        System.out.println();
		        for(a=0;a<3;a++)
		        {
		            for(b=0;b<3;b++)
		            {
		                System.out.print(m[a][b] + "  ");
		            }
		            System.out.println("\n");
		        }
		        a=0;b=0;
		        if(m[0][0] == m[2][2] && m[1][1] == m[2][2])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		        else
		        if(m[0][2] == m[2][2] && m[1][1] == m[2][2])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		        else
		        if(m[0][1] == m[2][1] && m[1][1] == m[2][1])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		        else
		        if(m[1][0] == m[1][2] && m[1][1] == m[1][2])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		    }
		    
		    else
		    {
		        System.out.println(s2 + ", enter your row and column numbers among (0,0) (0,1) (0,2) (1,0) (1,1) (1,2) (2,0) (2,1) (2,2)");
		        a = sc.nextInt();
		        b = sc.nextInt();
		        m[a][b] = 'O';
		        System.out.println();
		        for(a=0;a<3;a++)
		        {
		            for(b=0;b<3;b++)
		            {
		                System.out.print(m[a][b] + "  ");
		            }
		            System.out.println("\n");
		        }
		        a=0;b=0;
		        if(m[0][0] == m[2][2] && m[1][1] == m[2][2])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		        else
		        if(m[0][2] == m[2][2] && m[1][1] == m[2][2])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		        else
		        if(m[0][1] == m[2][1] && m[1][1] == m[2][1])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		        else
		        if(m[1][0] == m[1][2] && m[1][1] == m[1][2])
		        {
		            if(m[1][1] == 'X')
		            {
		                System.out.println(s1 + " Wins");
		                c++;
		                break;
		            }
		            else
		            if(m[1][1] == 'O')
		            {
		                System.out.println(s2 + " Wins");
		                c++;
		                break;
		            }
		        }
		    }
		}
		
		if(c==0)
		System.out.println("Sorry, No player wins! Try Again...");
	}
}
