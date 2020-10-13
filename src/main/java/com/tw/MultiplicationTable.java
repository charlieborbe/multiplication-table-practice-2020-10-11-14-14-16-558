package com.tw;

public class MultiplicationTable {
    public String printMultiplicationTable(int startNumber, int endNumber) {
        boolean isValid = isValidInputNumber(startNumber, endNumber);
        String multiplicationTable = generateMultiplicationTable(startNumber, endNumber);

        return isValid ? multiplicationTable : null;
    }

    private String generateMultiplicationTable(int startNumber, int endNumber) {
        if(isValidInputNumber(startNumber,endNumber)) {
            String multiplicationTable = new String();
            for (int counter = startNumber; counter <= endNumber; counter++) {
                for (int multiplyCount = startNumber; multiplyCount <= counter; multiplyCount++) {
                    multiplicationTable += multiplyCount + ("*") + (counter) + ("=") + (counter * multiplyCount);
                    if (counter == multiplyCount) {
                        multiplicationTable += "";
                    } else {
                        multiplicationTable += "  ";
                    }
                }
                multiplicationTable += "\r\n";
            }
            return multiplicationTable.trim();
        }
        return null;
    }


    private boolean isValidInputNumber(int startNumber, int endNumber) {
        boolean isStartNumberInRange = isInputNumberInRange(startNumber, endNumber);
        boolean isEndNumberBiggerThanStartNumber = isLessThanOrEqualToEndNumber(startNumber, endNumber);
        return isStartNumberInRange && isEndNumberBiggerThanStartNumber;
    }

    private boolean isLessThanOrEqualToEndNumber(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }

    private boolean isInputNumberInRange(int startNumber, int endNumber) {
        boolean result = startNumber <= 100 && startNumber >= 1 && endNumber <= 100 && endNumber >= 1;
        return result;
    }
}
