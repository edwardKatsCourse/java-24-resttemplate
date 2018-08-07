package com.company;

import java.util.List;

public class ItunesResponse {

    private Integer resultCount;
    private List<ResponseResult> results;

    public ItunesResponse() {
    }

    @Override
    public String toString() {
        return "ItunesResponse{" +
                "\nresultCount=" + resultCount +
                ", results=" + results +
                '}';
    }

    public ItunesResponse(Integer resultCount, List<ResponseResult> results) {
        this.resultCount = resultCount;
        this.results = results;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<ResponseResult> getResults() {
        return results;
    }

    public void setResults(List<ResponseResult> results) {
        this.results = results;
    }
}
