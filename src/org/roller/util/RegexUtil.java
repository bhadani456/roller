/*
 * Created on Nov 8, 2003
 *
 */
package org.roller.util;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    
    /**
     * Return the specified match "groups" from the pattern.
     * For each group matched a String will be entered in the ArrayList.
     * 
     * @param pattern The Pattern to use.
     * @param match The String to match against.
     * @param group The group number to return in case of a match.
     * @return
     */
    public static ArrayList getMatches(Pattern pattern, String match, int group)
    {
        ArrayList matches = new ArrayList();
        Matcher matcher = pattern.matcher(match);
        while (matcher.find()) 
        {
            matches.add( matcher.group(group) );
        }
        return matches;
    }