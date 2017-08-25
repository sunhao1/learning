package Day13;

public class Object_main {
    public static void main(String[] args) {
        Object_equals d1 = new Object_equals(4);
        Object_equals d2 = new Object_equals(4);
        System.out.println(d1.equals(d2));
        Object_equals d3 = new Object_equals(4);
        System.out.println(d3.tostring());
        Object_equals d4 = new Object_equals(4);
        System.out.println(d4.tostring());
        }
}//使用Object方法时一般我们需要复写下，来表示我们所要表达的内容。
