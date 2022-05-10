package test;

import com.edelph.models.ResultatSerologiques;
import com.edelph.utils.Edate;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

   @org.junit.Test
    public void Serologique(){
       ResultatSerologiques rs = new ResultatSerologiques();
       assertFalse(rs.getSyphilis());
   }
   @org.junit.Test
    public void serologiqueModified(){
       ResultatSerologiques rs = new ResultatSerologiques();
       rs.setPalu(true);
       System.out.println(rs.getPalu());
       assertTrue(rs.getPalu());
   }
   @org.junit.Test
   public void testDate(){
      Edate date = new Edate();
      date.setDate(new Date());

      Edate date2 = new Edate();
      date2.setDate("2022-05-10 23:00:20");

      System.out.println(date.getSQL_dateTime());
      System.out.println(date2.getSQL_dateTime());

   }

}
