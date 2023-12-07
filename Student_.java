public class Student_ {
    private int id;
    private String name;
    private int age;
    private String Home_address;

    public Student_() {
    }

    public Student_(int id, String name, int age, String Home_address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.Home_address = Home_address;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Home_address
     */
    public String getHome_address() {
        return Home_address;
    }

    /**
     * 设置
     * @param Home_address
     */
    public void setHome_address(String Home_address) {
        this.Home_address = Home_address;
    }

    public String toString() {
        return "Student_{id = " + id + ", name = " + name + ", age = " + age + ", Home_address = " + Home_address + "}";
    }
}
