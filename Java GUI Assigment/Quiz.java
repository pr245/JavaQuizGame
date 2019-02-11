
/**
 * Class Quiz contains methods of tracking the score and incorrect answers in the quiz game, 
 * it will contain case statements for string questions and answers.
 * @author Prabodh Rai pr245
 * @version version 2 4/1/2016
 */
public class Quiz
{
    private int score = 0;  //set number of correct to 0;
    private int incorrect = 0; // set number of incorrect to 0;

    /**
     * The constructor for objects of class Quiz
     */
    public Quiz() 
    {

    }

    /**
     * Incremeant the user's score by 1
     */
    public void scoreinc()
    {
        score++; // score = score + 1
    }

    /**
     * Return the user's score
     */

    public int getScore()
    {
        return score; // return int score 
    }

    /**
     * Incremeant the user's incorrect answers by 1
     */
    public void incorrectinc()
    {
        incorrect++; // incorrect = incorrect + 1
    }

    /**
     * Return the user's number of incorrect answers
     */

    public int getincorrect()
    {
        return incorrect; // return int score 
    }

    /**
     * Reset the user's score
     */

    public void reset()
    {
        score = 0; //set score to 0

    }

    public void exit()
    {
        System.exit(0);
    }
    
    /**
     * case statements for question strings.
     */
    public String questions(int selection){
        switch(selection)
        {
            case 1: return "Question 1: Which of the following is not a keyword in java?"; 
            case 2: return "Question 2: What is the size of float variable?";
            case 3: return "Question 3: If Class A is the super class, what type Class is Class B? Answer in the format; Classtype Class";
            case 4: return "Question 4: For a super class transport what would be the wrong subclass?";
            case 5: return "Question 5: What is Encapsulation?";
            case 6: return "Question 6: What is TreeSet Interface?";
            default: return "";
        }
    }

    /**
     * Question 1: Which of the following is not a keyword in java?. (type the answer number)
     * 1."static" 
     * 2."Boolean"
     * 3."void"
     * 4."private" 
     */
    public String q1a(int selection){
        if (selection == 2){
            score++;
        } else if (selection !=2){
        incorrect++;
        }
        switch(selection)
        {
            case 1: return "static";  
            case 2: return "Boolean"; 
            case 3: return "void"; 
            case 4: return "private"; 
            default: return "";
            
        }
        
    }

    /**
     * Question 2: What is the size of float variable?. (type the answer number)
     * 1."8 bit"
     * 2."16 bit"
     * 3."32 bit"
     * 4."64 bit"
     */
    public String q2a(int selection){
        if (selection == 3){
            score++;
        } else if (selection !=3){
            incorrect++;
        } 
        switch(selection)
        {
            case 1: return "8 bit";
            case 2: return "16 bit";
            case 3: return "32 bit"; 
            case 4: return "64 bit";
            default: return "";
        }
    }

    /**
     * Question 3: If Class A is the super class, what type Class is Class B? Answer in the format; Classtype Class. (type the answer number)
     * "Sub Class"
     * "Super Class"
     * "Second Class"
     * "First Class"
     */
    public String q3a(int selection){
         if (selection == 1){
            score++;
        } else if (selection !=1){
            incorrect++;
        } 
        switch(selection)
        {
            case 1: return "Sub Class" ;
            case 2: return "Super Class" ;
            case 3: return "Second Class";
            case 4: return "First Class";
            default: return "";
        }
    }

    /**
     * Question 4: For a super class transport what would be the wrong subclass?. (type the answer number)
     * 1."Bus Class"
     * 2."Train Class"
     * 3."Car Class"
     * 4."Bird Class"
     */
    public String q4a(int selection){
        if (selection == 4){
            score++;
        } else if (selection !=4){
            incorrect++;
        } 
        switch(selection)
        {
            case 1: return "Bus Class";
            case 2: return "Train Class";
            case 3: return "Car Class";
            case 4: return "Bird Class";
            default: return "";
        }
    }

    /**
     * Question 5: What is Encapsulation?. (type the answer number)
     * 1."Encapsulation is a technique to define different methods of same type"
     * 2."Encapsulation is the ability of an object to take on many forms"
     * 3."Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods"
     * 4."None of the above"
     */
    public String q5a(int selection){
         if (selection == 4){
            score++;
        } else if (selection !=4){
            incorrect++;
        }     
        switch(selection)
        {
            case 1: return "Encapsulation is a technique to define different methods of same type";
            case 2: return "Encapsulation is the ability of an object to take on many forms";
            case 3: return "Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods";
            case 4: return "None of the above";
            default: return "";
        }
    }

    /**
     * Question 6: What is TreeSet Interface?.(type the answer number)
     * 1."It is a Set implemented when we want elements in a tree based order"
     * 2."It is a Set implemented when we want elements in a sorted order"
     * 3."It is a Set implemented when we want elements in a binary tree format"
     * 4."It is a Set implemented when we want elements in a hiearchical order"
     */
    public String q6a(int selection){
         if (selection == 2){
            score++;
        } else if (selection !=2){
            incorrect++;
        } 
        switch(selection)
        {
            case 1: return "It is a Set implemented when we want elements in a tree based order";
            case 2: return "It is a Set implemented when we want elements in a sorted order";
            case 3: return "It is a Set implemented when we want elements in a binary tree format";
            case 4: return "It is a Set implemented when we want elements in a hiearchical order";
            default: return "";
        }
    }

     

}