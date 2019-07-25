package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	 cal.calculateCalories(bread);
                        	System.out.println();
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	 cal.calculateCalories(bread,jam);
                        	System.out.println();
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	cal.calculateCalories(bread, jam, butter);
                        	System.out.println();
                        	break;
                        }
                        System.out.printf("%.3f",cal.calculateEnergy());
                        System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");
                       
                       
            }
}
class Calories {
            int  total_cal;
            int calculateCalories(int bread_cal) {
            //you have to overload this function for three parameters refer the question
            	return (total_cal = bread_cal*74 ) ;
            	
            }
            int calculateCalories(int bread, int jam)
            {
            	return (total_cal = (bread*74)+(jam*26));
            	
            }
            int calculateCalories(int bread, int jam,int butter)
            {
            	return (total_cal = (bread*74)+(jam*26)+(butter*102));
            	
            }int returnCalories()
            {
            	return total_cal;
            }
            double calculateEnergy() {
            	return (4.1868*total_cal);
            }
            
            
            
}