public class abc {
    public static void main(String[] args) {
        student t1= new student();
        t1.getData();
        t1.calculateMarks();
        student t2= new student();
        t2.copyobj(t1);
        t1.show();
        t2.show();
    }
}
