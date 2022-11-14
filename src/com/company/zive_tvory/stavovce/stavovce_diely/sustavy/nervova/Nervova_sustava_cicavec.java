package com.company.zive_tvory.stavovce.stavovce_diely.sustavy.nervova;

import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Nervova_sustava_stavovec_default;
import com.company.zive_tvory.stavovce.stavovce_diely.sustavy.Typ_sustavy;

public class Nervova_sustava_cicavec extends Nervova_sustava_stavovec_default {

    private CNS cns;
    private PNS pns;

    public Nervova_sustava_cicavec(Typ_sustavy typ_sustavy) {
        super(typ_sustavy);
    }
}
