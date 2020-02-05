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
public class ShowStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student Stu1 = new Student();
        Stu1.setidNumber(032154);
        Stu1.setpointsEarned(48);
        Stu1.setcreditsEarned(12);
        System.out.println("Student ID Number: " + Stu1.getidNumber());
        System.out.println("Points Earned: " + Stu1.getpointsEarned());
        System.out.println("Credits Taken: " + Stu1.getcreditsEarned());
        System.out.println("GPA: " + Stu1.getGPA());
    }
    
}
