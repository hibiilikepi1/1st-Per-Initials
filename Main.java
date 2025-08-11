import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,1,North,1000);

		

    for(int i = 0; i <6; i++){
    r.putBeeper();
    r.move();// move one step in the direction it is facing\
}

    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.putBeeper();

    for(int i = 0; i <3; i++){
    r.move();// move one step in the direction it is facing\
    r.putBeeper();
}
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    for(int i = 0; i <3; i++){
    r.move();// move one step in the direction it is facing\
    r.putBeeper();
}
r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    for(int i = 0; i <2; i++){
    r.move();// move one step in the direction it is facing\
    r.putBeeper();
}


}


  
  
}


