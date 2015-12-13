package com.omeletlab.sa.sqliteactiveandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by akashs on 12/12/15.
 */
@Table(name="RestaurantTable")
public class Restaurant extends Model {

    @Column(name="restaurantName")
    public String name;

    @Column(name="area")
    public String area;

    @Column(name = "capacity")
    public int capacity;

    public Restaurant() {
    }

    public Restaurant(String name, String area, int capacity) {
        this.name = name;
        this.area = area;
        this.capacity = capacity;
    }
}
