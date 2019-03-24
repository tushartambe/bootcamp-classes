package com.bootcamp.matrices;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Matrix {
    private List<List<Integer>> matrix;

    Matrix(List<List<Integer>> matrix) {
        this.matrix = matrix;
    }

    Matrix add(Matrix anotherMatrix) {
        List<List<Integer>> sum = new ArrayList<>();

        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> sumOfRow = new ArrayList<>();
            for (int entry = 0; entry < this.matrix.get(row).size(); entry++) {
                Integer entryInFirstMatrix = this.matrix.get(row).get(entry);
                Integer entryInSecondMatrix = anotherMatrix.matrix.get(row).get(entry);

                Integer addition = Operation.addition(entryInFirstMatrix, entryInSecondMatrix);
                sumOfRow.add(addition);
            }
            sum.add(sumOfRow);
        }
        return new Matrix(sum);
    }

    Matrix substract(Matrix anotherMatrix) {
        List<List<Integer>> substraction = new ArrayList<>();

        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> substractionOfRow = new ArrayList<>();
            for (int entry = 0; entry < this.matrix.get(row).size(); entry++) {
                Integer entryInFirstMatrix = this.matrix.get(row).get(entry);
                Integer entryInSecondMatrix = anotherMatrix.matrix.get(row).get(entry);

                Integer substractionOfEntries = Operation.substraction(entryInFirstMatrix, entryInSecondMatrix);
                substractionOfRow.add(substractionOfEntries);
            }
            substraction.add(substractionOfRow);
        }
        return new Matrix(substraction);
    }

    Matrix transpose() {
        List<List<Integer>> transpose = new ArrayList<>();

        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> transposeRow = new ArrayList<>();
            for (int entry = 0; entry < this.matrix.get(row).size(); entry++) {
                Integer rowEntry = this.matrix.get(entry).get(row);
                transposeRow.add(rowEntry);
            }
            transpose.add(transposeRow);
        }
        return new Matrix(transpose);
    }

    Matrix multiply(Matrix anotherMatrix) {
        List<List<Integer>> multiplication = new ArrayList<>();

        for (int row = 0; row < this.matrix.size(); row++) {
            ArrayList<Integer> multiplicationOfRow = new ArrayList<>();
            for (int anotherMatrixColumns = 0; anotherMatrixColumns < anotherMatrix.matrix.get(row).size(); anotherMatrixColumns++) {
                Integer result = 0;
                for (int anotherMatrixRows = 0; anotherMatrixRows < anotherMatrix.matrix.size(); anotherMatrixRows++) {
                    Integer thisMatrixEntry = this.matrix.get(row).get(anotherMatrixRows);
                    Integer anotherMatrixEntry = anotherMatrix.matrix.get(anotherMatrixRows).get(anotherMatrixColumns);
                    result += thisMatrixEntry * anotherMatrixEntry;
                }
                multiplicationOfRow.add(result);
            }
            multiplication.add(multiplicationOfRow);
        }
        return new Matrix(multiplication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return Objects.equals(matrix, matrix1.matrix);
    }
}
