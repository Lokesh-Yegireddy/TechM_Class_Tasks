package RestaurentApp;
import java.util.*;

public class Owner {
String DishName;
double Price;
public Owner(String DishName,double Price)
{
this.DishName=DishName;
this.Price=Price;
}
public Owner() {
// TODO Auto-generated constructor stub
super();
}
 Map<String, Double> menu = new HashMap<>();


Scanner sc=new Scanner(System.in);

public void AddFood()
{  
   
System.out.println("Enter How Many Items You Want To Add In The Menu");
int ItemsToBeAdded=sc.nextInt();
sc.nextLine();
for(int i=0; i<ItemsToBeAdded;i++)
{  
System.out.println("Enter DishName :");
String DishName=sc.nextLine();
System.out.println("Enter Price :");
double Price=sc.nextDouble();
sc.nextLine();
if(menu.containsKey(DishName))
{
System.out.println("Item Already Existed !");
System.out.println("Enter Non Menu DishName :");
 i--;
}
else {
menu.put(DishName,Price);
}
}
System.out.println("Items Added To The Menu !");

}

// Remove Items From Menu
public void RemoveItems()
{
System.out.println("Enter How Many Items You Want To Remove");
int ItemsToBeRemoved=sc.nextInt();
sc.nextLine();
for(int i=0;i<ItemsToBeRemoved;i++) {
System.out.println("Enter DishName To Remove From The Menu");
String RemoveDish=sc.nextLine();
if(menu.containsKey(RemoveDish))
{  
menu.remove(RemoveDish);
}else
System.out.println("Dish not found in the Menu!");
}
System.out.println("Items Removed From The Menu !");

}


public  void DisplayMenu()
{

System.out.println("Menu : ");
for (Map.Entry<String, Double> entry : menu.entrySet()) {
         System.out.println(entry.getKey() + " - $" + entry.getValue());
         
}


}
}
