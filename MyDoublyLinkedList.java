package stark;
import java.util.Scanner;

class Node2
{
    int data;
    Node2 next;
    Node2 previous;

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}


public class MyDoublyLinkedList {
    Node2 head;
    Scanner sc = new Scanner(System.in);
    public MyDoublyLinkedList() {
        this.head = null;
    }

    public void insertAtLast(Node2 newnode)
    {
        if(head==null)
        {
            head = newnode;
            System.out.println("Node Inserted.");
        }
        else
        {
            Node2 temp = head;
            while (temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode; }
    }

    public void deleteAtBeginning()
    {
        if(head == null)
        {
            System.out.println("No node present to delete.");
        }
        else
        {
            System.out.println(head.data+" deleted.");
            head = head.next;
        }
    }

    public void deleteAtLast()
    {
        if(head == null)
        {
            System.out.println("No node present to delete.");
        }
        else
        {
            Node2 temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            System.out.println(temp.next.data+" deleted.");
            temp.next = null;
        }
    }
    public void forwardTraverse()
    {
        if(head == null)
        {
            System.out.println("Empty Link List.");
        }
        else
        {
            Node2 temp = head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void reverseTraverse()
    {
        if(head == null)
        {
            System.out.println("Empty Link List.");
        }
        else
        {
            Node2 temp = head;
            while(temp!=null)
            {
                if(temp.next==null)
                {
                    while (temp!=null)
                    {
                        System.out.println(temp.data);
                        temp = temp.previous;
                    }
                    System.out.println();
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void search()
    {
        if(head == null)
        {
            System.out.println("Empty Link List.");
        }
        else
        {
            System.out.println("Enter the data you want to search: ");
            int a = sc.nextInt();
            int c=0;
            Node2 temp = head;
            while(temp!=null)
            {
                if(temp.data == a)
                {
                    c=1;
                    break;
                }
                temp = temp.next;
            }
            if(c==1)
            {
                System.out.println("Data found.");
            }
            else
            {
                System.out.println("No data found.");
            }
        }
    }
}

class MyDoublyLinkListMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDoublyLinkedList obj2 = new MyDoublyLinkedList();
        while(true)
        {
            System.out.println("Enter 1 to insert node: ");
            System.out.println("Enter 2 to delete at beginning position: ");
            System.out.println("Enter 3 to delete at last position: ");
            System.out.println("Enter 4 to forward traverse the link list: ");
            System.out.println("Enter 5 to reverse traverse the link list: ");
            System.out.println("Enter 6 to search a data: ");
            System.out.println("Enter 7 to exit: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the data: ");
                    int r = sc.nextInt();
                    Node2 n2 = new Node2(r);
                    obj2.insertAtLast(n2);
                    break;
                case 2:
                    obj2.deleteAtBeginning();
                    break;
                case 3:
                    obj2.deleteAtLast();
                    break;
                case 4:
                    obj2.forwardTraverse();
                    break;
                case 5:
                    obj2.reverseTraverse();
                    break;
                case 6:
                    obj2.search();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct option.");
            }
        }
    }
}
