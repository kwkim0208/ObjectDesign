package ch02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Ch02MainClass {
    public static void main(String[] args) {
        Movie avartar=new Movie(Duration.ofMinutes(120),Money.wons(10000),new AmountDiscountPolicy(Money.wons(800),new SequenceCondition(1),new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10,0),LocalTime.of(11,50),
                new PercentDiscountPolicy(DayOfWeek.THURSDAY,LocalTime.of(10,0),LocalTime.of(20,59))));
    }
}
