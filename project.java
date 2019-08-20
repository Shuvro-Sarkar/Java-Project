
package project;
import java.util.*;
public class Project{

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        Date date=new Date();
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println(" ");
        System.out.println("Restaurant Name\t\t\t"+"User Name\t\t\t"+"Date and Time");
        System.out.println(" ");
        System.out.println("Welcome to our Restaurant"+"\t"+name+"\t\t\t"+date.toString());
        int a,b,c,d,e;
        int i;
        int eachcost=0;
        int cost=0;
        int price=0;
        int y=0;
        String item=" ";
        //int press [];
        System.out.println(" ");
        System.out.println("See Menu card ");
        System.out.println(" ");
        System.out.println("Item Name\t\t"+"Price\t\t"+"Press to order");
        System.out.println(" ");
        System.out.println("Chicken Fry\t\t"+"60\t\t"+"1");
        System.out.println("Burger\t\t\t"+"40\t\t"+"2");
        System.out.println("Cold coffee\t\t"+"50\t\t"+"3");
        System.out.println("Hot coffee\t\t"+"50\t\t"+"4");
        System.out.println("Pizza\t\t\t"+"70\t\t"+"5");
        System.out.println(" ");

        //System.out.println("How Many Orders You Want To Add");
        //int n=sc.nextInt();
        System.out.println(" ");
        ArrayList order=new ArrayList();
        ArrayList pric=new ArrayList();
        ArrayList plate=new ArrayList();

        do
        {

            System.out.println("Press to order");
            a=sc.nextInt();
            int press[]=new int[]{a};
            System.out.println(press[0]);

            System.out.println(" ");

            System.out.println("You Have Pressed"+"\t"+a);
            System.out.println(" ");
            System.out.println("Enter the Number of Quantity");
            b=sc.nextInt();
            System.out.println(" ");
            System.out.println("Item Name\t\t"+"Number of Quantity\t\t"+"Total");
            System.out.println(" ");
            //Code for item select

            if(a==1)
            {
                item="Chicken Fry";
                price=60;
                eachcost=price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                boolean of=order.contains(item);
                if(of)
                {
                    order.add("");
                    pric.add(eachcost);
                    plate.add(b);
                }
                else
                {
                    pric.add(eachcost);
                    plate.add(b);
                    order.add(item);
                }
            }
            if(a==2)
            {
                item="Burger";
                price=40;
                eachcost=price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t\t"+b+"\t\t\t\t"+eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==3)
            {
                item="Cold coffee";
                price=50;
                eachcost=price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==4)
            {
                item="Hot coffee";
                price=50;
                eachcost=price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==5)
            {
                item="Pizza";
                price=70;
                eachcost=price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t\t"+b+"\t\t\t\t"+eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }


            System.out.println(" ");
           // System.out.println("Report:");
            System.out.println(" ");
            for(int k=0;k<press.length;k++)
            {
                String fetchitemname= "  ";

                System.out.println("Item Name\t\t"+"No. of quantity\t\t\t"+"Price");
                if(press[k]==1)
                {
                    fetchitemname="Chicken Fry   ";
                    System.out.print(fetchitemname+"\t\t"+b+"\t\t\t\t"+eachcost);
                }
                if(press[k]==2)
                {
                    fetchitemname="Burger           ";
                    System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t"+eachcost);
                }
                if(press[k]==3)
                {
                    fetchitemname="Cold coffee  ";
                    System.out.print(fetchitemname+"\t\t"+b+"\t\t\t\t"+eachcost);
                }
                if(press[k]==4)
                {
                    fetchitemname="Hot coffee  ";
                    System.out.print(fetchitemname+"\t\t"+b+"\t\t\t\t"+eachcost);
                }
                if(press[k]==5)
                {
                    fetchitemname="Pizza        ";
                    System.out.print(fetchitemname+"\t\t\t"+b+"\t\t\t\t"+eachcost);
                }




            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Do You Want To Continue the Order(Press 1 for continue/Otherwise Press 0)");
            y=sc.nextInt();

            //for(int k=0;k<press.length;k++)
            //
            //System.out.print(press[k]+"\t");

            //}
            System.out.println(" ");


        }while(y!=0);

        System.out.println(" ");
        System.out.println("Report:");
        System.out.println(" ");
        //System.out.println(press[0]);
        System.out.println(" ");

        System.out.println("Items Names"+"\t\t\t\t\t\t\t"+"No. of quantity"+"\t\t\t\t\t\t"+"Sub Total");
        Iterator itr  =order.iterator();
        Iterator itr1 =pric.iterator();
        Iterator itr2 =plate.iterator();

        while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
        {
            System.out.print(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t\t\t\t\t\t"+itr1.next());
            System.out.println(" ");

        }

        System.out.println(" ");
        System.out.println("Total"+"     "+cost);
        System.out.println(" ");
        System.out.println("Thank You for visiting our restaurant\t");

    }
}       
