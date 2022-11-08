  import java.util.LinkedList;
  class Main {
  public static void main(String[] args){
    
    
    // create linkedlist
    LinkedList<String> Gamebag = new LinkedList<>();

    // add() method without the index parameter
    Gamebag.add("Tekken 7");
    Gamebag.add("Overwatch");
    Gamebag.add("Horizon Zero Dawn");
    Gamebag.add("Devil May cry");
    System.out.println("Game Library: " + Gamebag);

 // get the element from the linked list
   String str = Gamebag.get(1);
   System.out.print("Game selected: " + str);

    // add() method with the index parameter
   Gamebag.add(1, "PUBG");
   //Gamebag.add("Pokken Tournament");
   System.out.println("           ");
   System.out.println("Current Game Library: " + Gamebag);

    // change elements at index 3
    Gamebag.set(3, "Pokemon");
    System.out.println("Current Game Library: " + Gamebag);


    //Queue
    // add element at the beginning
    Gamebag.add("Red Alert");
    System.out.println("Installation queue: " + Gamebag);

    Gamebag.addFirst("Outlast");
    System.out.println("Installation queue: " + Gamebag);

    // add elements at the end
    Gamebag.addLast("Kirby");
    System.out.println("Instalaltion queue: " + Gamebag);

    // remove the first element
    Gamebag.removeFirst();
    System.out.println("Installation queue: " + Gamebag);

    // remove the last element
    Gamebag.removeLast();
    System.out.println("Installation queue: " + Gamebag);
    
    // remove the last element
    Gamebag.removeLast();
    System.out.println("Current Gamebag: " + Gamebag);
   
  }
}