import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(1);
    World.setSize(11, 12);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    
    Robot r = new Robot(2,1,North,1000);
    Robot y = new Robot(2,11,North,1000);

		

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
r.turnLeft();
r.move();
r.putBeeper();
r.move();
r.turnLeft();
r.move();
r.putBeeper();
r.move();
r.turnLeft();
r.turnLeft();
r.turnLeft();
r.move();
r.putBeeper();
r.turnLeft();

//now for the x
r.move();
r.move();
r.move();

r.putBeeper();
r.move();
r.turnLeft();
r.move();
r.putBeeper();

r.move();
r.move();
r.putBeeper();
r.move();
r.turnLeft();
r.move();
r.putBeeper();


y.putBeeper();
y.move();
y.turnLeft();
y.move();
y.putBeeper();
y.move();
y.turnLeft();
y.turnLeft();
y.turnLeft();
y.move();
y.putBeeper();

y.move();
y.turnLeft();
y.turnLeft();
y.turnLeft();
y.move();
y.putBeeper();
y.move();
y.turnLeft();
y.move();
y.putBeeper();
y.move();
r.move();


}


  
  
}

