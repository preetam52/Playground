import java.util.Scanner;//import required packages here

class Item
{
  private int price;
  public int getprice()
  {
    return price ;
  }
  public void setprice(int price)
  {
    this.price = price ;
  }//create various method to return attribute value(s)
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public String getproduct()
  {
    return product ;
  }
  public void setproduct(String product)
  {
    this.product = product ;
  }
  public int getquantity()
  {
    return quantity ;
  }
  public void setquantity(int quantity)
  {
    this.quantity = quantity ;
  }//create various method to return attribute value(s)
}

class Bill extends Item
{
  public void totalPrice(int p , int q)
  {
    System.out.println("Total Price is : "+(p*q));
  }//implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String product = sc.nextLine();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    i.setprice(price);
    c.setproduct(product);
    c.setquantity(quantity);
    int p = i.getprice();
    int q = c.getquantity();
    obj.totalPrice(p,q);
    //write the logic here
  }
}