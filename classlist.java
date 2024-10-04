import java.util.*;
class classlist{
    public static void main(String[] args) {
        List<String> stringlist = new ArrayList<>();
        stringlist.add("Mango");
        stringlist.add("Orange");
        stringlist.add("Apple");
        System.out.println("List elements:");
        for(String fruit:stringlist)
        {
            System.out.println(fruit);
        }
    }
}