public class MainLinkedList {
    public static void main(String[] args) {
        Linkedlist linkedlist=new Linkedlist();

        linkedlist.InsertFirst("three");
        linkedlist.InsertFirst("two");
        linkedlist.InsertFirst("one");
        linkedlist.InsertLast("last");
        
        linkedlist.displaylist();

        linkedlist.insertAt("New",4);
        linkedlist.displaylist();
    }
}

 class Link{
    public String data;
    public Link next;

    public Link(String data){
        this.data=data;
        this.next=null;
    }
}

class Linkedlist{
    private Link first;
    
    
    public Linkedlist(){
        this.first=null;
        
    }
    

    public void InsertFirst(String data){
        Link newLink=new Link(data);
        newLink.next=first;
        first=newLink;
        

    }

    public void InsertLast(String data){
        Link newLink=new Link(data);
        if(first==null){
            first=newLink;
            return;
        }
        Link current=first;
        while(current.next != null){
            current=current.next;
            
        }
        current.next=newLink;

    }
    public void displaylist(){
        System.out.println("Linked List:");
        Link current = first;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public void deleteFirst(){
        first=first.next;
    }

    public void deleteLast(){
        if(first==null || first.next==null){
            return;
        }
        Link previous =null;
        Link current=first;
        while(current.next!=null){
            previous=current;
            current=previous.next;
        }
        previous.next=null;
    }

    public void deleteAt(int position){
        if (position<=0 || first==null){
            return;
        }
        if(position==1){
            first=first.next;
            return;
        }
        Link previous=null;
        Link current=first;
        int count=1;
        while(current!=null && count<position){
            previous=current;
            current=current.next;
            count++;
        }
        if(current!=null){
            previous.next=current.next;
        }
        
    }
    public void insertAt(String data,int position){
        System.out.println("after adding at position " + position + " ,new linked list:");
        Link newlink=new Link(data);
        if(first==null || first.next==null){
            return;
        }
        Link previous=null;
        Link current=first;
        int count=1;
        while(current.next!=null && count<position){
            previous=current;
            current=current.next;
            count++;
        }
        if(current!=null){
            previous.next=newlink;
            newlink.next=current;
        }
    }

}