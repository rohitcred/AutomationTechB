package conditionalStatement;

public class LogicalOperator1OR
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Logical Operator - OR (||) and And (&&)
		
				//Verify eligibility of user
				
				//Ashish, Pune University 
				
				//IIT JEE and MHCET (IIT >=40, MHCET >=60) 
				
				//100- 30,  MHCET - 60
				
				//Condition 1= (IIT >=40 ) OR 	//Condition 2 = (MHCET >=60) 
				
				int iit =30;
				int cet= 60;
				
				if(iit>=40 || cet>=60)
				{
					System.out.println("You are eligible");
				}else {
					System.out.println("You are not eligible");
				}}}