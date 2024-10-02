/*
 * *** NATE CALDERON / SECTION 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    // (A union B) = A + B - (A intersection B)
    // (A union B) - (A intersection B) = A + B (i.e elements only in A and elements only in B)
    // Create new set called intersection
    Set<Integer> intersection = new TreeSet<>(setA);
    
    //use retainAll to get all elements in (setA intersection setB)
    intersection.retainAll(setB);

    // add all elements in setB to setA -> (A union B)
    setA.addAll(setB);

    // (A union B) - (A intersection B)
    setA.removeAll(intersection);

    // Return setA, which is A + B, or the difference
    return setA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // Usage of Iterator to avoid ConcurrentModificationException
    Iterator<Integer> iterator = treeMap.keySet().iterator();

    // Iterate thru keys 
    while (iterator.hasNext()) {
      Integer key = iterator.next();
      
      // If key is even, remove the pair
      if (key % 2 == 0) {
        iterator.remove();
      }
    }
    
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // Use equals() method which checks both size of maps and if the maps contain same key-value pairs
    if (tree1.equals(tree2)) {
      return true;
    }

    return false;

  }

} // end treeProblems class
