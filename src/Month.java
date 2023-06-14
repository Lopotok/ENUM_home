import java.util.Random;

public enum Month {

    JANUARY("Január"),
    FEBRUARY("Február"),
    MARCH("Március"),
    APRIL("Április"),
    MAY("Május"),
    JUNE("Június"),
    JULY("Július"),
    AUGUST("Augusztus"),
    SEPTEMBER("Szeptember"),
    OCTOBER("Október"),
    NOVEMBER("November"),
    DECEMBER("December");

    public String hungarianName;

    private Month (String hungarianName){
        this.hungarianName=hungarianName;
    }

    public String getHungarianName() {
        return hungarianName;
    }
    public boolean summerMonth(){
        return this == JUNE || this == JULY || this == AUGUST;
    }
    public boolean autumnMonth(){
        return this == SEPTEMBER || this == OCTOBER || this ==NOVEMBER;
    }
    public boolean winterMonth (){
        return this == DECEMBER || this == JANUARY || this == FEBRUARY;
    }
    public boolean springMonth (){
        return this == MARCH || this == APRIL || this == MAY;
    }

    public int getMonthNumber(){
        return this.ordinal()+1;
    }
    public static Month randomMonth(){
        Random random = new Random();
        Month[] months= Month.values();
        return months[random.nextInt(months.length)];
    }
}


