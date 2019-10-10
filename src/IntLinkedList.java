public class IntLinkedList
{
    //variables
    private Node head;
    private Node tail;
    private Node current;
    private Node previous;

    //Constructor
    public IntLinkedList()
    {
        head = null;
        tail = null;
        current=head;
        previous=head;
    }//end head constructor

    public void addANodeToStart(int addData)
    {
        start();
        head = new Node(addData, head);
        if(current!=null)
        {
            current.pLink=head;
        } else {
            tail=head;
        }
    }

    public void addANodeToTail(int addData)
    {
        end();
        tail = new Node(tail, addData);
        if(current!=null)
        {
            current.link=tail;
        } else {
            head=tail;
        }
    }

     //delete
    public void deleteANodeFromStart()
    {
        if(head!=null)
        {
            head=head.link;
        }//end of if
        else
        {
            System.out.println("Nothing to delete");
        }//end fo else
    }//end of deleteANodeFromStart

    public void deleteANodeFromEnd()
    {
        if(tail!=null)
        {
            tail=tail.pLink;
            tail.link=null;
        }//end of if
        else
        {
            System.out.println("Nothing to delete");
        }//end fo else
    }//end of deleteANodeFromEnd

    //length
    public int length()
    {
        int count=0;
        Node position = head;
        while (position!=null)
        {
            count++;
            position=position.link;
        }//end of while loop
        return count;
    }//end of method null
    /*Methods Relating to iteration*/
    public void goToNext()
    {
        if(current!=null)
        {
            previous=current;
            current=current.link;
        }//end of if
        else if(head!=null)
        {
            System.out.println("Iterations reached end of line");
        }//end of else if
        else
        {
            System.out.println("You can't iterate an empty list");
            System.exit(0);
        }//end of else
    }//end of method goToNext

    public void start()
    {
        current=head;
        previous = null;
    }//end of method resetIteration
    public void end()
    {
        current=tail;
        previous = null;
    }//end of method resetIteration

    //precaution: negative one is not a viable datum
    public int getDataAtNode()
    {
        int result = -1;
        if(current!=null)
            result=current.data;
        else
            System.out.println("YOu can't get blood from a turnip");
        return result;
    }//end of method resetIteration
    public boolean hasNext()
    {
        if(current!=null)
            return true;
        return false;

    }//end of has Next
    //setData



    public void showList()
    {
        Node position = head;
        while(position != null)
        {
            System.out.println(position.data);
            position = position.link;
        }
    }
    public void showRList()
    {
        Node position = tail;
        while(position != null)
        {
            System.out.println(position.data);
            position = position.pLink;
        }
    }
    private class Node
    {
        //instance variables
        private int data;
        private Node link;
        private Node pLink;
        //constructor
        private Node(int data, Node link)
        {
            this.data=data;
            this.link=link;
            this.pLink=null;

        }//end of Node Constructor
        private Node(Node pLink, int data)
        {
            this.data=data;
            this.pLink=pLink;
            this.link=null;
        }//end of Node Constructor

        //getters & setters

        @Override
        public String toString()
        {
            return "Node{" +
                    "data=" + data +
                    ", link=" + link +
                    '}';
        }
    }//end Class Node

}//end of InLinkedClass