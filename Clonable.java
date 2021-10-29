import javax.xml.namespace.QName;

public class Clonable {
    int rollno;
    String name;

    Clonable(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();


    }

    public static void main(String args[]) {
        try {
            Clonable s1 = new Clonable(01 ,"pratiksha");
            Clonable s2 = (Clonable) s1.clone();

            System.out.println(s1.rollno + "" + s1.name);
            System.out.println(s2.rollno + "" + s2.name);
        } catch (CloneNotSupportedException c) {


        }
    }
}