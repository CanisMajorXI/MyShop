package com.jzm.model;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jzm.util.LocalDateDeserializer;
import com.jzm.util.LocalDateSerializer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zqw
*/
public class WholesaleRecord implements Serializable {

    private static final long serialVersionUID = 1531892313542L;


    /**
    * 批发单号id，同一批订单单号一样
    * isNullAble:0
    */
    private Integer id;

    /**
    * 商品id
    * isNullAble:0
    */
    private Integer merchandiseId;

    /**
    * 订单日期
    * isNullAble:0
    */
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private java.time.LocalDate date;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setMerchandiseId(Integer merchandiseId){this.merchandiseId = merchandiseId;}

    public Integer getMerchandiseId(){return this.merchandiseId;}

    public void setDate(java.time.LocalDate date){this.date = date;}

    public java.time.LocalDate getDate(){return this.date;}
    @Override
    public String toString() {
        return "WholesaleRecord{" +
                "id='" + id + '\'' +
                "merchandiseId='" + merchandiseId + '\'' +
                "date='" + date + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WholesaleRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(WholesaleRecord set){
            this.set = set;
            return this;
        }

        public WholesaleRecord getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends WholesaleRecord{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> merchandiseIdList;

        public List<Integer> getMerchandiseIdList(){return this.merchandiseIdList;}

        private Integer merchandiseIdSt;

        private Integer merchandiseIdEd;

        public Integer getMerchandiseIdSt(){return this.merchandiseIdSt;}

        public Integer getMerchandiseIdEd(){return this.merchandiseIdEd;}

        private List<java.time.LocalDate> dateList;

        public List<java.time.LocalDate> getDateList(){return this.dateList;}

        private java.time.LocalDate dateSt;

        private java.time.LocalDate dateEd;

        public java.time.LocalDate getDateSt(){return this.dateSt;}

        public java.time.LocalDate getDateEd(){return this.dateEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder merchandiseIdBetWeen(Integer merchandiseIdSt,Integer merchandiseIdEd){
            this.merchandiseIdSt = merchandiseIdSt;
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }

        public QueryBuilder merchandiseIdGreaterEqThan(Integer merchandiseIdSt){
            this.merchandiseIdSt = merchandiseIdSt;
            return this;
        }
        public QueryBuilder merchandiseIdLessEqThan(Integer merchandiseIdEd){
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }


        public QueryBuilder merchandiseId(Integer merchandiseId){
            setMerchandiseId(merchandiseId);
            return this;
        }

        public QueryBuilder merchandiseIdList(Integer ... merchandiseId){
            this.merchandiseIdList = solveNullList(merchandiseId);
            return this;
        }

        public QueryBuilder merchandiseIdList(List<Integer> merchandiseId){
            this.merchandiseIdList = merchandiseId;
            return this;
        }

        public QueryBuilder fetchMerchandiseId(){
            setFetchFields("fetchFields","merchandiseId");
            return this;
        }

        public QueryBuilder excludeMerchandiseId(){
            setFetchFields("excludeFields","merchandiseId");
            return this;
        }

        public QueryBuilder dateBetWeen(java.time.LocalDate dateSt,java.time.LocalDate dateEd){
            this.dateSt = dateSt;
            this.dateEd = dateEd;
            return this;
        }

        public QueryBuilder dateGreaterEqThan(java.time.LocalDate dateSt){
            this.dateSt = dateSt;
            return this;
        }
        public QueryBuilder dateLessEqThan(java.time.LocalDate dateEd){
            this.dateEd = dateEd;
            return this;
        }


        public QueryBuilder date(java.time.LocalDate date){
            setDate(date);
            return this;
        }

        public QueryBuilder dateList(java.time.LocalDate ... date){
            this.dateList = solveNullList(date);
            return this;
        }

        public QueryBuilder dateList(List<java.time.LocalDate> date){
            this.dateList = date;
            return this;
        }

        public QueryBuilder fetchDate(){
            setFetchFields("fetchFields","date");
            return this;
        }

        public QueryBuilder excludeDate(){
            setFetchFields("excludeFields","date");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public WholesaleRecord build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> merchandiseIdList;

        public List<Integer> getMerchandiseIdList(){return this.merchandiseIdList;}

        private Integer merchandiseIdSt;

        private Integer merchandiseIdEd;

        public Integer getMerchandiseIdSt(){return this.merchandiseIdSt;}

        public Integer getMerchandiseIdEd(){return this.merchandiseIdEd;}

        private List<java.time.LocalDate> dateList;

        public List<java.time.LocalDate> getDateList(){return this.dateList;}

        private java.time.LocalDate dateSt;

        private java.time.LocalDate dateEd;

        public java.time.LocalDate getDateSt(){return this.dateSt;}

        public java.time.LocalDate getDateEd(){return this.dateEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder merchandiseIdBetWeen(Integer merchandiseIdSt,Integer merchandiseIdEd){
            this.merchandiseIdSt = merchandiseIdSt;
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }

        public ConditionBuilder merchandiseIdGreaterEqThan(Integer merchandiseIdSt){
            this.merchandiseIdSt = merchandiseIdSt;
            return this;
        }
        public ConditionBuilder merchandiseIdLessEqThan(Integer merchandiseIdEd){
            this.merchandiseIdEd = merchandiseIdEd;
            return this;
        }


        public ConditionBuilder merchandiseIdList(Integer ... merchandiseId){
            this.merchandiseIdList = solveNullList(merchandiseId);
            return this;
        }

        public ConditionBuilder merchandiseIdList(List<Integer> merchandiseId){
            this.merchandiseIdList = merchandiseId;
            return this;
        }

        public ConditionBuilder dateBetWeen(java.time.LocalDate dateSt,java.time.LocalDate dateEd){
            this.dateSt = dateSt;
            this.dateEd = dateEd;
            return this;
        }

        public ConditionBuilder dateGreaterEqThan(java.time.LocalDate dateSt){
            this.dateSt = dateSt;
            return this;
        }
        public ConditionBuilder dateLessEqThan(java.time.LocalDate dateEd){
            this.dateEd = dateEd;
            return this;
        }


        public ConditionBuilder dateList(java.time.LocalDate ... date){
            this.dateList = solveNullList(date);
            return this;
        }

        public ConditionBuilder dateList(List<java.time.LocalDate> date){
            this.dateList = date;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private WholesaleRecord obj;

        public Builder(){
            this.obj = new WholesaleRecord();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder merchandiseId(Integer merchandiseId){
            this.obj.setMerchandiseId(merchandiseId);
            return this;
        }
        public Builder date(java.time.LocalDate date){
            this.obj.setDate(date);
            return this;
        }
        public WholesaleRecord build(){return obj;}
    }

}
