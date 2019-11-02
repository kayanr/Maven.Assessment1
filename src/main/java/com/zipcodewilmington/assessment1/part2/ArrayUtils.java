package com.zipcodewilmington.assessment1.part2;
import java.util.*;
/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;

        for(int i = 0; i < objectArray.length; i++) {
            if(objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int count = 0;
        Object[] keptItems = new Object[objectArray.length];
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] != objectToRemove){
                keptItems[i - count] = objectArray[i];
            }
            else{
                count++;
            }

        }
        Object[] result = new Integer[objectArray.length - count];

        for(int j = 0; j < result.length; j++){
            result[j] = keptItems[j];
        }

        return result;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer indexOfCommon = 0;
        for (int i = 1; i < objectArray.length; i++) {
            if(getNumberOfOccurrences(objectArray, objectArray[indexOfCommon]) < getNumberOfOccurrences(objectArray, objectArray[i])) {
                indexOfCommon = i;
            }
        }
        return objectArray[indexOfCommon];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer indexOfCommon = 0;
        for (int i = 1; i < objectArray.length; i++) {
            if(getNumberOfOccurrences(objectArray, objectArray[indexOfCommon]) > getNumberOfOccurrences(objectArray, objectArray[i])) {
                indexOfCommon = i;
            }
        }
        return objectArray[indexOfCommon];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] result = new Integer[objectArray.length + objectArrayToAdd.length];
        for(int i = 0; i < objectArray.length; i++){
            result[i] = (Integer)objectArray[i];
        }
        for(int i = 0; i < objectArrayToAdd.length; i++){
            result[objectArray.length + i] = (Integer)objectArrayToAdd[i];
        }
        return result;
    }
}
