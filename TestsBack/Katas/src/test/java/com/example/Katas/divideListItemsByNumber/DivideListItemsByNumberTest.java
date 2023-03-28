package com.example.Katas.divideListItemsByNumber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DivideListItemsByNumberTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void DivideListItemsByNumberReturnsListWithOnlyPairNumbers() {
    //GIVEN
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer> result = new ArrayList<Integer>(List.of(2,4,6,8,10));
    //WHEN
        var sut = DivideListItemsByNumber.listItemIsDivisibleByNumber(list,2);
    //THEN
        //assertArrayEquals(result.toArray(), sut.toArray());
        assertEquals(result,sut);
    }

    @Test
    void DivideListItemsByNumberReturnsListWithNumbersDivisibleBy3() {
        //GIVEN
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer> result = new ArrayList<Integer>(List.of(3,6,9));
        //WHEN
        var sut = DivideListItemsByNumber.listItemIsDivisibleByNumber(list,3);
        //THEN
        assertEquals(result,sut);
    }
}