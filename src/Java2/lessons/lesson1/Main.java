package Java2.lessons.lesson1;

public class Main {
    public static void main(String[] args) {
        JumpableRunnable[] members = {
                new Human(2, 2, "Dima"),
                new Human(1, 2, "Vera"),
                new Cat(3, 4, "Barsik"),
                new Cat(1, 1, "Luntic"),
                new Robot(0, 10, 10),
                new Robot(4,7,12)
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpableRunnable member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " прохордит " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошел всю дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}