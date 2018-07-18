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
public class MerchandiseType implements Serializable {

    private static final long serialVersionUID = 1531735646238L;


    /**
    * 主键
    * 商品类型Id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 商品名称
    * isNullAble:0
    */
    private String name;

    /**
    * 商品图片
    * isNullAble:1
    */
    private String picture;

    /**
    * 商品有效期
    * isNullAble:0
    */
    private Integer expiration;

    /**
    * 商品进货价格
    * isNullAble:0
    */
    private java.math.BigDecimal purchasePrice;

    /**
    * 商品批发卖价
    * isNullAble:0
    */
    private java.math.BigDecimal wholesalePrice;

    /**
    * 商品零售价格
    * isNullAble:0
    */
    private java.math.BigDecimal retailPrice;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setPicture(String picture){this.picture = picture;}

    public String getPicture(){return this.picture;}

    public void setExpiration(Integer expiration){this.expiration = expiration;}

    public Integer getExpiration(){return this.expiration;}

    public void setPurchasePrice(java.math.BigDecimal purchasePrice){this.purchasePrice = purchasePrice;}

    public java.math.BigDecimal getPurchasePrice(){return this.purchasePrice;}

    public void setWholesalePrice(java.math.BigDecimal wholesalePrice){this.wholesalePrice = wholesalePrice;}

    public java.math.BigDecimal getWholesalePrice(){return this.wholesalePrice;}

    public void setRetailPrice(java.math.BigDecimal retailPrice){this.retailPrice = retailPrice;}

