package com.pangu.po;

import java.util.ArrayList;
import java.util.List;

public class TProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProblemExample() {
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

        public Criteria andProblemContentIsNull() {
            addCriterion("problem_content is null");
            return (Criteria) this;
        }

        public Criteria andProblemContentIsNotNull() {
            addCriterion("problem_content is not null");
            return (Criteria) this;
        }

        public Criteria andProblemContentEqualTo(String value) {
            addCriterion("problem_content =", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotEqualTo(String value) {
            addCriterion("problem_content <>", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentGreaterThan(String value) {
            addCriterion("problem_content >", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentGreaterThanOrEqualTo(String value) {
            addCriterion("problem_content >=", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentLessThan(String value) {
            addCriterion("problem_content <", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentLessThanOrEqualTo(String value) {
            addCriterion("problem_content <=", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentLike(String value) {
            addCriterion("problem_content like", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotLike(String value) {
            addCriterion("problem_content not like", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentIn(List<String> values) {
            addCriterion("problem_content in", values, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotIn(List<String> values) {
            addCriterion("problem_content not in", values, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentBetween(String value1, String value2) {
            addCriterion("problem_content between", value1, value2, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotBetween(String value1, String value2) {
            addCriterion("problem_content not between", value1, value2, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIsNull() {
            addCriterion("problem_type is null");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIsNotNull() {
            addCriterion("problem_type is not null");
            return (Criteria) this;
        }

        public Criteria andProblemTypeEqualTo(Byte value) {
            addCriterion("problem_type =", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotEqualTo(Byte value) {
            addCriterion("problem_type <>", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeGreaterThan(Byte value) {
            addCriterion("problem_type >", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("problem_type >=", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLessThan(Byte value) {
            addCriterion("problem_type <", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLessThanOrEqualTo(Byte value) {
            addCriterion("problem_type <=", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIn(List<Byte> values) {
            addCriterion("problem_type in", values, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotIn(List<Byte> values) {
            addCriterion("problem_type not in", values, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeBetween(Byte value1, Byte value2) {
            addCriterion("problem_type between", value1, value2, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("problem_type not between", value1, value2, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemNoIsNull() {
            addCriterion("problem_no is null");
            return (Criteria) this;
        }

        public Criteria andProblemNoIsNotNull() {
            addCriterion("problem_no is not null");
            return (Criteria) this;
        }

        public Criteria andProblemNoEqualTo(String value) {
            addCriterion("problem_no =", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoNotEqualTo(String value) {
            addCriterion("problem_no <>", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoGreaterThan(String value) {
            addCriterion("problem_no >", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoGreaterThanOrEqualTo(String value) {
            addCriterion("problem_no >=", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoLessThan(String value) {
            addCriterion("problem_no <", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoLessThanOrEqualTo(String value) {
            addCriterion("problem_no <=", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoLike(String value) {
            addCriterion("problem_no like", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoNotLike(String value) {
            addCriterion("problem_no not like", value, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoIn(List<String> values) {
            addCriterion("problem_no in", values, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoNotIn(List<String> values) {
            addCriterion("problem_no not in", values, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoBetween(String value1, String value2) {
            addCriterion("problem_no between", value1, value2, "problemNo");
            return (Criteria) this;
        }

        public Criteria andProblemNoNotBetween(String value1, String value2) {
            addCriterion("problem_no not between", value1, value2, "problemNo");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNull() {
            addCriterion("page_id is null");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNotNull() {
            addCriterion("page_id is not null");
            return (Criteria) this;
        }

        public Criteria andPageIdEqualTo(Long value) {
            addCriterion("page_id =", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotEqualTo(Long value) {
            addCriterion("page_id <>", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThan(Long value) {
            addCriterion("page_id >", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("page_id >=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThan(Long value) {
            addCriterion("page_id <", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThanOrEqualTo(Long value) {
            addCriterion("page_id <=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdIn(List<Long> values) {
            addCriterion("page_id in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotIn(List<Long> values) {
            addCriterion("page_id not in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdBetween(Long value1, Long value2) {
            addCriterion("page_id between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotBetween(Long value1, Long value2) {
            addCriterion("page_id not between", value1, value2, "pageId");
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