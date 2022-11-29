package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if(isValid(start, end)){
            return generateTable(start, end);
        }
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number > 0 && number < 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String result = "";
        for(int i = start; i <= end ;i++){
            if (i == end){
                result += generateLine(start, i);
            }
            else {
                result += generateLine(start, i) + System.lineSeparator();
            }
        }

        return result;
    }

    public String generateLine(int start, int row) {
        String line = "";
        for (int i = start; i <= row; i++){
            line += generateSingleExpression(i, row)+"  ";
        }
        return line.substring(0,line.length()-2);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        String temp = multiplicand+"*"+multiplier+"="+(multiplicand*multiplier);
        return temp;
    }
}
