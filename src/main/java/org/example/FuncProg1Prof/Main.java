package org.example.FuncProg1Prof;
import static org.example.FuncProg1Prof.List.list;
import static org.example.FuncProg1Prof.List.empty;

public class Main {
    static String toString(List<Integer> xs){
        if(xs.isEmpty())
            return "nil";
        else{
            System.out.println("head: "+ xs.head+ " tail: "+xs.tail);
            return "("+ xs.head +" "+ toString(xs.tail) + ")";
        }
    }

    static boolean contains(List<Integer> xs, int obj) { // bir elemanin listede olup olmadigini döndürür
        if (xs.isEmpty())
            return false;
        if (xs.head.equals(obj))
            return true;
        else {
            return contains(xs.tail, obj);
        }
    }

    static int length(List<Integer> list){ // listenin uzunlugunu döndür
        if(list.isEmpty()) return 0;
        else{
            return 1+ length(list.tail);
        }
    }

    static List<Integer> take(List<Integer> l, int n){ // listeden ilk n elemani al
        if(length(l)<=n) return l;
        if(n==0) return empty();
        else return list(l.head,take(l.tail,n-1));

    }
    static List<Integer> drop(List<Integer> xs, int n){
        if(xs.isEmpty()|| n<=0) return xs;
        else return drop(xs.tail,n-1);
    }

    static List<Integer> append(List<Integer> xs, List<Integer> y){// iki listeyei birbirine ekle
        if(xs.isEmpty()) return y;
        if(y.isEmpty()) return xs;
        else return list(xs.head,append(xs.tail,y));
    }
    static List<Integer> reverse(List<Integer> xs) {
        if (xs.isEmpty()) return xs;
        else return append(reverse(xs.tail), list(xs.head, empty()));
    }

    static void Print(List<Integer> xs){
        if(xs.isEmpty()) return;
        else{
            System.out.println(xs.head);
            Print(xs.tail);
        }
    }

    static  void  forEach(List<Integer> xs, ConsumerForeach<Integer> c){
        if(xs.isEmpty())return;
        else{
            c.accept(xs.head);
            forEach(xs.tail,c);
        }
    }

    static <A> List<A> filter(List<A> xs, PredicateForFilter<A> p) {
        if (xs.isEmpty()) return xs;
        else if (p.test(xs.head)) return list(xs.head, filter(xs.tail, p));
        else return filter(xs.tail, p);
    }

    static <A, B> List<B> map(List<A> xs, FunctionForMap<A, B> f) {
        if (xs.isEmpty()) return empty();
        else return list(f.apply(xs.head), map(xs.tail, f));
    }



    public static void main(String[] args) {
        List<Integer> sequence = list(1, 2);
        List<Integer> emptyList = empty();
        List<Integer> prepend = list(0, empty());


        List<Integer> xs = list(1,2,3,4,5);



        /*

        System.out.println(sequence.isEmpty());   // "false"
        System.out.println(emptyList.isEmpty());  // "true"
        System.out.println(prepend.isEmpty());    // "false"

         */

        //System.out.println(toString(xs));

        //System.out.println(contains(xs,1));

        //System.out.println(length(xs));

        //System.out.println(toString(take(xs,3)));


        /*
        //foreach

        forEach(xs, new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        // or shorter with lambda
        System.out.println("shorter with lambda");

        forEach(xs,i-> System.out.println(i));

        // even shorter with method reference
        forEach(xs, System.out::println);


        // filter
        List<Integer> lt3 = filter(xs, i -> i < 3);
        forEach(lt3, System.out::println);
*/
        // map
        Student s1=new Student("eyüp");
        Student s2=new Student("ali");
        Student s3=new Student("veli");
        Student s4=new Student("osman");
        Student s5=new Student("alex");
        List<Student> listMap = list(s1,s2,s3,s4,s5);
        List<String> fns = map(listMap, s -> s.getName());
        List<String> fns2 = map(listMap, Student::getName);  // even shorter

    List<Integer> listMap2 = list(1,2,3,4,5);




    }






}
