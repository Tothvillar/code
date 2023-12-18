public class Dog extends animal{
    @Override
    public void behavior(){
        System.out.println("吃骨头");
    }
    public Dog() {
    }
    public Dog(String name,int age) {
        super(name, age);
    }


}
