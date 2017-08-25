package Day17;
/*
1.获取字符串长度；int length();
2.根据位置获取位置上的某个字符；char charAt(int index);
3.根据字符获取该字符串在字符中的位置；int indexOf(int ch);
                                      int indexOf(int ch,int fromIndex);
int indexOf(int ch);返回的是string在字符串中第一次出现的位置
int indexOf(int ch,int fromIndex);从指定位置获取


*/
public class String_1 {
    public static void main(String[] args) {
        //method_get();
        method_if();

    }
    public static void method_if(){
        String str = "ArrayDemo.java";
        sop(str.startsWith("Array"));
        sop(str.endsWith(".java"));
        sop(str.contains("Demo"));
    }
    public static void method_get(){
        String str = "abcvredhaky";
        sop(str.length());//获取长度
        sop(str.charAt(5));//根据索引获取字符
        sop(str.indexOf("c"));//根据字符获取索引
        sop(str.indexOf("a",3));//从指定位置获取字符
    }
    public static void sop(Object obj){//万能的方法，可以返回任何类型，把返回值类型提升。
        System.out.println(obj);
    }
}


