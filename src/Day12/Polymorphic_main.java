package Day12;

//多态的应用。
public class Polymorphic_main {
    /* public static void main(String[] args) {
         Funcation(new cat());
         Funcation(new dog());
         Funcation(new pig());//Polymorphic
     }

 //多态提高程序的扩展性
     public static void Funcation(Polymorphic p) {
         p.Animal();
     }*/
    public static void main(String[] args) {
        Funcation(new cat());//从低级向高级转型
        Funcation(new dog());
        //Funcation(new pig());//Polymorphic
    }

    //多态提高程序的扩展性
    public static void Funcation(Polymorphic p) {
        p.Animal();
        //cat c = (cat) p;//把高级引用强转到低级，这样就可以调用低级里的个性了。
        //c.attribute_1();
        if (p instanceof cat) {
            cat c = (cat) p;//把高级引用强转到低级，这样就可以调用低级里的个性了。
            c.attribute_1();
        }
        else if (p instanceof dog) {
            dog d = (dog) p;//把高级引用强转到低级，这样就可以调用低级里的个性了。
            d.attribute_2();
        }

    }

}
