package timeUtils.Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import timeUtils.TimeUtils;


class Tests {

		TimeUtils time = new TimeUtils();
		
		@ParameterizedTest(name = "Sekunnit {0} ajaksi {1}")
		@CsvSource({"3600, 1:00:00", "1800, 0:30:00", "36000, 10:00:00", "0, 0:00:00", "-1, -1", "99999999, 27777:46:39"}) 
		void testSecToTime(int luku, String oletus) {
			String virhe = "Luku " + luku + " muutettu v‰‰rin ajaksi.";
			String actualValue = time.secToTime(luku);
			assertEquals(oletus, actualValue, virhe);
		}
}
