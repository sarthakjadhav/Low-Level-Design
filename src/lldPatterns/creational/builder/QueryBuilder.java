package lldPatterns.creational.builder;

import java.util.Objects;

public class QueryBuilder {
    private String select;
    private String tableName;
    private String where;
    private String groupBy;

// methods
    public String getSelect() {
        return select;
    }

    public QueryBuilder select(String select) {
        this.select = select;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public QueryBuilder tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getWhere() {
        return where;
    }

    public QueryBuilder where(String where) {
        this.where = where;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public QueryBuilder groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public Query build(){
        if(Objects.isNull(this.select)){
            throw new IllegalArgumentException("Select clause cannot be null.");
        }
        if(Objects.isNull(this.tableName)){
            throw new IllegalArgumentException("tableName cannot be null.");
        }
        if(Objects.isNull(this.where)){
            throw new IllegalArgumentException("where clause  cannot be null.");
        }

        StringBuilder sb = new StringBuilder();
        String query = sb.append("Select " +this.select + " ")
                .append("\nfrom ")
                .append(this.tableName)
                .append(" \nwhere " + this.where)
                .toString();

        Query query1 = new Query();
        query1.setQuery(query);
        return query1;
    }
}
