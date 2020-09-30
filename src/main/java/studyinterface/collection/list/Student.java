package studyinterface.collection.list;

public class Student extends Person {
    private int sNo;

    public Student(String name, int age,int sNo) {
        super(name, age);
        this.sNo = sNo;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                "} " + super.toString();
    }
}
