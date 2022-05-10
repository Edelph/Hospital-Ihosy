package com.edelph;


import com.edelph.utils.Edate;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {

        Edate date = new Edate();
        date.setDate(new Date());

        System.out.println(date.getSQL_dateTime());
        // Secondes
        long second = 125553;

        // Convertir le nombre de secondes en minutes(Minute)
        long minute = TimeUnit.HOURS.convert(second, TimeUnit.SECONDS);
        System.out.println("Minute " + minute);
    }
}
