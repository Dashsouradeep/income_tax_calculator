import java.util.*;

class Tax0
{
     double taxcalc(double tax,double sal)
    {
        tax=0.0;
        return tax;
    }
    
}
class Tax1
{
     double taxcalc(double tax,double sal)
    {
        tax=0.05*(sal-300000.0);
        return tax;
    }
    
}
class Tax2
{
     double taxcalc(double tax,double sal)
    {
        tax=15000.0+(0.1*(sal-600000.0));
        return tax;
    }
   
}
class Tax3
{
     double taxcalc(double tax,double sal)
    {
        tax=45000.0+(0.15*(sal-900000.0));
        return tax;
    }
   
}
class Tax4
{
     double taxcalc(double tax,double sal)
    {
        tax=90000.0+(0.2*(sal-120000.0));
        return tax;
    }
 
}
class Tax5
{
     double taxcalc(double tax,double sal)
    {
        tax=150000.0+(0.3*(sal-1500000.0));
        return tax;
        
    }
}

public class Taxcalculator
{
    public static  void main(String[] args) 
    {
        double sal,tax=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your annual income");
        sal=sc.nextDouble();
        if(sal<300000)
        {
            Tax0 tx=new Tax0();
            tax=tx.taxcalc(tax,sal);
        }
        else if(sal>300000 && sal<600000)
        {
            Tax1 tx=new Tax1();
            tax=tx.taxcalc(tax,sal);
        }
        else if(sal>600000 && sal<900000)
        {
            Tax2 tx=new Tax2();
            tax=tx.taxcalc(tax,sal);
        }
        else if(sal>900000 && sal<1200000)
        {
            Tax3 tx=new Tax3();
            tax=tx.taxcalc(tax,sal);
        }
        else if(sal>1200000 && sal<1500000)
        {
            Tax4 tx=new Tax4();
            tax=tx.taxcalc(tax,sal);
        }
        else if(sal>1500000)
        {
            Tax5 tx=new Tax5();
            tax=tx.taxcalc(tax,sal);
        }

        System.out.println("Your annual tax is: "+tax);

        
    }
}