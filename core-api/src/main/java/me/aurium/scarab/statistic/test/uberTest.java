package me.aurium.scarab.statistic.test;

import me.aurium.scarab.statistic.AdditionStatFunction;
import me.aurium.scarab.statistic.FacetMap;

public class uberTest {

    private FacetMap<SwordFacet> map;

    public void shitta() {
        map.register(SwordFacet.DAMAGE,new AdditionStatFunction(1));
    }

}
