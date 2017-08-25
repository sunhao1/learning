package Day10;

/*class Person {
    private String name;
    private int age;
}
//千万不要为了获取其他类的功能，简化代码而继承。
//必须是类与类之间有所属关系才可以继承
//父类中的内容必须在子类中全部存在才能继承
class Student extends Person {
    public void study(String name,int age) {
        System.out.println("学生名字是"+" "+name+ " " +"学生年龄是"+" "+age);
    }
}

class Work extends Student {
    public void work(String name,int age) {
        System.out.println("工人名字是"+" "+name+ " " +"工人年龄是"+" " +age);
    }
}*/
class Person {
    int num = 3;

    Person() {
        System.out.println("父类");
    }

    Person(int w) {
        num = 60;
        System.out.println(w + num);
    }
}

class People extends Person {
    People() {
        System.out.println("子类");
    }

    People(int y) {

        super(5);
        System.out.println(y);
    }
}
