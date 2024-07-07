package org.opensearch.data.example.model.request;

import java.util.ArrayList;

public class Request {
    public String expression;
    public int resultSetLimit;
    public String filterExpression;
    public boolean includePayload;
    public ArrayList<SortBy> sortBy;
    public ArrayList<String> fields;
    public String dapPolicy;
}
