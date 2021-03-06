package io.mateu.ui.mdd.server.interfaces;

import io.mateu.ui.core.shared.Data;
import io.mateu.ui.core.shared.UserData;

import javax.persistence.EntityManager;

public interface View<T> {

    default String getFields() {
        return null;
    }

    default boolean isFieldsListedOnly() { return true; }

    default String getParams() {
        return null;
    }

    default String getCols() {
        return null;
    }

    default String getOrderCriteria() {
        return null;
    }

    default String getAdditionalFilters(EntityManager em, UserData user, Data parameters) {
        return null;
    }


    default String buildQuery(EntityManager em, UserData user, Data parameters) {
        return null;
    }

    default T newInstance(EntityManager em, UserData user) {
        return null;
    }

    default String getQLFilter(EntityManager em, UserData user, String field) {
        return null;
    }


}
