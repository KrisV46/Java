import java.util.Date;
public class Main {
    public static void main(String[] args)
    {
        Date d= new Date();
        Penguin m= new Penguin("Ricko",d,Sex.MALE,25,5);
        if (m instanceof IFlyable)
        {
            ((IFlyable)m).Fly();
        }

        else {
            m.Move();
        }
    }
}
