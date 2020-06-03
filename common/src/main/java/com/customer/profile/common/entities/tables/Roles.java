/*
 * This file is generated by jOOQ.
 */
package com.customer.profile.common.entities.tables;


import com.customer.profile.common.entities.CustomerPortal;
import com.customer.profile.common.entities.Keys;
import com.customer.profile.common.entities.tables.records.RolesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Roles extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = 60953809;

    /**
     * The reference instance of <code>customer_portal.roles</code>
     */
    public static final Roles ROLES = new Roles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>customer_portal.roles.id</code>.
     */
    public final TableField<RolesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>customer_portal.roles.name</code>.
     */
    public final TableField<RolesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * Create a <code>customer_portal.roles</code> table reference
     */
    public Roles() {
        this(DSL.name("roles"), null);
    }

    /**
     * Create an aliased <code>customer_portal.roles</code> table reference
     */
    public Roles(String alias) {
        this(DSL.name(alias), ROLES);
    }

    /**
     * Create an aliased <code>customer_portal.roles</code> table reference
     */
    public Roles(Name alias) {
        this(alias, ROLES);
    }

    private Roles(Name alias, Table<RolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Roles(Name alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Roles(Table<O> child, ForeignKey<O, RolesRecord> key) {
        super(child, key, ROLES);
    }

    @Override
    public Schema getSchema() {
        return CustomerPortal.CUSTOMER_PORTAL;
    }

    @Override
    public Identity<RolesRecord, Long> getIdentity() {
        return Keys.IDENTITY_ROLES;
    }

    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.KEY_ROLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<RolesRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesRecord>>asList(Keys.KEY_ROLES_PRIMARY, Keys.KEY_ROLES_UK_NB4H0P6TXRMFC0XBRD1KGLP9T);
    }

    @Override
    public Roles as(String alias) {
        return new Roles(DSL.name(alias), this);
    }

    @Override
    public Roles as(Name alias) {
        return new Roles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(String name) {
        return new Roles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(Name name) {
        return new Roles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
