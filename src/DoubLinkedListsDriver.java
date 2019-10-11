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

        list.addANodeToStart(0);
        list.addANodeToStart(-1);

        System.out.println("Original List");
        list.showList();
        list.deleteANodeFromEnd();
        System.out.println("Delete from end(Tail)");
        list.showList();
        list.showRList();
        System.out.println("Reverse order");


    }//end of Main method
}//end of driver class
