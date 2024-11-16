package ssdnumbers;

import java.util.NoSuchElementException;

public class SSDNumber {

    /********** Task 1 **********/

    public static boolean isSemiSelfDescriptive(String intAsString) {
        // TODO: Implement this method
        return false;
    }


    /********** Task 2 **********/

    /**
     * Obtain the largest SSDNumber (as a String) with {@code numDigits} digits that
     * contains the digit {@code mustContainDigit}.
     * @param numDigits the number of digits in the SSDNumber, {@code numDigits} > 0
     * @param mustContainDigit a digit that must be present in the number being generated, 0 <  {@code mustContainDigit} < 10
     * @return the largest SSDNumber (as a String) with {@code numDigits} digits
     *          that contains the digit {@code mustContainDigit}
     * @throws NoSuchElementException if no such SSDNumber exists
     */
    public static String getLargestSSDNumber(int numDigits, int mustContainDigit)
                                            throws NoSuchElementException {
        // TODO: Implement this method
        return null;
    }


    /********** Task 3 **********/

    /**
     * Obtain an iterator that iterates over all SSDNumbers of a given length
     * (specified by {@code numDigits}), starting with the smallest such
     * number and going up to the largest such number.
     *
     * @param numDigits the number of digits in the SSDNumbers we are iterating over,
     *                  {@code numDigits} > 0
     * @return an iterator that iterates over all SSDNumbers of a given length
     *      (specified by {@code numDigits}), starting with the smallest such
     *      number and going up to the largest such number.
     */
    public static SSDNumberIterator getSSDNumberIterator(int numDigits) {
        // TODO: Implement this method
        return null;
    }

}
