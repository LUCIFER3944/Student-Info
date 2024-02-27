public class copy {
    public static void main(String[] args) {
        // Creationg object here
        student s1= new student();
        student s1ob1= new student();
        student s1ob2= new student();

        student s2= new student();
        student s2ob1= new student();
        student s2ob2= new student();

        student s3= new student();
        student s3ob1= new student();
        student s3ob2= new student();


        s1.getData();
        s1.calculateMarks();
        s1ob1.copyobj(s1);
        s1ob2.copyobj(s1);
        
        s2.getData();
        s2.calculateMarks();
        s2ob1.copyobj(s2);
        s2ob2.copyobj(s2);

        s3.getData();
        s3.calculateMarks();
        s3ob1.copyobj(s2);
        s3ob2.copyobj(s2);
// showing data here
        s1.show();
        s1ob1.show();
        s1ob2.show();

        s2.show();
        s2ob1.show();
        s2ob2.show();

        s3.show();
        s3ob1.show();
        s3ob2.show();
    }
}
