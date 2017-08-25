package Day13;


public class Object_equals {
    private int num;

    Object_equals(int num) {
        this.num = num;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Object_equals))
            return false;
        Object_equals d = (Object_equals)obj;
        return this.num ==d.num;
    }
    public String  tostring(){
        return "Object_equals:"+ num;
    }


    /*public boolean compare(Object_equals obj) {   //Object obj = new Object_equals()
        return this.num == obj.num;
      }*/

}
