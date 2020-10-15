package ch02;

import java.time.LocalDateTime;

public class Screening {{}
    private Movie movie;
    private int sequence;
    private LocalDateTime wheScreened;
    public Screening(Movie movie,int sequence,LocalDateTime wheScreened){
        this.movie=movie;
        this.sequence=sequence;
        this.wheScreened=wheScreened;
    }
    public LocalDateTime getStartTime(){
        return wheScreened;
    }
    public boolean isSequence(int sequence){
        return this.sequence==sequence;
    }
    public Money getMovieFee(){
        return movie.getFee();
    }
    public Reservation reserve(Customer customer,int audienceCount){
        return new Reservation(customer,this,caculateFee(audienceCount),audienceCount);
    }

    private Money caculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

}
