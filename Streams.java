package Task21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product{
    int id;
    String name;
    double price;

    product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int  getId(){
        return id;

    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

     public String toString(){
        return "id : "+getId()+" name : "+getName()+" price : "+getPrice();
    } 

}

public class Streams {

    public static void main(String[] args) {

        List <product> al=new ArrayList<>();

        al.add(new product(1, "hp", 80000));
        al.add(new product(2, "dell", 20000));
        al.add(new product(3, "lenovo", 50000));
        al.add(new product(4, "acer", 40000));
        al.add(new product(5, "samsung", 60000));

        List <product> nl=new ArrayList<>();

       nl= al.stream()
                    .filter(p->p.price>40000)
                    .collect(Collectors.toList());
        
        System.out.println(nl.toString());
        
    System.out.println();
    al.stream()
            .filter(p->p.id>1&& p.id<5).forEach(pr->System.out.println(pr));



    List<String> names=new ArrayList<>();

    names=al.stream().map(p->p.getName()).collect(Collectors.toList());
    System.out.println();
    System.out.println(names);

    List<Double> prices=new ArrayList<>();

    prices=al.stream().map(n->n.getPrice()).collect(Collectors.toList());
    System.out.println();
    System.out.println(prices);

    }
    
}
