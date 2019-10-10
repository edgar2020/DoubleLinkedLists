public class DoubLinkedListsDriver
{
    public static void main(String[] args)
    {
        IntLinkedList  list = new IntLinkedList();

        list.addANodeToTail(1);
        list.addANodeToTail(2);
        list.addANodeToTail(3);
        list.addANodeToTail(4);
        list.addANodeToTail(5);
        list.addANodeToTail(6);


        list.showList();
        list.deleteANodeFromEnd();
        System.out.println("Delete from end");
        list.showList();
        System.out.println("Reverse order");
        list.showRList();


    }//end of Main method
}//end of driver class
