/*
 * This file is generated by jOOQ.
 */
package com.customer.profile.common.entities.tables;


import com.customer.profile.common.entities.CustomerPortal;
import com.customer.profile.common.entities.Keys;
import com.customer.profile.common.entities.tables.records.CustomerRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = -213180311;

    /**
     * The reference instance of <code>customer_portal.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>customer_portal.customer.id</code>.
     */
    public final TableField<CustomerRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>customer_portal.customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>customer_portal.customer.first_name</code>.
     */
    public final TableField<CustomerRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>customer_portal.customer.middle_name</code>.
     */
    public final TableField<CustomerRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>customer_portal.customer.last_name</code>.
     */
    public final TableField<CustomerRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>customer_portal.customer.address_1</code>.
     */
    public final TableField<CustomerRecord, String> ADDRESS_1 = createField(DSL.name("address_1"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>customer_portal.customer.address_2</code>.
     */
    public final TableField<CustomerRecord, String> ADDRESS_2 = createField(DSL.name("address_2"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>customer_portal.customer.dob</code>.
     */
    public final TableField<CustomerRecord, LocalDateTime> DOB = createField(DSL.name("dob"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>customer_portal.customer.gender</code>.
     */
    public final TableField<CustomerRecord, String> GENDER = createField(DSL.name("gender"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>customer_portal.customer.mobile</code>.
     */
    public final TableField<CustomerRecord, Integer> MOBILE = createField(DSL.name("mobile"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>customer_portal.customer.pan_number</code>.
     */
    public final TableField<CustomerRecord, String> PAN_NUMBER = createField(DSL.name("pan_number"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>customer_portal.customer.address_proof</code>.
     */
    public final TableField<CustomerRecord, JSON> ADDRESS_PROOF = createField(DSL.name("address_proof"), org.jooq.impl.SQLDataType.JSON.nullable(false), this, "");

    /**
     * Create a <code>customer_portal.customer</code> table reference
     */
    public Customer() {
        this(DSL.name("customer"), null);
    }

    /**
     * Create an aliased <code>customer_portal.customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>customer_portal.customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Customer(Table<O> child, ForeignKey<O, CustomerRecord> key) {
        super(child, key, CUSTOMER);
    }

    @Override
    public Schema getSchema() {
        return CustomerPortal.CUSTOMER_PORTAL;
    }

    @Override
    public Identity<CustomerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CUSTOMER;
    }

    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_PRIMARY;
    }

    @Override
    public List<UniqueKey<CustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.KEY_CUSTOMER_PRIMARY);
    }

    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, String, String, LocalDateTime, String, Integer, String, JSON> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}