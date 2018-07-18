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
public class Salesman implements Serializable {

    private static final long serialVersionUID = 1531649326758L;


    /**
    * 主键
    * 员工Id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 员工姓名
    * isNullAble:0
    */
    private String name;

    /**
    * 性别
    * isNullAble:0
    */
    private Integer gender;

    /**
    * 头像
    * isNullAble:1
    */
    private String portrait;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setGender(Integer gender){this.gender = gender;}

    public Integer getGender(){return this.gender;}

    public void setPortrait(String portrait){this.portrait = portrait;}

    public String getPortrait(){return this.portrait;}
    @Override
    public String toString() {
        return "Salesman{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "gender='" + gender + '\'' +
                "portrait='" + portrait + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Salesman set;

        private ConditionBuilder where;

        public UpdateBuilder set(Salesman set){
            this.set = set;
            return this;
        }

        public Salesman getSet(){
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

    public static class QueryBuilder extends Salesman{
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

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> genderList;

        public List<Integer> getGenderList(){return this.genderList;}

        private Integer genderSt;

        private Integer genderEd;

        public Integer getGenderSt(){return this.genderSt;}

        public Integer getGenderEd(){return this.genderEd;}

        private List<String> portraitList;

        public List<String> getPortraitList(){return this.portraitList;}


        private List<String> fuzzyPortrait;

        public List<String> getFuzzyPortrait(){return this.fuzzyPortrait;}

        private List<String> rightFuzzyPortrait;

        public List<String> getRightFuzzyPortrait(){return this.rightFuzzyPortrait;}
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

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder genderBetWeen(Integer genderSt,Integer genderEd){
            this.genderSt = genderSt;
            this.genderEd = genderEd;
            return this;
        }

        public QueryBuilder genderGreaterEqThan(Integer genderSt){
            this.genderSt = genderSt;
            return this;
        }
        public QueryBuilder genderLessEqThan(Integer genderEd){
            this.genderEd = genderEd;
            return this;
        }


        public QueryBuilder gender(Integer gender){
            setGender(gender);
            return this;
        }

        public QueryBuilder genderList(Integer ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public QueryBuilder genderList(List<Integer> gender){
            this.genderList = gender;
            return this;
        }

        public QueryBuilder fetchGender(){
            setFetchFields("fetchFields","gender");
            return this;
        }

        public QueryBuilder excludeGender(){
            setFetchFields("excludeFields","gender");
            return this;
        }

        public QueryBuilder fuzzyPortrait (List<String> fuzzyPortrait){
            this.fuzzyPortrait = fuzzyPortrait;
            return this;
        }

        public QueryBuilder fuzzyPortrait (String ... fuzzyPortrait){
            this.fuzzyPortrait = solveNullList(fuzzyPortrait);
            return this;
        }

        public QueryBuilder rightFuzzyPortrait (List<String> rightFuzzyPortrait){
            this.rightFuzzyPortrait = rightFuzzyPortrait;
            return this;
        }

        public QueryBuilder rightFuzzyPortrait (String ... rightFuzzyPortrait){
            this.rightFuzzyPortrait = solveNullList(rightFuzzyPortrait);
            return this;
        }

        public QueryBuilder portrait(String portrait){
            setPortrait(portrait);
            return this;
        }

        public QueryBuilder portraitList(String ... portrait){
            this.portraitList = solveNullList(portrait);
            return this;
        }

        public QueryBuilder portraitList(List<String> portrait){
            this.portraitList = portrait;
            return this;
        }

        public QueryBuilder fetchPortrait(){
            setFetchFields("fetchFields","portrait");
            return this;
        }

        public QueryBuilder excludePortrait(){
            setFetchFields("excludeFields","portrait");
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

        public Salesman build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> genderList;

        public List<Integer> getGenderList(){return this.genderList;}

        private Integer genderSt;

        private Integer genderEd;

        public Integer getGenderSt(){return this.genderSt;}

        public Integer getGenderEd(){return this.genderEd;}

        private List<String> portraitList;

        public List<String> getPortraitList(){return this.portraitList;}


        private List<String> fuzzyPortrait;

        public List<String> getFuzzyPortrait(){return this.fuzzyPortrait;}

        private List<String> rightFuzzyPortrait;

        public List<String> getRightFuzzyPortrait(){return this.rightFuzzyPortrait;}

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

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder genderBetWeen(Integer genderSt,Integer genderEd){
            this.genderSt = genderSt;
            this.genderEd = genderEd;
            return this;
        }

        public ConditionBuilder genderGreaterEqThan(Integer genderSt){
            this.genderSt = genderSt;
            return this;
        }
        public ConditionBuilder genderLessEqThan(Integer genderEd){
            this.genderEd = genderEd;
            return this;
        }


        public ConditionBuilder genderList(Integer ... gender){
            this.genderList = solveNullList(gender);
            return this;
        }

        public ConditionBuilder genderList(List<Integer> gender){
            this.genderList = gender;
            return this;
        }

        public ConditionBuilder fuzzyPortrait (List<String> fuzzyPortrait){
            this.fuzzyPortrait = fuzzyPortrait;
            return this;
        }

        public ConditionBuilder fuzzyPortrait (String ... fuzzyPortrait){
            this.fuzzyPortrait = solveNullList(fuzzyPortrait);
            return this;
        }

        public ConditionBuilder rightFuzzyPortrait (List<String> rightFuzzyPortrait){
            this.rightFuzzyPortrait = rightFuzzyPortrait;
            return this;
        }

        public ConditionBuilder rightFuzzyPortrait (String ... rightFuzzyPortrait){
            this.rightFuzzyPortrait = solveNullList(rightFuzzyPortrait);
            return this;
        }

        public ConditionBuilder portraitList(String ... portrait){
            this.portraitList = solveNullList(portrait);
            return this;
        }

        public ConditionBuilder portraitList(List<String> portrait){
            this.portraitList = portrait;
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

        private Salesman obj;

        public Builder(){
            this.obj = new Salesman();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder gender(Integer gender){
            this.obj.setGender(gender);
            return this;
        }
        public Builder portrait(String portrait){
            this.obj.setPortrait(portrait);
            return this;
        }
        public Salesman build(){return obj;}
    }

}
