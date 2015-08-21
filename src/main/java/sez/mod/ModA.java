package sez.mod;

import java.util.ArrayList;

/**
 * Class provides sandbox to test different api accesses in JavaDocs.
 */
public class ModA {

    /**
     * Description of count field.
     * Some additional information of usage.
     */
    public int publicCount;

    /**
     * Protected field.
     */
    protected String protectedCount;

    /**
     * Private field.
     */
    private ArrayList privateCount;

    /**
     * @deprecated since NetCracker 9.0, replaced by {@link #publicCount}     *
     */
    public int deprecatedPublicCount;

}
