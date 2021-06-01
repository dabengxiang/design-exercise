package com.yamap.chain.service;

import com.yamap.chain.FilterChain;
import com.yamap.chain.PreparationList;

/**
 * @author yicong
 * @date 2021-06-01 15:52
 */
public class StudyTest {

    public static void main(String[] args) {
        PreparationList preparationList = new PreparationList();
        preparationList.setHaveBreakfast(true);
        preparationList.setWashFace(true);
        preparationList.setWashHair(true);
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new WashFacePrepareFilter());
        filterChain.addFilter(new WashHairPrepareFilter());
        filterChain.addFilter(new HaveBreakfastPrepareFilter());
        filterChain.doFilter(preparationList,filterChain);
    }
}
