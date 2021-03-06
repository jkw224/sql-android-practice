package com.izeni.pizzaMe.database.tables

import android.content.ContentValues
import android.provider.BaseColumns

/**
 * Created by jonny on 10/17/16.
 */
class Toppings( val name: String, val type: Int): BaseColumns {

    companion object {

        val TABLE_NAME = "toppings"

        val NAME = "name"
        val PRICE = "price"
        val TYPE = "type"

        val SQL_CREATE_TOPPINGS_TABLE = "CREATE TABLE ${TABLE_NAME} (" +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NAME + " TEXT NOT NULL, " +
                PRICE + " INTEGER, " +
                TYPE + " INTEGER NOT NULL, " +
                Pizza.PIZZA_ID + " INTEGER, " +
                "FOREIGN KEY (${Pizza.PIZZA_ID}) REFERENCES ${Pizza.TABLE_NAME}(${BaseColumns._ID}));"


        val SQL_DELETE_TOPPINGS_TABLE = "DROP TABLE IF EXISTS ${TABLE_NAME};"

        val SAUCE = 0
        val MEAT = 1
        val SECONDARY = 2
        val CUSTOM_PIZZA = 3

    }

    fun contentValues(numToppings: Int, regSauce: Boolean, pricePerTopping: Int ): ContentValues {
        val contentValues = ContentValues()

        contentValues.put(NAME, name)
        contentValues.put(PRICE, pricePerTopping)
        contentValues.put(TYPE, type)

        return contentValues
    }

    override fun equals(other: Any?): Boolean {
        if(other is Toppings) {
            return other.name == name && other.type == type
        }
        return super.equals(other)
    }
}