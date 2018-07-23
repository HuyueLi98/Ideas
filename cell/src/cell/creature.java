package cell;


/**
 *
 * @author Huyue Li
 */


public class creature{
    protected int pos_x;
    protected int pos_y;
    
    protected int getx()
    {
        return this.pos_x;
    }
    protected int gety()
    {
        return this.pos_y;
    }
}
 class cell extends creature {
    //creator
     cell()
     {
         this.pos_x=0;
         this.pos_y=0;
         this.radius=1;
     }
     
     cell(int x,int y)
     {
         this.pos_x=x;
         this.pos_y=y;
         this.radius=1;
     }
    //genetic material
    private int radius;
    creature target;
    
    //organelles
    void autotracking()
    {
        
        distance_judge(target);
        
    }
   double distance_judge(creature o)
    {
        int x=pos_x-o.getx();
        int y=pos_y-o.gety();
        x=x*x;
        y=y*y;
        int dist_2=x+y;
        return Math.sqrt(dist_2);
    }
    //membrane
    void setradius(int rad)
    {
        this.radius=rad;
    }

    
}
