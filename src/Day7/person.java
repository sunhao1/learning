package Day7;

/**
 * Created by sunha on 2017/7/21.
 */
public class person {
    private int age;

    public void setAge(int x) {
        if (x > 0 && x < 130) {
            age = x;
            speak();
        } else
            System.out.print("错误信息");
    }

    public int getAge() {
        return age;
    }


    public void speak() {
        System.out.println("age=" + age);
    }
}
