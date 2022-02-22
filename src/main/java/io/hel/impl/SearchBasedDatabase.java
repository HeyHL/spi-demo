package io.hel.impl;

import io.hel.Search;

/**
 * helei
 * 2022/2/22 10:15
 * description:
 */
@SuppressWarnings("all")
public class SearchBasedDatabase implements Search {
    public String search(String keywords) {
        return "search from database, keywords:" + keywords;
    }
}
