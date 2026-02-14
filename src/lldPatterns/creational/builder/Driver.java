package lldPatterns.creational.builder;

public class Driver {
    public static void main(String[] args){
        Query query = new Query();

        // 1 : any validation cant be put like table name not given
        query.setSelect("Select x,y,z");
        query.setWhere("where x=10");

        // 2 : lot of hard coding, problem for complex problems
        query.setQuery("Select x,y,x from table where x=10;");

        // manner of writing query has become more clear
        QueryBuilder qb = new QueryBuilder();
        Query queryFromBuilder = qb.select("x,y,z")
                .tableName("table name")
                .where("x = 10")
                .build();

        System.out.println(queryFromBuilder.getQuery());
    }
}
