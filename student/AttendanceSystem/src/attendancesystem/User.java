/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package attendancesystem;

class User {
    
   
    private int id;
    private String student_number, studentname, yearnsection, course;
    
    
    public User(int id,String student_number, String studentname, String yearnsection, String course){
    this.id =  id;
    this.studentname = studentname;
    this.student_number = student_number;
    this.yearnsection = yearnsection;
    this.course = course;

   
    
    }
    public int getno(){
    return id;
    }
    
    
    public String getstudentname(){
    
        return studentname;
    }
    
     public String getstudentnumber(){
    
    return student_number;
    }
    
    public String getyearnsection(){
    return yearnsection;
    }
    
    public String getcourse(){
    return course;
    }
   

}
