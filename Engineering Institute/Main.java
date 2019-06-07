import java.util.Scanner;//import required packages

class Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("Base Salary: "+basesalary);//write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("CSE Faculty: "+(basesalary + 3000));//write your CSE class statements
  }
}
class IT extends Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("IT Faculty: "+(basesalary + 5000));//write your IT class statements
  }
}
class ECE extends Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("ECE Faculty: "+(basesalary + 4500));//write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int basesalary = sc.nextInt();
    Faculty obj1 = new Faculty();
    obj1.salary(basesalary);
    CSE obj2 = new CSE();
    obj2.salary(basesalary);
    IT obj3 = new IT();
    obj3.salary(basesalary);
    ECE obj4 = new ECE();
    obj4.salary(basesalary);
    //implement your required concept here
  }
}