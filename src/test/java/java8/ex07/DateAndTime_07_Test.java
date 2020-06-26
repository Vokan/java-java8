package java8.ex07;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

    @Test
    public void test_date_to_localdate() throws Exception {

        // TODO Créer une date Java 1 (12/02/2017)
    	Calendar cal = Calendar.getInstance();
    	cal.set(117, 3, 12);
    	Date date = cal.getTime();
    	
    	SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	formattage.format(date);
        
    	// TODO transformer la date en Instant
    	
        // TODO transformer la date en LocalDate

        LocalDate result = null;

        // TODO valoriser les différentes variables afin de rendre le test passant

        assertThat(result.getYear(), is(2017));
        assertThat(result.getMonth(), is(Month.FEBRUARY));
        assertThat(result.getDayOfMonth(), is(12));

    }
}
