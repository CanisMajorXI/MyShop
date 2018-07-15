package com.jzm.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author zqw
*/
public class Vip implements Serializable {

    private static final long serialVersionUID = 1531646518463L;


    /**
    * 主键
    * VIP用户ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * vip类型
    * isNullAble:0
    */
    private Integer typeId;

    /**
    * 用户手机号
    * isNullAble:0
    */
    private String phoneNumber;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTypeId(Integer typeId){this.typeId = typeId;}

    public Integer getTypeId(){return this.typeId;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getPhoneNumber(){return this.phoneNumber;}
    @Override
    public String toString() {
        return "Vip{" +
                "id='" + id + '\'' +
                "typeId='" + typeId + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Vip set;

        private ConditionBuilder where;

        public UpdateBuilder set(Vip set){
            this.set = set;
            return this;
        }

        public Vip getSet(){
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

    public static class QueryBuilder extends Vip{
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

        private List<String> phoneNumberList;

        public List<String> getPhoneNumberList(){return this.phoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
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

        public QueryBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder phoneNumber(String phoneNumber){
            setPhoneNumber(phoneNumber);
            return this;
        }

        public QueryBuilder phoneNumberList(String ... phoneNumber){
            this.phoneNumberList = solveNullList(phoneNumber);
            return this;
        }

        public QueryBuilder phoneNumberList(List<String> phoneNumber){
            this.phoneNumberList = phoneNumber;
            return this;
        }

        public QueryBuilder fetchPhoneNumber(){
            setFetchFields("fetchFields","phoneNumber");
            return this;
        }

        public QueryBuilder excludePhoneNumber(){
            setFetchFields("excludeFields","phoneNumber");
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

        public Vip build(){return this;}
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

        private List<String> phoneNumberList;

        public List<String> getPhoneNumberList(){return this.phoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}

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

        public ConditionBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder phoneNumberList(String ... phoneNumber){
            this.phoneNumberList = solveNullList(phoneNumber);
            return this;
        }

        public ConditionBuilder phoneNumberList(List<String> phoneNumber){
            this.phoneNumberList = phoneNumber;
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

        private Vip obj;

        public Builder(){
            this.obj = new Vip();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder typeId(Integer typeId){
            this.obj.setTypeId(typeId);
            return this;
        }
        public Builder phoneNumber(String phoneNumber){
            this.obj.setPhoneNumber(phoneNumber);
            return this;
        }
        public Vip build(){return obj;}
    }

}
