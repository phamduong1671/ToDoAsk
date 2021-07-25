package com.bawp.todoister.util;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.bawp.todoister.model.Priority;

import java.util.Date;



public class Converter {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);

    }

    @TypeConverter
    public static  Long  datetoTimestamp(Date date) {
            return date == null ? null : date.getTime();

    }


    @TypeConverter
    public static  String   fromPiority(Priority priority) {
        return priority == null ? null : priority.name();

    }

    @TypeConverter
    public static  Priority toPriority (String priority) {
        return priority == null ? null : Priority.valueOf(priority);

    }
}
