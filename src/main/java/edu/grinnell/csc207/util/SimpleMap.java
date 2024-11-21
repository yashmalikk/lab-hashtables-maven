package edu.grinnell.csc207.util;

import java.util.Iterator;
import java.util.function.BiConsumer;

/**
 * A simple version of the Map interface (more or less).
 *
 * @author Samuel A. Rebelsky
 *
 * @param <K>
 *   The type for keys.
 * @param <V>
 *   The type for values.
 */
public interface SimpleMap<K, V> extends Iterable<Pair<K, V>> {
  /**
   * Set the value associated with key.
   *
   * @param key
   *   The key to set.
   * @param value
   *   The value to set.
   *
   * @return the previous value associated with key (or null, if there's no
   *         such value)
   *
   * @throws NullPointerException if the key is null.
   */
  public V set(K key, V value);

  /**
   * Get the value associated with key.
   *
   * @param key
   *   The key to search for.
   *
   * @return the corresponding value.
   *
   * @throws IndexOutOfBoundsException if the key is not in the map.
   * @throws NullPointerException if the key is null.
   */
  public V get(K key);

  /**
   * Determine how many values are in the map.
   *
   * @return the number of key/value pairs in the dictionary.
   */
  public int size();

  /**
   * Determine if a key appears in the table.
   *
   * @param key
   *   The key to look for.
   *
   * @return true if the key is in the table and false otherwise.
   */
  public boolean containsKey(K key);

  /**
   * Remove the value with the given key.
   *
   * @param key
   *   The key of the key/value pair.
   *
   * @return
   *   The corresponding value (or null, if there is no associated value).
   *
   * @throws NullPointerException if the key is null.
   */
  public V remove(K key);

  /**
   * Get an iterator for all of the keys in the map.
   *
   * @return
   *   An iterator for the keys.
   */
  public Iterator<K> keys();

  /**
   * Get an iterator for all of the values in the map.
   *
   * @return an iterator for the values.
   */
  public Iterator<V> values();

  /**
   * Apply a function to each key/value pair.
   *
   * @param action
   *   The function to apply. Takes a key and a value as parameters.
   */
  public void forEach(BiConsumer<? super K, ? super V> action);

} // SimpleMap
