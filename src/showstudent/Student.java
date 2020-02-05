/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showstudent;

/**
 *
 * @author ubryc
 */
public class Student {
    private double idNumber;
    private int pointsEarned;
    private int creditsEarned;
    private double GPA;
    
    public void setidNumber(double idNumb){
        
        idNumber = idNumb;
        
    }
    
    public double getidNumber(){
    
        return idNumber;
    
    }
    public void setpointsEarned(int ptsEarned){
        
        pointsEarned = ptsEarned;
        
    }
    
    public double getpointsEarned(){
    
        return pointsEarned;
    
    }
    public void setcreditsEarned(int credsEarned){
        
        creditsEarned = credsEarned;
        
    }
    
    public double getcreditsEarned(){
    
        return creditsEarned;
    
    }
    
    public void setGPA(double gradePointAvg){
        
        GPA = gradePointAvg;
        
    }
    
    public double getGPA(){
    
        GPA = pointsEarned / creditsEarned;
        return GPA;
    
    }
    
}
