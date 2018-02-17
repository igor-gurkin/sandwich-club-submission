package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONObject;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {
        try {
            JSONObject sandwichJSONData = new JSONObject(json);
            JSONObject sandwichNameJSONData = sandwichJSONData.getJSONObject("name");
            String name = sandwichNameJSONData.getString("mainName");

        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
