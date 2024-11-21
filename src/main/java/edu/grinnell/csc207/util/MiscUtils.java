package edu.grinnell.csc207.util;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;

/**
 * Some utilities for working with arrays and iterators.
 */
public class MiscUtils {
  // +---------------+-----------------------------------------------
  // | Static fields |
  // +---------------+

  /**
   * A handy, dandy random number generator.
   */
  private static Random rand = new Random();

  // +----------------+----------------------------------------------
  // | Static methods |
  // +----------------+

  /**
   * Randomly permute an array.
   *
   * @param <T>
   *   The type of values in the array.
   *
   * @param values
   *   The array we are permuting.
   */
  public static <T> void randomlyPermute(T[] values) {
    for (int i = 0; i < values.length; i++) {
      MiscUtils.swap(values, i, i + rand.nextInt(values.length - i));
    } // for
  } // randomlyPermute(T[])

  /**
   * Randomly permute an array of integers.
   *
   * @param values
   *   The array we are permuting.
   */
  public static void randomlyPermute(int[] values) {
    for (int i = 0; i < values.length; i++) {
      MiscUtils.swap(values, i, i + rand.nextInt(values.length - i));
    } // for
  } // randomlyPermute

  /**
   * Swap two objects in an array.
   *
   * @param <T>
   *   The type of values in the array.
   *
   * @param values
   *   The array.
   * @param i
   *   The index of the first element.
   * @param j
   *   The index of the second element.
   */
  public static <T> void swap(T[] values, int i, int j) {
    if (i == j) {
      return;
    } // if
    T temp = values[i];
    values[i] = values[j];
    values[j] = temp;
  } // swap

  /**
   * Swap two ints in an array.
   *
   * @param values
   *   The array.
   * @param i
   *   The index of the first element.
   * @param j
   *   The index of the second element.
   */
  public static void swap(int[] values, int i, int j) {
    if (i == j) {
      return;
    } // if
    int temp = values[i];
    values[i] = values[j];
    values[j] = temp;
  } // swap

  /**
   * Make a new iterator that works just like the given iterator, except that
   * the given function is applied to the result of next.
   *
   * @param <T>
   *   The type of values returned by the original iterator.
   * @param <U>
   *   The type of values returned by the new iterator.
   *
   * @param iterator
   *   The iterator to transform.
   * @param fun
   *   The function to apply to each element.
   *
   * @return the new iterator.
   */
  public static <T, U> Iterator<U> transform(Iterator<T> iterator,
      Function<? super T, ? extends U> fun) {
    return new Iterator<U>() {
      public boolean hasNext() {
        return iterator.hasNext();
      } // hasNext()

      public U next() {
        return fun.apply(iterator.next());
      } // next()

      public void remove() {
        iterator.remove();
      } // remove()
    }; // new Iterator
  } // transform(Iterator, Function)
} // class MiscUtils
