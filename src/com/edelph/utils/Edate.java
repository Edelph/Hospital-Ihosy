package com.edelph.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Edate {
    private Calendar calendar;
    private Locale locale = Locale.FRENCH;
    private Date date;
    private HashMap<String,String> pattern ;
    private HashMap<Integer,String> andro ;
    private HashMap<Integer,String> volana;


    public Edate(){
        this.__setAndro();
        this.__setPatterDate();
        this.__setVolana();
        this.calendar = Calendar.getInstance();
    }

    public String getMonth(){
        return this.getdate("MM");
    }
    public String getFullMonth(){return this.getdate("MMM");}
    public String getVolana(){
        return this.volana.get(Integer.parseInt(this.getMonth()));
    }
    public String getYear(){
        return this.getdate("yyyy");
    }
    public String getDay(){
       return this.getdate("dd");
    }
    public String getFullDay(){return this.getdate("EEEE");}
    public String getFullDate(){
        return this.getdate("dd MMM yyyy");
    }
    public String getFullTime(){
        return this.getdate("HH:mm:ss");
    }
    public String getSQL_dateTime(){
        return this.getdate("yyyy-MM-dd HH:mm:ss");
    }

    public String getSQL_date(){
        return this.getdate("yyyy-MM-dd");
    }

    public String getdate(String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, this.locale);
        return simpleDateFormat.format(this.date);
    }

    public String getdate(){
        return this.getdate("dd-MM-yyyy");
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public void setDate(String date, String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, this.locale);
        try {
            this.date = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void setDate(String date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.getStringFormat(date), this.locale);
        try {
            this.date = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private String getStringFormat(String date){
        for (String dateFormat:this.pattern.keySet()) {
            Pattern pattern = Pattern.compile(this.pattern.get(dateFormat));
            Matcher matcher = pattern.matcher(date);
            if (matcher.find()) return dateFormat;
        }
        return "";
    }
    private  void __setPatterDate(){
        this.pattern = new HashMap<String, String>();
        this.pattern.put("yyyy-MM-dd","\\d{4}-\\d{1,2}-\\d{1,2}");
        this.pattern.put("yyyy/MM/dd","\\d{4}/\\d{1,2}/\\d{1,2}");
        this.pattern.put("dd-MM-yyyy","\\d{1,2}-\\d{1,2}-\\d{4}");
        this.pattern.put("dd/MM/yyyy","\\d{1,2}/\\d{1,2}/\\d{4}");
        this.pattern.put("yyyy-MM-dd HH:mm:ss","\\d{4}-\\d{1,2}-\\d{1,2}\\s\\d{1,2}:\\d{1,2}:\\d{1,2}");
    }

    private void __setAndro(){
        this.andro = new HashMap<Integer, String>();
        this.andro.put(1,"Alatsinainy");
        this.andro.put(2,"Talata");
        this.andro.put(3,"Alarobia");
        this.andro.put(4,"Alakamisy");
        this.andro.put(5,"Zoma");
        this.andro.put(6,"Sabotsy");
        this.andro.put(7,"Alahady");
    }
    private void __setVolana(){
        this.volana = new HashMap<Integer, String>();
        this.volana.put(1,"Janohary");
        this.volana.put(2,"Febroary");
        this.volana.put(3,"Martsa");
        this.volana.put(4,"Aprily");
        this.volana.put(5,"May");
        this.volana.put(6,"Jiona");
        this.volana.put(7,"Jolay");
        this.volana.put(8,"Aogositra");
        this.volana.put(9,"Septambra");
        this.volana.put(10,"Oktobra");
        this.volana.put(11,"Novambra");
        this.volana.put(12,"desambra");
    }
}
