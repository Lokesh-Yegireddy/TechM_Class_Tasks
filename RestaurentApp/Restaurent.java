package RestaurentApp;

public class Restaurent {
public static void main(String args[])
{

Owner owner=new Owner();

owner.AddFood();

//owner.DisplayMenu();

//owner.RemoveItems();


Customer customer=new Customer("Anusha",owner);
System.out.println("Customer Placing Order...");
customer.PlaceOrder();
System.out.println("Customer Changing The Order");
customer.RemoveOrder();
System.out.println("Customer Viewing Order...");
customer.ViewOrder();
System.out.println("Customer Requested TO Bring The Bill...");
customer.RequestBill();

}
}