    public java.math.BigDecimal getRetailPrice(){return this.retailPrice;}
    @Override
    public String toString() {
        return "MerchandiseType{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "picture='" + picture + '\'' +
                "expiration='" + expiration + '\'' +
                "purchasePrice='" + purchasePrice + '\'' +
                "wholesalePrice='" + wholesalePrice + '\'' +
                "retailPrice='" + retailPrice + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private MerchandiseType set;

        private ConditionBuilder where;

        public UpdateBuilder set(MerchandiseType set){
            this.set = set;
            return this;
        }

        public MerchandiseType getSet(){
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

    public static class QueryBuilder extends MerchandiseType{
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
        private List<String> pictureList;

        public List<String> getPictureList(){return this.pictureList;}


        private List<String> fuzzyPicture;

        public List<String> getFuzzyPicture(){return this.fuzzyPicture;}

        private List<String> rightFuzzyPicture;

        public List<String> getRightFuzzyPicture(){return this.rightFuzzyPicture;}
        private List<Integer> expirationList;

        public List<Integer> getExpirationList(){return this.expirationList;}

        private Integer expirationSt;

        private Integer expirationEd;

        public Integer getExpirationSt(){return this.expirationSt;}

        public Integer getExpirationEd(){return this.expirationEd;}

        private List<java.math.BigDecimal> purchasePriceList;

        public List<java.math.BigDecimal> getPurchasePriceList(){return this.purchasePriceList;}

        private java.math.BigDecimal purchasePriceSt;

        private java.math.BigDecimal purchasePriceEd;

        public java.math.BigDecimal getPurchasePriceSt(){return this.purchasePriceSt;}

        public java.math.BigDecimal getPurchasePriceEd(){return this.purchasePriceEd;}

        private List<java.math.BigDecimal> wholesalePriceList;

        public List<java.math.BigDecimal> getWholesalePriceList(){return this.wholesalePriceList;}

        private java.math.BigDecimal wholesalePriceSt;

        private java.math.BigDecimal wholesalePriceEd;

        public java.math.BigDecimal getWholesalePriceSt(){return this.wholesalePriceSt;}

        public java.math.BigDecimal getWholesalePriceEd(){return this.wholesalePriceEd;}

        private List<java.math.BigDecimal> retailPriceList;

        public List<java.math.BigDecimal> getRetailPriceList(){return this.retailPriceList;}

        private java.math.BigDecimal retailPriceSt;

        private java.math.BigDecimal retailPriceEd;

        public java.math.BigDecimal getRetailPriceSt(){return this.retailPriceSt;}

        public java.math.BigDecimal getRetailPriceEd(){return this.retailPriceEd;}

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

        public QueryBuilder fuzzyPicture (List<String> fuzzyPicture){
            this.fuzzyPicture = fuzzyPicture;
            return this;
        }

        public QueryBuilder fuzzyPicture (String ... fuzzyPicture){
            this.fuzzyPicture = solveNullList(fuzzyPicture);
            return this;
        }

        public QueryBuilder rightFuzzyPicture (List<String> rightFuzzyPicture){
            this.rightFuzzyPicture = rightFuzzyPicture;
            return this;
        }

        public QueryBuilder rightFuzzyPicture (String ... rightFuzzyPicture){
            this.rightFuzzyPicture = solveNullList(rightFuzzyPicture);
            return this;
        }

        public QueryBuilder picture(String picture){
            setPicture(picture);
            return this;
        }

        public QueryBuilder pictureList(String ... picture){
            this.pictureList = solveNullList(picture);
            return this;
        }

        public QueryBuilder pictureList(List<String> picture){
            this.pictureList = picture;
            return this;
        }

        public QueryBuilder fetchPicture(){
            setFetchFields("fetchFields","picture");
            return this;
        }

        public QueryBuilder excludePicture(){
            setFetchFields("excludeFields","picture");
            return this;
        }

        public QueryBuilder expirationBetWeen(Integer expirationSt,Integer expirationEd){
            this.expirationSt = expirationSt;
            this.expirationEd = expirationEd;
            return this;
        }

        public QueryBuilder expirationGreaterEqThan(Integer expirationSt){
            this.expirationSt = expirationSt;
            return this;
        }
        public QueryBuilder expirationLessEqThan(Integer expirationEd){
            this.expirationEd = expirationEd;
            return this;
        }


        public QueryBuilder expiration(Integer expiration){
            setExpiration(expiration);
            return this;
        }

        public QueryBuilder expirationList(Integer ... expiration){
            this.expirationList = solveNullList(expiration);
            return this;
        }

        public QueryBuilder expirationList(List<Integer> expiration){
            this.expirationList = expiration;
            return this;
        }

        public QueryBuilder fetchExpiration(){
            setFetchFields("fetchFields","expiration");
            return this;
        }

        public QueryBuilder excludeExpiration(){
            setFetchFields("excludeFields","expiration");
            return this;
        }

        public QueryBuilder purchasePriceBetWeen(java.math.BigDecimal purchasePriceSt,java.math.BigDecimal purchasePriceEd){
            this.purchasePriceSt = purchasePriceSt;
            this.purchasePriceEd = purchasePriceEd;
            return this;
        }

        public QueryBuilder purchasePriceGreaterEqThan(java.math.BigDecimal purchasePriceSt){
            this.purchasePriceSt = purchasePriceSt;
            return this;
        }
        public QueryBuilder purchasePriceLessEqThan(java.math.BigDecimal purchasePriceEd){
            this.purchasePriceEd = purchasePriceEd;
            return this;
        }


        public QueryBuilder purchasePrice(java.math.BigDecimal purchasePrice){
            setPurchasePrice(purchasePrice);
            return this;
        }

        public QueryBuilder purchasePriceList(java.math.BigDecimal ... purchasePrice){
            this.purchasePriceList = solveNullList(purchasePrice);
            return this;
        }

        public QueryBuilder purchasePriceList(List<java.math.BigDecimal> purchasePrice){
            this.purchasePriceList = purchasePrice;
            return this;
        }

        public QueryBuilder fetchPurchasePrice(){
            setFetchFields("fetchFields","purchasePrice");
            return this;
        }

        public QueryBuilder excludePurchasePrice(){
            setFetchFields("excludeFields","purchasePrice");
            return this;
        }

        public QueryBuilder wholesalePriceBetWeen(java.math.BigDecimal wholesalePriceSt,java.math.BigDecimal wholesalePriceEd){
            this.wholesalePriceSt = wholesalePriceSt;
            this.wholesalePriceEd = wholesalePriceEd;
            return this;
        }

        public QueryBuilder wholesalePriceGreaterEqThan(java.math.BigDecimal wholesalePriceSt){
            this.wholesalePriceSt = wholesalePriceSt;
            return this;
        }
        public QueryBuilder wholesalePriceLessEqThan(java.math.BigDecimal wholesalePriceEd){
            this.wholesalePriceEd = wholesalePriceEd;
            return this;
        }


        public QueryBuilder wholesalePrice(java.math.BigDecimal wholesalePrice){
            setWholesalePrice(wholesalePrice);
            return this;
        }

        public QueryBuilder wholesalePriceList(java.math.BigDecimal ... wholesalePrice){
            this.wholesalePriceList = solveNullList(wholesalePrice);
            return this;
        }

        public QueryBuilder wholesalePriceList(List<java.math.BigDecimal> wholesalePrice){
            this.wholesalePriceList = wholesalePrice;
            return this;
        }

        public QueryBuilder fetchWholesalePrice(){
            setFetchFields("fetchFields","wholesalePrice");
            return this;
        }

        public QueryBuilder excludeWholesalePrice(){
            setFetchFields("excludeFields","wholesalePrice");
            return this;
        }

        public QueryBuilder retailPriceBetWeen(java.math.BigDecimal retailPriceSt,java.math.BigDecimal retailPriceEd){
            this.retailPriceSt = retailPriceSt;
            this.retailPriceEd = retailPriceEd;
            return this;
        }

        public QueryBuilder retailPriceGreaterEqThan(java.math.BigDecimal retailPriceSt){
            this.retailPriceSt = retailPriceSt;
            return this;
        }
        public QueryBuilder retailPriceLessEqThan(java.math.BigDecimal retailPriceEd){
            this.retailPriceEd = retailPriceEd;
            return this;
        }


        public QueryBuilder retailPrice(java.math.BigDecimal retailPrice){
            setRetailPrice(retailPrice);
            return this;
        }

        public QueryBuilder retailPriceList(java.math.BigDecimal ... retailPrice){
            this.retailPriceList = solveNullList(retailPrice);
            return this;
        }

        public QueryBuilder retailPriceList(List<java.math.BigDecimal> retailPrice){
            this.retailPriceList = retailPrice;
            return this;
        }

        public QueryBuilder fetchRetailPrice(){
            setFetchFields("fetchFields","retailPrice");
            return this;
        }

        public QueryBuilder excludeRetailPrice(){
            setFetchFields("excludeFields","retailPrice");
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

        public MerchandiseType build(){return this;}
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
        private List<String> pictureList;

        public List<String> getPictureList(){return this.pictureList;}


        private List<String> fuzzyPicture;

        public List<String> getFuzzyPicture(){return this.fuzzyPicture;}

        private List<String> rightFuzzyPicture;

        public List<String> getRightFuzzyPicture(){return this.rightFuzzyPicture;}
        private List<Integer> expirationList;

        public List<Integer> getExpirationList(){return this.expirationList;}

        private Integer expirationSt;

        private Integer expirationEd;

        public Integer getExpirationSt(){return this.expirationSt;}

        public Integer getExpirationEd(){return this.expirationEd;}

        private List<java.math.BigDecimal> purchasePriceList;

        public List<java.math.BigDecimal> getPurchasePriceList(){return this.purchasePriceList;}

        private java.math.BigDecimal purchasePriceSt;

        private java.math.BigDecimal purchasePriceEd;

        public java.math.BigDecimal getPurchasePriceSt(){return this.purchasePriceSt;}

        public java.math.BigDecimal getPurchasePriceEd(){return this.purchasePriceEd;}

        private List<java.math.BigDecimal> wholesalePriceList;

        public List<java.math.BigDecimal> getWholesalePriceList(){return this.wholesalePriceList;}

        private java.math.BigDecimal wholesalePriceSt;

        private java.math.BigDecimal wholesalePriceEd;

        public java.math.BigDecimal getWholesalePriceSt(){return this.wholesalePriceSt;}

        public java.math.BigDecimal getWholesalePriceEd(){return this.wholesalePriceEd;}

        private List<java.math.BigDecimal> retailPriceList;

        public List<java.math.BigDecimal> getRetailPriceList(){return this.retailPriceList;}

        private java.math.BigDecimal retailPriceSt;

        private java.math.BigDecimal retailPriceEd;

        public java.math.BigDecimal getRetailPriceSt(){return this.retailPriceSt;}

        public java.math.BigDecimal getRetailPriceEd(){return this.retailPriceEd;}


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

        public ConditionBuilder fuzzyPicture (List<String> fuzzyPicture){
            this.fuzzyPicture = fuzzyPicture;
            return this;
        }

        public ConditionBuilder fuzzyPicture (String ... fuzzyPicture){
            this.fuzzyPicture = solveNullList(fuzzyPicture);
            return this;
        }

        public ConditionBuilder rightFuzzyPicture (List<String> rightFuzzyPicture){
            this.rightFuzzyPicture = rightFuzzyPicture;
            return this;
        }

        public ConditionBuilder rightFuzzyPicture (String ... rightFuzzyPicture){
            this.rightFuzzyPicture = solveNullList(rightFuzzyPicture);
            return this;
        }

        public ConditionBuilder pictureList(String ... picture){
            this.pictureList = solveNullList(picture);
            return this;
        }

        public ConditionBuilder pictureList(List<String> picture){
            this.pictureList = picture;
            return this;
        }

        public ConditionBuilder expirationBetWeen(Integer expirationSt,Integer expirationEd){
            this.expirationSt = expirationSt;
            this.expirationEd = expirationEd;
            return this;
        }

        public ConditionBuilder expirationGreaterEqThan(Integer expirationSt){
            this.expirationSt = expirationSt;
            return this;
        }
        public ConditionBuilder expirationLessEqThan(Integer expirationEd){
            this.expirationEd = expirationEd;
            return this;
        }


        public ConditionBuilder expirationList(Integer ... expiration){
            this.expirationList = solveNullList(expiration);
            return this;
        }

        public ConditionBuilder expirationList(List<Integer> expiration){
            this.expirationList = expiration;
            return this;
        }

        public ConditionBuilder purchasePriceBetWeen(java.math.BigDecimal purchasePriceSt,java.math.BigDecimal purchasePriceEd){
            this.purchasePriceSt = purchasePriceSt;
            this.purchasePriceEd = purchasePriceEd;
            return this;
        }

        public ConditionBuilder purchasePriceGreaterEqThan(java.math.BigDecimal purchasePriceSt){
            this.purchasePriceSt = purchasePriceSt;
            return this;
        }
        public ConditionBuilder purchasePriceLessEqThan(java.math.BigDecimal purchasePriceEd){
            this.purchasePriceEd = purchasePriceEd;
            return this;
        }


        public ConditionBuilder purchasePriceList(java.math.BigDecimal ... purchasePrice){
            this.purchasePriceList = solveNullList(purchasePrice);
            return this;
        }

        public ConditionBuilder purchasePriceList(List<java.math.BigDecimal> purchasePrice){
            this.purchasePriceList = purchasePrice;
            return this;
        }

        public ConditionBuilder wholesalePriceBetWeen(java.math.BigDecimal wholesalePriceSt,java.math.BigDecimal wholesalePriceEd){
            this.wholesalePriceSt = wholesalePriceSt;
            this.wholesalePriceEd = wholesalePriceEd;
            return this;
        }

        public ConditionBuilder wholesalePriceGreaterEqThan(java.math.BigDecimal wholesalePriceSt){
            this.wholesalePriceSt = wholesalePriceSt;
            return this;
        }
        public ConditionBuilder wholesalePriceLessEqThan(java.math.BigDecimal wholesalePriceEd){
            this.wholesalePriceEd = wholesalePriceEd;
            return this;
        }


        public ConditionBuilder wholesalePriceList(java.math.BigDecimal ... wholesalePrice){
            this.wholesalePriceList = solveNullList(wholesalePrice);
            return this;
        }

        public ConditionBuilder wholesalePriceList(List<java.math.BigDecimal> wholesalePrice){
            this.wholesalePriceList = wholesalePrice;
            return this;
        }

        public ConditionBuilder retailPriceBetWeen(java.math.BigDecimal retailPriceSt,java.math.BigDecimal retailPriceEd){
            this.retailPriceSt = retailPriceSt;
            this.retailPriceEd = retailPriceEd;
            return this;
        }

        public ConditionBuilder retailPriceGreaterEqThan(java.math.BigDecimal retailPriceSt){
            this.retailPriceSt = retailPriceSt;
            return this;
        }
        public ConditionBuilder retailPriceLessEqThan(java.math.BigDecimal retailPriceEd){
            this.retailPriceEd = retailPriceEd;
            return this;
        }


        public ConditionBuilder retailPriceList(java.math.BigDecimal ... retailPrice){
            this.retailPriceList = solveNullList(retailPrice);
            return this;
        }

        public ConditionBuilder retailPriceList(List<java.math.BigDecimal> retailPrice){
            this.retailPriceList = retailPrice;
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

        private MerchandiseType obj;

        public Builder(){
            this.obj = new MerchandiseType();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder picture(String picture){
            this.obj.setPicture(picture);
            return this;
        }
        public Builder expiration(Integer expiration){
            this.obj.setExpiration(expiration);
            return this;
        }
        public Builder purchasePrice(java.math.BigDecimal purchasePrice){
            this.obj.setPurchasePrice(purchasePrice);
            return this;
        }
        public Builder wholesalePrice(java.math.BigDecimal wholesalePrice){
            this.obj.setWholesalePrice(wholesalePrice);
            return this;
        }
        public Builder retailPrice(java.math.BigDecimal retailPrice){
            this.obj.setRetailPrice(retailPrice);
            return this;
        }
        public MerchandiseType build(){return obj;}
    }

}
