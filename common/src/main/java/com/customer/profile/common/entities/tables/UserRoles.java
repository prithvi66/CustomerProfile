/*
 * This file is generated by jOOQ.
 */
package com.customer.profile.common.entities.tables;


import com.customer.profile.common.entities.CustomerPortal;
import com.customer.profile.common.entities.Keys;
import com.customer.profile.common.entities.tables.records.UserRolesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRoles extends TableImpl<UserRolesRecord> {

    private static final long serialVersionUID = -918690762;

    /**
     * The reference instance of <code>customer_portal.user_roles</code>
     */
    public static final UserRoles USER_ROLES = new UserRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRolesRecord> getRecordType() {
        return UserRolesRecord.class;
    }

    /**
     * The column <code>customer_portal.user_roles.user_id</code>.
     */
    public final TableField<UserRolesRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>customer_portal.user_roles.role_id</code>.
     */
    public final TableField<UserRolesRecord, Long> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>customer_portal.user_roles</code> table reference
     */
    public UserRoles() {
        this(DSL.name("user_roles"), null);
    }

    /**
     * Create an aliased <code>customer_portal.user_roles</code> table reference
     */
    public UserRoles(String alias) {
        this(DSL.name(alias), USER_ROLES);
    }

    /**
     * Create an aliased <code>customer_portal.user_roles</code> table reference
     */
    public UserRoles(Name alias) {
        this(alias, USER_ROLES);
    }

    private UserRoles(Name alias, Table<UserRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoles(Name alias, Table<UserRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> UserRoles(Table<O> child, ForeignKey<O, UserRolesRecord> key) {
        super(child, key, USER_ROLES);
    }

    @Override
    public Schema getSchema() {
        return CustomerPortal.CUSTOMER_PORTAL;
    }

    @Override
    public UniqueKey<UserRolesRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRolesRecord>>asList(Keys.KEY_USER_ROLES_PRIMARY);
    }

    @Override
    public List<ForeignKey<UserRolesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserRolesRecord, ?>>asList(Keys.FKHFH9DX7W3UBF1CO1VDEV94G3F, Keys.FKH8CIRAMU9CC9Q3QCQIV4UE8A6);
    }

    public Users users() {
        return new Users(this, Keys.FKHFH9DX7W3UBF1CO1VDEV94G3F);
    }

    public Roles roles() {
        return new Roles(this, Keys.FKH8CIRAMU9CC9Q3QCQIV4UE8A6);
    }

    @Override
    public UserRoles as(String alias) {
        return new UserRoles(DSL.name(alias), this);
    }

    @Override
    public UserRoles as(Name alias) {
        return new UserRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoles rename(String name) {
        return new UserRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoles rename(Name name) {
        return new UserRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
