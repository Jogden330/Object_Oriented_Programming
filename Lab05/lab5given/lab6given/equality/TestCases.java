import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalTime;
import java.util.List;

import org.junit.Test;

public class TestCases
{

   @Test
   public void testExercise1()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));
   }

   @Test
   public void testExercise2()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(2, 0));

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise3()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise4()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
              LocalTime.of(9, 10), LocalTime.of(10, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise5()
   {
   final CourseSection one = new CourseSection(null, "203", 35,
           LocalTime.of(9, 40), LocalTime.of(11, 0));
   final CourseSection two = new CourseSection( null, "203", 35,
           LocalTime.of(9, 40), LocalTime.of(11, 0));

   assertTrue(one.equals(two));
   assertTrue(two.equals(one));
}


   @Test
   public void testExercise6()
   {
      final CourseSection one = new CourseSection(null, "203", 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(1, 10), LocalTime.of(10, 0));

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise7()
   {
      final CourseSection one = new CourseSection("CSC", null, 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", null, 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise8()
   {
      final CourseSection one = new CourseSection("CSC", null, 35,
              LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
              LocalTime.of(9, 10), LocalTime.of(10, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise9()
   {

      Student one, two;

      one = new Student("Workman", "Julie", 43, null);
      two = new Student("Workman", "Julie", 43, null);

      assertTrue(one.equals(two));
      assertTrue(one.equals(two));
   }

   @Test
   public void testExercise10()
   {

      Student one, two;

      one = new Student("Workman", "Julie", 43, null);
      two = new Student("Workman", "Julie", 43, null);

      assertEquals(one.hashCode(), two.hashCode());
   }
   @Test
   public void testExercise11()
   {
      Student one, two;

      one = new Student(null, null, 43, null);
      two = new Student(null, null, 43, null);

      assertTrue(one.equals(two));
      assertTrue(one.equals(two));
   }

   @Test
   public void testExercise12()
   {
      Student one, two;

      one = new Student(null, null, 43, null);
      two = new Student(null, null, 43, null);

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise13()
   {

      Student one, two;

      one = new Student("Workman", "Julie", 43, null);
      two = new Student("Workman", null, 43, null);

      assertFalse(one.equals(two));
      assertFalse(one.equals(two));
   }

   @Test
   public void testExercise14()
   {

      Student one, two;

      one = new Student("Workman", "Julie", 43, null);
      two = new Student("Workman", null, 43, null);

      assertNotEquals(one.hashCode(), two.hashCode());
   }
   @Test
   public void testExercise15()
   {
      Student one, two;

      one = new Student("cats", null, 43, null);
      two = new Student(null, null, 43, null);

      assertFalse(one.equals(two));
      assertFalse(one.equals(two));
   }
   @Test
   public void testExercise16()
   {
      Student one, two;

      one = new Student("cats", null, 43, null);
      two = new Student(null, null, 43, null);

      assertNotEquals(one.hashCode(), two.hashCode());
   }

}
