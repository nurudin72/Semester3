package Modul3;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Stack");

        System.out.println("=====Stack=====");
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Panjang Stak " + s.count());
        System.out.println("Data terakhir " + s.Peek());
        System.out.println(s.toString());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println("Clear method");
        s.clear();
        System.out.println(s.size);
        System.out.println(s.toString());
        
        System.out.println("=====Queue=====");
        queue c = new queue();
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        c.push(5);

        System.out.println("Panjang Stak " + c.count());
        System.out.println("Data terakhir " + c.Peek());
        System.out.println(c.toString());
        c.pop();
        c.pop();
        c.pop();
        c.pop();
        c.pop();
        System.out.println("Clear method");
        c.clear();
        System.out.println(c.size);
        System.out.println(c.toString());

    }
}
