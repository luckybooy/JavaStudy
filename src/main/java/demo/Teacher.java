package demo;

public class Teacher {
    private int tNo;
    private String name;
    private String teach;

    public Teacher() {
    }

    public Teacher(int tNo, String name, String teach) {
        this.tNo = tNo;
        this.name = name;
        this.teach = teach;
    }

    public int gettNo() {
        return tNo;
    }

    public void settNo(int tNo) {
        this.tNo = tNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tNo=" + tNo +
                ", name='" + name + '\'' +
                ", teach='" + teach + '\'' +
                '}';
    }
}
