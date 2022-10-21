@SuppressWarnings(value="unused")
public class Reminder {

    Reminder(){
        System.out.println("Visitor Pattern Started!!");
        NodeVisitor nv = new ReminderVisitor();
    }
}
