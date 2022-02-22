package io.hel.impl;

import io.hel.Search;

/**
 * helei
 * 2022/2/22 10:14
 * description:
 */
@SuppressWarnings("all")
public class SearchBasedFile implements Search {
    public String search(String keywords) {
        return "search from file, keywords:" + keywords;
    }
}
