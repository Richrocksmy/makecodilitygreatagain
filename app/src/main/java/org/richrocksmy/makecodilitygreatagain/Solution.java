package org.richrocksmy.makecodilitygreatagain;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int[][] A) {

        List<Integer> rowTotals = new ArrayList<>();
        List<Integer> columnTotals = new ArrayList<>();

        int columnTotal = 0;
        for(int i=0; i<A.length; i++) {

            int rowTotal = 0;

            for(int j=0; j<A[i].length; j++) {
                rowTotal += A[i][j];
            }

                        rowTotals.add(rowTotal);
//            columnTotals.add(columnTotal);
        }

        System.out.println("Row totals: " + rowTotals);
        System.out.println("Column totals: " + columnTotals);

        return 0;
    }
}
