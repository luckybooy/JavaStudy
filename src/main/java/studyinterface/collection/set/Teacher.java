package studyinterface.collection.set;

public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 重写equals方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        boolean isEq = false;
        if (obj instanceof Teacher){
            Teacher th = (Teacher) obj;
            if (this.name != null && th.name != null && th.age==this.age && th.name.equals(this.name)){
                isEq = true;
            }
        }
        return isEq;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public int CompareTo(Teacher th){
        int flag = this.age - th.age;
        if (flag == 0){
            flag = this.name.compareTo(th.name);
        }
        return flag;
    }
}
