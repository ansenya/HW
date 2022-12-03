import java.util.*;

public class Trinnity<T> /*implements Comparable <T> */{

     T first;
     T second;
     T third;



    Trinnity(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
        fun();
    }


    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
        fun();
    }

    public void setSecond(T second) {
        this.second = second;
        fun();
    }

    public void setThird(T third) {
        this.third = third;
        fun();
    }


    private void fun() {
        //compareTo(); //оно должно отсортировать поля по возрастанию, но я чет не понимаю как
    }

   /* @Override
    public int compareTo(T o)
    {
        if (this.first != o()) {
            return this.age - o.getAge();
        }
        return this.name.compareTo(o.getName());
    }

    */

    @Override
    public String toString(){
        return (first + ", " + second + ", " + third);
    }


}