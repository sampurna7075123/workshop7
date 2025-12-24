package Week_7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.collegeID= "np01cp4s";
        s1.name="Sampurna";
        s1.age=22;
        
        System.out.println(s1.collegeID);
        System.out.println(s1.name);
        System.out.println(s1.age);
        
        Student s2 = new Student();
        s2.collegeID= "np01cp5s";
        s2.name="Reehana";
        s2.age=21;
        
        System.out.println(s2.collegeID);
        System.out.println(s2.name);
        System.out.println(s2.age);
        
        Student s3 = new Student();
        s3.collegeID= "np01cp948r3s";
        s3.name="Rossna";
        s3.age=18;
        
        System.out.println(s3.collegeID);
        System.out.println(s3.name);
        System.out.println(s3.age);
        
        
        //--------------------------------
        
        House h1 = new House();
        h1.HouseNumber=7075;
        h1.Location="Kathmandu, Kamal Pokhari";
        h1.OwnerName="Sampurna Odari";
        
        System.out.println(h1.HouseNumber);
        System.out.println(h1.Location);
        System.out.println(h1.OwnerName);
    }
}