package demo;

public class SchoolMaster {
    private String name;
    private String schoolName;
    private String schoolType;

    public SchoolMaster() {
    }

    public SchoolMaster(String name, String schoolName, String schoolType) {
        this.name = name;
        this.schoolName = schoolName;
        this.schoolType = schoolType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    @Override
    public String toString() {
        return "SchoolMaster{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolType='" + schoolType + '\'' +
                '}';
    }
}
