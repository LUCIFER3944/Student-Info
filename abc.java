public class abc {
    public static void main(String[] args) {
        student s1= new student();
        s1.getData();
        s1.calculateMarks();
        student s2= new student();
        s2.copyobj(s1);
        s1.show();
        s2.show();
    }
}
