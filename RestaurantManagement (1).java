import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.time.*;

class Welcome
{
  {
      System.out.println("**************************");
      System.out.println("*********RESTAURANT MANAGEMENT SYSTEM*******");
      System.out.println("**************************\n");
     
  }
}

class CustomerDetails //Encapculation 
{
  Scanner sc= new Scanner(System.in);
  static String customerName;
  static String mailID;
  static long mobile;
  
  void customerName()
  {
  System.out.println("Enter Customer Full Name: ");
  customerName = sc.nextLine();
  System.out.println("");
  }
  void ContactDetails()
  {
  System.out.println("Enter Customer email: ");
  mailID = sc.nextLine();
  System.out.println("");
  try{
  System.out.println("Enter Customer Mobile Number: ");
  mobile = sc.nextLong();
  System.out.println("");
  }
  catch(Exception e)
  {
      System.out.println("Enter valid mobile number");
  }
  }
  
  void display()//Abstract method
  { 
  }
}
class LinkListHetro extends CustomerDetails //Inhertence
{

  Node head;
  class Node // Implementation of Linked List (data structure)
  {
      float data;
      String name;
      Node next;
      
      Node(String s,float d)
      {
          data = d;
          name=s;
          next = null;
      }
  }
  void insertAtEnd(String s,float d)
  {
      Node n= new Node(s,d);
      Node curr = head;
      if(head==null)
      {
          head=n;
      }
      else
      {
          while(curr.next != null)
          {
              curr=curr.next;
          }
          curr.next=n;
      }
    }
  
static float pdata;
  static String pname;
  void position(int pos)
  {
  Node curr=head;
	if(pos==1)
	{
		pdata = curr.data;
              pname = curr.name;
	}
	else
      {
          int i=1;
          while(i<pos)
          {
              curr=curr.next;
		i++;
          }
          pdata = curr.data;
          pname = curr.name;
      }
  
  }

  float total;
  static ArrayList a = new ArrayList();// collections
  void returnedData()
  {
      a.add(pname+" "+pdata);// name= menu , data= price
         total = total+pdata;            //menu total 
  }
  void display()//Abstraction
  {
      System.out.println("\n");
      System.out.println("**********************");
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");  
      Date date = new Date();
      String strDate1= formatter.format(date);
      
      System.out.println("          Customer Name  : "+customerName);
      System.out.println("          Customer Email : "+mailID);
      System.out.println("          Mobile Number  : "+mobile+"\n");
      System.out.println("Menu List\n");
      System.out.println(a);
      System.out.println("\n");
      System.out.println("TOTAL AMOUNT PAID--RS: "+total+"\n");
      System.out.println("     "+strDate1);
      System.out.println(" ********************\n");
      
  }

void addProductMenu()
  {
      System.out.println("1.Non Pizza         Rs.250");
      System.out.println("2.Non Burger        Rs.150");
      System.out.println("3.Sandwich          Rs.100");
      System.out.println("4.Veg Pizza         Rs.200");
      System.out.println("5. Pasta            Rs.200");
      System.out.println("6.Maggie            Rs.100");
      System.out.println("7.Colddrinks        Rs.50");
      System.out.println("8.Cheese Pizza      Rs.150");
      System.out.println("9.FarmHouse Pizza   Rs.220");
      System.out.println("10.IceCream         Rs.100");
      System.out.println("11.Soda             Rs.20");
      System.out.println("12.Chocolava Cake   Rs.80");
      System.out.println("13.List Completed");
  }
}

class RestaurantManagement// main class
{
  public static void main(String args[])
  {
      
      LinkListHetro l = new LinkListHetro();
      l.insertAtEnd("Non Veg Pizza RS:",250.0F);
      l.insertAtEnd("Non Burger RS:",150.0F);
      l.insertAtEnd("Sandwich RS:",100.0F);
      l.insertAtEnd("Veg Pizza RS:",200.0F);
      l.insertAtEnd(" Pasta:",200.0F);
      l.insertAtEnd("MAGGIE RS:",50.0F);
      l.insertAtEnd("Colddrinks RS:",50.0F);
      l.insertAtEnd("Cheese Pizza RS:",150.0F);
      l.insertAtEnd("FarmHouse Pizza RS:",220.0F);
      l.insertAtEnd("IceCream RS:",100.0F);
      l.insertAtEnd("Soda RS:",20.0F);
      l.insertAtEnd("Chocolava Cake RS:",80.0F);
      
      LinkListHetro m = new LinkListHetro();
      
      Welcome M= new Welcome();
      Scanner sc= new Scanner(System.in);
      CustomerDetails cd = new CustomerDetails();
    

      String choice[]={"1.Enter Customer Name","2.Enter Contact Detail","3.Enter Menu","4.Generate Bill","5.Exit","Enter Your Choice :"};
      int c;
      do
      {
          for (String s:choice)//for each loop
            System.out.println(s);// for printing string array (choice)
          
            c=sc.nextInt();
              switch(c)
                  {
                      case 1:
                          cd.customerName();
                          break;
                      case 2:
                          cd.ContactDetails();
                          break;                        
                      case 3:
                          System.out.println("ENTER MENU: ");
                          l.addProductMenu();
                         int product;
                          boolean end = false;
                          
                              while(!end)
                              {
                                  System.out.println("ADD more menu or if done press 13: ");
                                  product=sc.nextInt();
                                  
                                  switch(product)
                                  {
                                      case 1:
                                          l.position(1);
                                          l.returnedData();
                                          break;
                                      case 2:
                                          l.position(2);
                                          l.returnedData();
                                          break;
                                      case 3:
                                          l.position(3);
                                          l.returnedData();   
                                          break;
                                      case 4:
                                          l.position(4);
                                          l.returnedData();
                                          break;
                                      case 5:
                                          l.position(5);
                                          l.returnedData();
                                          break;
                                      case 6:
                                          l.position(6);
                                          l.returnedData();
                                          break;
                                      case 7:
                                          l.position(7);
                                          l.returnedData();
                                          break;
                                      case 8:
                                          l.position(8);
                                          l.returnedData();
                                          break;
                                      case 9:
                                          l.position(9);
                                          l.returnedData();
                                          break;
                                      case 10:
                                          l.position(10);
                                          l.returnedData();  
                                      case 11:
                                          l.position(11);
                                          l.returnedData();
                                      case 12:
                                          l.position(12);
                                          l.returnedData();
                                          break;
                                      default:
                                          System.out.println("MENU COMPLETED !!!\n");
                                          end = true;
                                  }
                              } 
                          break;     
                      case 4:
                          l.display();  //Polymorphism  
                          break;
                      default:
                          System.out.println("THANK YOU FOR VISITING ..........");
                  }    
      }while(c != 5);
  }
}