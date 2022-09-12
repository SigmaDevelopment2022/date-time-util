import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        long nowMillis = DateTimeUtil.toMillis(now);
        LocalDateTime tomorrowMidnight = DateTimeUtil.getMidnight(now.plusDays(1));
        long tomorrowMidnightMillis = DateTimeUtil.toMillis(tomorrowMidnight);
        long remainingTimeUntilTomorrowMidnight = DateTimeUtil.getDifference(nowMillis, tomorrowMidnightMillis);

        System.out.println("now: " + now);
        System.out.println("tomorrow midnight: " + tomorrowMidnight);
        System.out.println("now millis: " + nowMillis);
        System.out.println("tomorrow midnight millis: " + tomorrowMidnightMillis);
        System.out.println("remaining time until tomorrow midnight: " + remainingTimeUntilTomorrowMidnight);
    }
}
