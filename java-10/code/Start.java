import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean( "captain", Player.class);
        context.registerBean("goal-keeper", Player.class);
        context.registerBean(Team.class);
        context.refresh();
        
        Player p = context.getBean("captain", Player.class);
        p.name = "David Beckham"; p.number = 7; p.salary = 47000.0;
        
        Player q = context.getBean("captain", Player.class);
        System.out.println( q.name );
    }
}
class Player {
    String name;
    double salary;
    int number;
}

class Team {
    String name;
    double score;
}
