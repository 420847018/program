package com.pangu.po;

import java.util.ArrayList;
import java.util.List;

public class TAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAnswerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIndexIsNull() {
            addCriterion("id_index is null");
            return (Criteria) this;
        }

        public Criteria andIdIndexIsNotNull() {
            addCriterion("id_index is not null");
            return (Criteria) this;
        }

        public Criteria andIdIndexEqualTo(Long value) {
            addCriterion("id_index =", value, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexNotEqualTo(Long value) {
            addCriterion("id_index <>", value, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexGreaterThan(Long value) {
            addCriterion("id_index >", value, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexGreaterThanOrEqualTo(Long value) {
            addCriterion("id_index >=", value, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexLessThan(Long value) {
            addCriterion("id_index <", value, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexLessThanOrEqualTo(Long value) {
            addCriterion("id_index <=", value, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexIn(List<Long> values) {
            addCriterion("id_index in", values, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexNotIn(List<Long> values) {
            addCriterion("id_index not in", values, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexBetween(Long value1, Long value2) {
            addCriterion("id_index between", value1, value2, "idIndex");
            return (Criteria) this;
        }

        public Criteria andIdIndexNotBetween(Long value1, Long value2) {
            addCriterion("id_index not between", value1, value2, "idIndex");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Long value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Long value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Long value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Long value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Long value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Long> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Long> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Long value1, Long value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Long value1, Long value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andAnswerContentIsNull() {
            addCriterion("answer_content is null");
            return (Criteria) this;
        }

        public Criteria andAnswerContentIsNotNull() {
            addCriterion("answer_content is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerContentEqualTo(String value) {
            addCriterion("answer_content =", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentNotEqualTo(String value) {
            addCriterion("answer_content <>", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentGreaterThan(String value) {
            addCriterion("answer_content >", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentGreaterThanOrEqualTo(String value) {
            addCriterion("answer_content >=", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentLessThan(String value) {
            addCriterion("answer_content <", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentLessThanOrEqualTo(String value) {
            addCriterion("answer_content <=", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentLike(String value) {
            addCriterion("answer_content like", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentNotLike(String value) {
            addCriterion("answer_content not like", value, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentIn(List<String> values) {
            addCriterion("answer_content in", values, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentNotIn(List<String> values) {
            addCriterion("answer_content not in", values, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentBetween(String value1, String value2) {
            addCriterion("answer_content between", value1, value2, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerContentNotBetween(String value1, String value2) {
            addCriterion("answer_content not between", value1, value2, "answerContent");
            return (Criteria) this;
        }

        public Criteria andAnswerNoIsNull() {
            addCriterion("answer_no is null");
            return (Criteria) this;
        }

        public Criteria andAnswerNoIsNotNull() {
            addCriterion("answer_no is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerNoEqualTo(String value) {
            addCriterion("answer_no =", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoNotEqualTo(String value) {
            addCriterion("answer_no <>", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoGreaterThan(String value) {
            addCriterion("answer_no >", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoGreaterThanOrEqualTo(String value) {
            addCriterion("answer_no >=", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoLessThan(String value) {
            addCriterion("answer_no <", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoLessThanOrEqualTo(String value) {
            addCriterion("answer_no <=", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoLike(String value) {
            addCriterion("answer_no like", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoNotLike(String value) {
            addCriterion("answer_no not like", value, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoIn(List<String> values) {
            addCriterion("answer_no in", values, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoNotIn(List<String> values) {
            addCriterion("answer_no not in", values, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoBetween(String value1, String value2) {
            addCriterion("answer_no between", value1, value2, "answerNo");
            return (Criteria) this;
        }

        public Criteria andAnswerNoNotBetween(String value1, String value2) {
            addCriterion("answer_no not between", value1, value2, "answerNo");
            return (Criteria) this;
        }

        public Criteria andIsRightIsNull() {
            addCriterion("is_right is null");
            return (Criteria) this;
        }

        public Criteria andIsRightIsNotNull() {
            addCriterion("is_right is not null");
            return (Criteria) this;
        }

        public Criteria andIsRightEqualTo(Integer value) {
            addCriterion("is_right =", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightNotEqualTo(Integer value) {
            addCriterion("is_right <>", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightGreaterThan(Integer value) {
            addCriterion("is_right >", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_right >=", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightLessThan(Integer value) {
            addCriterion("is_right <", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightLessThanOrEqualTo(Integer value) {
            addCriterion("is_right <=", value, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightIn(List<Integer> values) {
            addCriterion("is_right in", values, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightNotIn(List<Integer> values) {
            addCriterion("is_right not in", values, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightBetween(Integer value1, Integer value2) {
            addCriterion("is_right between", value1, value2, "isRight");
            return (Criteria) this;
        }

        public Criteria andIsRightNotBetween(Integer value1, Integer value2) {
            addCriterion("is_right not between", value1, value2, "isRight");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}