package com.hackathon.going.search.response.naver;

import lombok.Getter;

import java.util.List;

@Getter
public class NaverSearchResponse {
    private String lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<Item> items;
}