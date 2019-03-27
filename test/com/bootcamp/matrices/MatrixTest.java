package com.bootcamp.matrices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    @BeforeEach
    void setUp() {

    }

    @Test
    void shouldAddTwoMatricesOfSameSize() {
        List<Integer> matrix1row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix1row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix1 = new Matrix(asList(matrix1row1, matrix1row2));

        List<Integer> matrix2row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix2row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix2 = new Matrix(asList(matrix2row1, matrix2row2));

        List<Integer> expectedRow1 = new ArrayList<>(asList(2, 4));
        List<Integer> expectedRow2 = new ArrayList<>(asList(6, 8));
        Matrix expected = new Matrix(asList(expectedRow1, expectedRow2));

        assertEquals(expected, matrix1.add(matrix2));
    }

    @Test
    void shouldSubstractTwoMatricesOfSameSize() {

        List<Integer> matrix1row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix1row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix1 = new Matrix(asList(matrix1row1, matrix1row2));

        List<Integer> matrix2row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix2row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix2 = new Matrix(asList(matrix2row1, matrix2row2));

        List<Integer> expectedRow1 = new ArrayList<>(asList(0, 0));
        List<Integer> expectedRow2 = new ArrayList<>(asList(0, 0));
        Matrix expected = new Matrix(asList(expectedRow1, expectedRow2));

        assertEquals(expected, matrix1.substract(matrix2));
    }

    @Test
    void shouldTransposeTheGivenMatrix() {

        List<Integer> matrix1row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix1row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix1 = new Matrix(asList(matrix1row1, matrix1row2));

        List<Integer> expectedRow1 = new ArrayList<>(asList(1, 3));
        List<Integer> expectedRow2 = new ArrayList<>(asList(2, 4));
        Matrix expected = new Matrix(asList(expectedRow1, expectedRow2));

        assertEquals(expected, matrix1.transpose());
    }

    @Test
    void shouldMultiplyTwoMatricesOfValidSizes() {

        List<Integer> matrix1row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix1row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix1 = new Matrix(asList(matrix1row1, matrix1row2));

        List<Integer> matrix2row1 = new ArrayList<>(asList(1, 2));
        List<Integer> matrix2row2 = new ArrayList<>(asList(3, 4));
        Matrix matrix2 = new Matrix(asList(matrix2row1, matrix2row2));

        List<Integer> expectedRow1 = new ArrayList<>(asList(7, 10));
        List<Integer> expectedRow2 = new ArrayList<>(asList(15, 22));
        Matrix expected = new Matrix(asList(expectedRow1, expectedRow2));

        assertEquals(expected, matrix1.multiply(matrix2));
    }

}