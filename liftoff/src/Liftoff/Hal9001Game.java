package Liftoff;

import java.util.Scanner;

public class Hal9001Game
{


//, crew count
static int bytMissionDay = 1;
static int bytCount = 0;
//declare variable type boolean for game over
static boolean bolGameOver = false;


//crew databases
static String [] arrNames = new String [bytCount] ;
static String [] arrIDs = new String [bytCount];
static String [] arrTasks = new String []{ };
static char [] arrShift =  new char [bytCount];


static int [] bytMood = new int [bytCount];
static int [] bytEnergy = new int [bytCount];
static int [] bytStress = new int [bytCount];
static int [] bytHunger = new int [bytCount];
static int [] bytHealth = new int [bytCount];
static boolean isRunning= true;
public static void main (String [] args)
{
    while(isRunning==true){

System.out.println("----------HAL 9001 INITIALIZATION----------");
System.out.println("Enter number of crewmates: ");
Scanner scanner = new Scanner(System.in);
int crewSize=scanner.nextInt();
scanner.nextLine();

String arrNames[]= new String[crewSize];
String arrIDs[]= new String[crewSize];
char arrShift[]= new char[crewSize];
int bytMood[]= new int[crewSize];
int bytEnergy[]= new int[crewSize];
int bytStress[]= new int[crewSize];
int bytHunger[]= new int[crewSize];
int bytHealth[]= new int[crewSize];
Names n1= new Names();
//for loop for user input for arrNames
for(int bytIndex = 0; bytIndex<crewSize ;bytIndex++)
{

    System.out.println("Crewmate " + (bytIndex + 1));
    System.out.println("What is your name?(type 0 for random)");
    if (!scanner.hasNextInt()){
        arrNames[bytIndex]=scanner.nextLine();
    }else{
                arrNames[bytIndex]=n1.getRanName();
    }

    arrIDs[bytIndex] = "C" + ((int)(Math.random()*999)+1000);


    if( bytIndex% 2 == 0)
    {
        arrShift[bytIndex] = 'A';
    }
    else
    {
        arrShift[bytIndex] = 'B';
    }


    System.out.println("Hal assigned Crew ID: " +arrIDs[bytIndex]);
    System.out.println("Hal assigned Shift: " +arrShift[bytIndex]);


    //default starting stats
    bytMood [bytIndex] = 10;
    bytEnergy [bytIndex] = 10;
    bytHunger [bytIndex] = 0;
    bytStress [bytIndex] = 0;
    bytHealth [bytIndex] = 10;
    System.out.println(" \n ");
}


//display crew database
System.out.println("---------- CREW DATABASE ----------");


for(int bytIndex = 0; bytIndex < crewSize; bytIndex++)
{
    System.out.println("Crewmate: " + (bytIndex + 1));
    System.out.println("Name: " +arrNames[bytIndex]);
    System.out.println("Crew ID: " +arrIDs[bytIndex]);
    System.out.println("Shift: " +arrShift[bytIndex]);
    System.out.println("Mood: " +bytMood[bytIndex]);
    System.out.println("Energy: " +bytEnergy[bytIndex]);
    System.out.println("Stress: " +bytStress[bytIndex]);
    System.out.println("Hunger: " +bytHunger[bytIndex]);
    System.out.println("Health: " +bytHealth[bytIndex]);
    System.out.println(" \n ");


}


int bytOxygen = 90, bytFood = 80, bytWater = 85, bytCrops = 75, bytMorale = 70;

Boolean isDay=true;
while(!bolGameOver)
{
    while(isDay){
    System.out.println("---------- HAL 9001 ----------");
    System.out.println("Mission Day: " +bytMissionDay);


    if(bytMissionDay % 2 == 1)
    {
        System.out.println(" Active Shift: A");
    }
    else
    {
        System.out.println("Active Shift: B");
    }


   
            System.out.println("Enter Choice: ");
            System.out.println("A: View Crew Status: ");
            System.out.println("B: View Ship Resources");
            System.out.println("C: Assign Daily Task");
            System.out.println("D: Schedule Entertainment");
            System.out.println("E: View HAL Recommendations");
            System.out.println("F: Trigger Random Event");
            System.out.println("G: End Mission Day");
            System.out.println("H: Exit Game");
            scanner.nextLine();

            char chrChoice =((scanner.nextLine()).toUpperCase()).charAt(0);
              int crewSelect;
              boolean Aneed=true;
boolean Bneed=true;
boolean Cneed=true;
boolean Dneed=true;
boolean Eneed=true;
            switch (chrChoice)
            {
                case 'A': System.out.println("Viewing Crew Status....");
                for(int bytIndex = 0; bytIndex < crewSize; bytIndex++)
                {
                    System.out.println("Crewmate " + (bytIndex + 1));
                        System.out.println("Name: " + arrNames[bytIndex]);
                        System.out.println("Crew ID: " + arrIDs[bytIndex]);
                        System.out.println("Shift: " + arrShift[bytIndex]);
                        System.out.println("Mood: " + bytMood[bytIndex] + "/10");
                        System.out.println("Energy: " + bytEnergy[bytIndex] + "/10");
                        System.out.println("Stress: " + bytStress[bytIndex] + "/10");
                        System.out.println("Hunger: " + bytHunger[bytIndex] + "/10");
                        System.out.println("Health: " + bytHealth[bytIndex] + "/10");
                        System.out.println(" \n ");
                }
                break;
                case 'B': System.out.println("Viewing Ship Resources....");
                    System.out.println("Oxygen: " + bytOxygen + "%");
                    System.out.println("Food: " + bytFood + "%");
                    System.out.println("Water: " + bytWater + "%");
                    System.out.println("Crop Health: " + bytCrops + "%");
                    System.out.println("Crew Morale: " + bytMorale + "%");
                break;
                  case 'D': System.out.println("Scheduling Entertainment....");
                  System.out.println("Select a crewmember(enter the rank they were added)");
 crewSelect= scanner.nextInt();
                        System.out.println("1. Movie night");
                        System.out.println("2. Group game");
                        System.out.println("3. Quiet reading time");
                        System.out.println("4. Space-viewing break");
                        bytEnergy[crewSelect]--;
                       break;
                case 'E': System.out.println("Viewing HAL Recomendations....");
                System.out.println("Select a crewmember(enter the rank they were added)");
 crewSelect= scanner.nextInt();
                System.out.println(arrNames[crewSelect] + " completed a workout(WIP)");
                        bytEnergy[crewSelect] -= 2;
                        bytHealth[crewSelect] += 2;
                        bytStress[crewSelect]--;
                break;
                case 'F': System.out.println("Triggering Random Event....");
                System.out.println("WIP");
                break;
                case 'G': System.out.println("Ending Mission Day....");
                bytMissionDay++;
                isDay=false;
                break;
                case ('H'): System.out.println("HAL 9001 shutting down....");
                isRunning=false;
                bolGameOver=true;
            
                break;
                

                case 'C': System.out.println("Accesing Daily Task....");
                for (int bytIndex = 0; bytIndex < crewSize; bytIndex++){
                {
                    System.out.println((bytIndex +1) +"." +arrNames[bytIndex]);
                }
              


                    System.out.println("Choose task:");
                    if(Aneed){
                    System.out.println("A: Clean living quarters");}
                    if(Bneed){
                    System.out.println("B: Monitor crops");}
                    if(Cneed){
                    System.out.println("C: Maintain oxygen system");}
                    if(Dneed){
                    System.out.println("D: Prepare Food");}
                    if(Eneed){
                    System.out.println("E: Complete workout");}
                    if(!(Eneed&&Dneed&&Cneed&&Bneed&Aneed)){
                        System.out.println("No tasks! input any key to continue");
                    }
scanner.nextLine();

                    char chrTaskChoice = ((scanner.next()).toUpperCase()).charAt(0);


                    switch(chrTaskChoice)
                    {
                        case 'A': System.out.println(arrNames[bytIndex] + " cleaned the living quarters");
                        bytEnergy[bytIndex]--;
                        bytStress[bytIndex]++;
                        bytMorale += 3;
                        Aneed=false;
                        break;
                        case 'B': System.out.println(arrNames[bytIndex] + " monitored the crops");
                        bytEnergy[bytIndex]--;
                        bytStress[bytIndex]++;
                        bytCrops += 5;
                        bytFood += 5;
                        Bneed=false;
                        break;
                        case 'C': System.out.println(arrNames[bytIndex] + " maintained the oxygen system");
                        bytEnergy[bytIndex] -= 2;
                        bytStress[bytIndex] -= 2;
                        bytOxygen+=15;
                        Cneed=false;
                                               break;

                        case 'D':System.out.println(arrNames[bytIndex] + " fed the crewmembers");
                        for(int bytIndex2 = 0; bytIndex2 < crewSize; bytIndex2++){
                            bytHunger[bytIndex2]+=2;
                        }
                        bytMood[bytIndex]+=2;
                        bytFood--;
                        Dneed=false;
                                               break;

                        case 'E':System.out.println(arrNames[bytIndex] + " got some excercise");
                        bytHunger[bytIndex]++;
                        bytEnergy[bytIndex]--;
                        bytHealth[bytIndex]+=2;
                        Eneed=false;
                                               break;

                        default:
                            break;
                    }}
                
              
                default:
                System.out.println("Invalid Menu Choice");
                                       break;

            }







}
 isDay=true;
}
scanner.close();

}
}
}








