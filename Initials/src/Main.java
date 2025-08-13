import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    int size = 8;

    World.setVisible(true);// allows us to see the run
    World.setDelay(1);
    World.setSize(2*size-1, 2*size-1);
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    for (int i = size; i >0; i--){
        int k = size - i;
    Robot x1 = new Robot(1+k,size,North,1000);
    Robot x2 = new Robot(1+k,size,East,1000);
    Robot y1 = new Robot(2*i-1+k,size,South,1000);
    Robot y2 = new Robot(2*i-1+k, size,West,1000);
    for (int j = 0; j < i; j ++){
        x1.putBeeper();
        x2.putBeeper();
        y1.putBeeper();
        y2.putBeeper();
        x1.move();
        x1.turnLeft();
        x1.move();
        x2.move();
        x2.turnLeft();
        x2.move();
        y1.move();
        y1.turnLeft();
        y1.move();
        y2.move();
        y2.turnLeft();
        y2.move();

        //reset to direction
        y1.turnLeft();
        y1.turnLeft();
        y1.turnLeft();
        y2.turnLeft();
        y2.turnLeft();
        y2.turnLeft();
        x1.turnLeft();
        x1.turnLeft();
        x1.turnLeft();
        x2.turnLeft();
        x2.turnLeft();
        x2.turnLeft();

        //run away
        

    }
    }

		



}


  
  
}

