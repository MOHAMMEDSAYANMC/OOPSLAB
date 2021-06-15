import java.util.*;
class product{
    int pcode;
    String pname;
    double price;

    void setdata(int code,String name,double prc ){
        pcode=code;
        pname=name;
        price=prc;       
    }
    void lowprice(product p1,product p2){

        if(price<=p1.price && price<=p2.price)
            System.out.println(pname +" with "+price+" has the smallest price");  
        else if (p1.price<=price && p1.price<=p2.price)  
            System.out.println(p1.pname +" with "+p1.price+" has the smallest price");  
        else  
            System.out.println(p2.pname +" with "+p2.price+" has the smallest price");  
    }
}
class javaQ6
{
    public static void main(String args[])
    {
        product prod1=new product();
        product prod2=new product();
        product prod3=new product();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Product1 name : ");
        String name1=sc.nextLine();
        System.out.print("Enter the Product1 code : ");
        int code1=sc.nextInt();
        System.out.print("Enter the Product1 price : ");
        double price1=sc.nextDouble();
        prod1.setdata(code1, name1, price1);
        System.out.println();

        sc.nextLine();
        System.out.print("Enter the Product2 name : ");
        String name2=sc.nextLine();
        System.out.print("Enter the Product2 code : ");
        int code2=sc.nextInt();
        System.out.print("Enter the Product2 price : ");
        double price2=sc.nextDouble();
        prod2.setdata(code2, name2, price2);
        System.out.println();
	
        sc.nextLine();
        System.out.print("Enter the Product3 name : ");
        String name3=sc.nextLine();
        System.out.print("Enter the Product3 code : ");
        int code3=sc.nextInt();
        System.out.print("Enter the Product3 price : ");
        double price3=sc.nextDouble();
        prod3.setdata(code3, name3, price3);
        System.out.println();

        prod1.lowprice(prod2, prod3);
    }
}