package exception;

class Person{
    private  String name;
    private  int age;

    /**
     * 接收--传参时抛出的异常
     * @param name
     * @param age
     * @throws DemoVaildException
     */
    public Person(String name, int age) throws DemoVaildException {
        this.name = name;
        if (age > 0 && age <200){
            this.age = age;
        }else{
            throw new DemoVaildException("输入的年龄非法");
        }

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

    public void setAge(int age)  {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}