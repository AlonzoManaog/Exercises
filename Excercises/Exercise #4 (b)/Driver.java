public class Driver {
    public static int getOldest(Student students[]){
        int max=0;
        for(int i=0;i<students.length;i++){
            if(students[i].age>max){
                max=students[i].age;
            }
        }
        return max;
    }
    public static void main (String[] args){
        Student students[] = new Student[]{
            new Student("Steve", 55), 
            new Student("Bill", 65), 
            new Student("Warren", 75), 
            new Student("Elon", 45), 
            new Student("John", 35), 
};
        System.out.println("Max Age: "+getOldest(students));
    }   
    
}
