package RestaurentApp;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Customer  {
  private String CustomerName;
  private int Quantity;
  private Owner owner;
  private Map<String,Integer> orders=new HashMap<String,Integer>();
  private double TotalBill;
  Scanner sc=new Scanner(System.in);
  public Customer(String CustomerName,Owner owner)
  {
 this.CustomerName=CustomerName;
 this.owner=owner;
 
  }
 
 String CustomerOrder;
 int OrderQuantity;
  
public void PlaceOrder()
{    
	 owner.DisplayMenu();
	 System.out.println("Please Enter DishName :");
	 CustomerOrder=sc.nextLine();
	 System.out.println("Please Enter Quantity");
	  OrderQuantity=sc.nextInt();
	  sc.nextLine();
if(owner.menu.containsKey(CustomerOrder))
{
    orders.put(CustomerOrder, OrderQuantity);
    TotalBill+=owner.menu.get(CustomerOrder) * OrderQuantity;
    System.out.println("Order Placed !");
    System.out.println("Anything Else You Want TO Order ?Say yes/no");
    String Continue=sc.next();
    sc.nextLine();
    if(Continue.equalsIgnoreCase("yes"))
    {
    	 owner.DisplayMenu();
    	PlaceOrder();
    }
    else
      System.out.println("Thank You For Ordering !");
}
else
System.out.println(CustomerOrder+" Not Found In The Menu!");

}

public void RemoveOrder() {
  ViewOrder();	
  System.out.println("1.Remove Complete Item\n2.Modify Qunatity Of Your Item");
  int choice=sc.nextInt();
  sc.nextLine();
  if(choice==1)
  {
	  System.out.println("Enter How Many Items You Want Remove Completely :");
	  int NoOfItems=sc.nextInt();
	  sc.nextLine();
	  for(int i=0;i<NoOfItems;i++)
	  {
		  System.out.println("Enter 'DishName' To Remove From Your Order");
		  String RemoveOrder=sc.nextLine();
		  if(orders.containsKey(RemoveOrder))
		  {
			  TotalBill-=(owner.menu.get(RemoveOrder)*orders.get(RemoveOrder));
			  orders.remove(RemoveOrder);
			 
		  }
	  }
  }
  else if(choice==2)
  {   
	  System.out.println("Enter Value For How Many Items You Want To Modify Quantity :");
	  int Changes=sc.nextInt();
	  sc.nextLine();
	  for(int i=0;i<Changes;i++) {
		  System.out.println("Enter DishName To Modify Quantity :");
		  String DishName=sc.nextLine();
		  System.out.println("Enter Modified Quantity Of Your Order :");
		  int ModifyDishQuantity=sc.nextInt();
		  sc.nextLine();
		  if(orders.containsKey(DishName))
		  {   
			  int OldQuantity=orders.get(DishName);
			  int ModifiedQuantityDifference=Math.abs(OldQuantity-ModifyDishQuantity);
			  if(OldQuantity>ModifyDishQuantity)
			  {   
				  orders.put(DishName,ModifyDishQuantity);
				  TotalBill-=owner.menu.get(DishName)*ModifiedQuantityDifference;
			  }
			  else
			  {
				  orders.put(DishName,ModifyDishQuantity);
				  TotalBill+=owner.menu.get(DishName)*ModifiedQuantityDifference;
			  }
			 
		  }
	  }
	 
  }
}

public void ViewOrder() {

   System.out.println(CustomerName+"'s Order :");
   for(Map.Entry<String ,Integer> entry:orders.entrySet())
   {
	   System.out.println("Order : "+entry.getKey()+" Qunatity : "+entry.getValue());
   }
	
}

public void RequestBill() {
      
	 ViewOrder();
     System.out.println("Total Bill On The  Order :"+TotalBill);

}

}
