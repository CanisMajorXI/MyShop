package com.jzm.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.jzm.util.LocalDateDeserializer;
import com.jzm.util.LocalDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zqw
*/
public class Merchandise implements Serializable {

    private static final long serialVersionUID = 1531648952830L;


    /**
    * 主键
    * 商品id 为主码，并且自增
    * isNullAble:0
    */

    private Integer id;

    /**
    * 商品类型id
    * isNullAble:0
    */
    private Integer typeId;

    /**
    * 商品生产时间
    * isNullAble:0
    */
   @JsonDeserialize(using = LocalDateDeserializer.class)
   @JsonSerialize(using = LocalDateSerializer.class)
    private java.time.LocalDate productDate;

    /**
    * 商品是否有效
    * isNullAble:0
    */
    private Integer valid;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTypeId(Integer typeId){this.typeId = typeId;}

    public Integer getTypeId(){return this.typeId;}

    public void setProductDate(java.time.LocalDate productDate){this.productDate = productDate;}

    public java.time.LocalDate getProductDate(){return this.productDate;}

    public void setValid(Integer valid){this.valid = valid;}

    public Integer getValid(){return this.valid;}
    @Override
    public String toString() {
        return "Merchandise{" +
                "id='" + id + '\'' +
                "typeId='" + typeId + '\'' +
                "productDate='" + productDate + '\'' +
                "valid='" + valid + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Merchandise set;

        private ConditionBuilder where;

        public UpdateBuilder set(Merchandise set){
            this.set = set;
            return this;
        }

        public Merchandise getSet(){
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

    public static class QueryBuilder extends Merchandise{
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

        private List<Integer> typeIdList;

        public List<Integer> getTypeIdList(){return this.typeIdList;}

        private Integer typeIdSt;

        private Integer typeIdEd;

        public Integer getTypeIdSt(){return this.typeIdSt;}

        public Integer getTypeIdEd(){return this.typeIdEd;}

        private List<java.time.LocalDate> productDateList;

        public List<java.time.LocalDate> getProductDateList(){return this.productDateList;}

        private java.time.LocalDate productDateSt;

        private java.time.LocalDate productDateEd;

        public java.time.LocalDate getProductDateSt(){return this.productDateSt;}

        public java.time.LocalDate getProductDateEd(){return this.productDateEd;}

        private List<Integer> validList;

        public List<Integer> getValidList(){return this.validList;}

        private Integer validSt;

        private Integer validEd;

        public Integer getValidSt(){return this.validSt;}

        public Integer getValidEd(){return this.validEd;}

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

        public QueryBuilder typeIdBetWeen(Integer typeIdSt,Integer typeIdEd){
            this.typeIdSt = typeIdSt;
            this.typeIdEd = typeIdEd;
            return this;
        }

        public QueryBuilder typeIdGreaterEqThan(Integer typeIdSt){
            this.typeIdSt = typeIdSt;
            return this;
        }
        public QueryBuilder typeIdLessEqThan(Integer typeIdEd){
            this.typeIdEd = typeIdEd;
            return this;
        }


        public QueryBuilder typeId(Integer typeId){
            setTypeId(typeId);
            return this;
        }

        public QueryBuilder typeIdList(Integer ... typeId){
            this.typeIdList = solveNullList(typeId);
            return this;
        }

        public QueryBuilder typeIdList(List<Integer> typeId){
            this.typeIdList = typeId;
            return this;
        }

        public QueryBuilder fetchTypeId(){
            setFetchFields("fetchFields","typeId");
            return this;
        }

        public QueryBuilder excludeTypeId(){
            setFetchFields("excludeFields","typeId");
            return this;
        }

        public QueryBuilder productDateBetWeen(java.time.LocalDate productDateSt,java.time.LocalDate productDateEd){
            this.productDateSt = productDateSt;
            this.productDateEd = productDateEd;
            return this;
        }

        public QueryBuilder productDateGreaterEqThan(java.time.LocalDate productDateSt){
            this.productDateSt = productDateSt;
            return this;
        }
        public QueryBuilder productDateLessEqThan(java.time.LocalDate productDateEd){
            this.productDateEd = productDateEd;
            return this;
        }


        public QueryBuilder productDate(java.time.LocalDate productDate){
            setProductDate(productDate);
            return this;
        }

        public QueryBuilder productDateList(java.time.LocalDate ... productDate){
            this.productDateList = solveNullList(productDate);
            return this;
        }

        public QueryBuilder productDateList(List<java.time.LocalDate> productDate){
            this.productDateList = productDate;
            return this;
        }

        public QueryBuilder fetchProductDate(){
            setFetchFields("fetchFields","productDate");
            return this;
        }

        public QueryBuilder excludeProductDate(){
            setFetchFields("excludeFields","productDate");
            return this;
        }

        public QueryBuilder validBetWeen(Integer validSt,Integer validEd){
            this.validSt = validSt;
            this.validEd = validEd;
            return this;
        }

        public QueryBuilder validGreaterEqThan(Integer validSt){
            this.validSt = validSt;
            return this;
        }
        public QueryBuilder validLessEqThan(Integer validEd){
            this.validEd = validEd;
            return this;
        }


        public QueryBuilder valid(Integer valid){
            setValid(valid);
            return this;
        }

        public QueryBuilder validList(Integer ... valid){
            this.validList = solveNullList(valid);
            return this;
        }

        public QueryBuilder validList(List<Integer> valid){
            this.validList = valid;
            return this;
        }

        public QueryBuilder fetchValid(){
            setFetchFields("fetchFields","valid");
            return this;
        }

        public QueryBuilder excludeValid(){
            setFetchFields("excludeFields","valid");
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

        public Merchandise build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> typeIdList;

        public List<Integer> getTypeIdList(){return this.typeIdList;}

        private Integer typeIdSt;

        private Integer typeIdEd;

        public Integer getTypeIdSt(){return this.typeIdSt;}

        public Integer getTypeIdEd(){return this.typeIdEd;}

        private List<java.time.LocalDate> productDateList;

        public List<java.time.LocalDate> getProductDateList(){return this.productDateList;}

        private java.time.LocalDate productDateSt;

        private java.time.LocalDate productDateEd;

        public java.time.LocalDate getProductDateSt(){return this.productDateSt;}

        public java.time.LocalDate getProductDateEd(){return this.productDateEd;}

        private List<Integer> validList;

        public List<Integer> getValidList(){return this.validList;}

        private Integer validSt;

        private Integer validEd;

        public Integer getValidSt(){return this.validSt;}

        public Integer getValidEd(){return this.validEd;}


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

        public ConditionBuilder typeIdBetWeen(Integer typeIdSt,Integer typeIdEd){
            this.typeIdSt = typeIdSt;
            this.typeIdEd = typeIdEd;
            return this;
        }

        public ConditionBuilder typeIdGreaterEqThan(Integer typeIdSt){
            this.typeIdSt = typeIdSt;
            return this;
        }
        public ConditionBuilder typeIdLessEqThan(Integer typeIdEd){
            this.typeIdEd = typeIdEd;
            return this;
        }


        public ConditionBuilder typeIdList(Integer ... typeId){
            this.typeIdList = solveNullList(typeId);
            return this;
        }

        public ConditionBuilder typeIdList(List<Integer> typeId){
            this.typeIdList = typeId;
            return this;
        }

        public ConditionBuilder productDateBetWeen(java.time.LocalDate productDateSt,java.time.LocalDate productDateEd){
            this.productDateSt = productDateSt;
            this.productDateEd = productDateEd;
            return this;
        }

        public ConditionBuilder productDateGreaterEqThan(java.time.LocalDate productDateSt){
            this.productDateSt = productDateSt;
            return this;
        }
        public ConditionBuilder productDateLessEqThan(java.time.LocalDate productDateEd){
            this.productDateEd = productDateEd;
            return this;
        }


        public ConditionBuilder productDateList(java.time.LocalDate ... productDate){
            this.productDateList = solveNullList(productDate);
            return this;
        }

        public ConditionBuilder productDateList(List<java.time.LocalDate> productDate){
            this.productDateList = productDate;
            return this;
        }

        public ConditionBuilder validBetWeen(Integer validSt,Integer validEd){
            this.validSt = validSt;
            this.validEd = validEd;
            return this;
        }

        public ConditionBuilder validGreaterEqThan(Integer validSt){
            this.validSt = validSt;
            return this;
        }
        public ConditionBuilder validLessEqThan(Integer validEd){
            this.validEd = validEd;
            return this;
        }


        public ConditionBuilder validList(Integer ... valid){
            this.validList = solveNullList(valid);
            return this;
        }

        public ConditionBuilder validList(List<Integer> valid){
            this.validList = valid;
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

        private Merchandise obj;

        public Builder(){
            this.obj = new Merchandise();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder typeId(Integer typeId){
            this.obj.setTypeId(typeId);
            return this;
        }
        public Builder productDate(java.time.LocalDate productDate){
            this.obj.setProductDate(productDate);
            return this;
        }
        public Builder valid(Integer valid){
            this.obj.setValid(valid);
            return this;
        }
        public Merchandise build(){return obj;}
    }

}
