package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {
        try {
            JSONObject sandwichJSONData = new JSONObject(json);

            JSONObject sandwichNameJSONData = sandwichJSONData.getJSONObject("name");
            String mainName = sandwichNameJSONData.getString("mainName");
            JSONArray alsoKnownAsJSONArray = sandwichNameJSONData.getJSONArray("alsoKnownAs");
            ArrayList<String> alsoKnownAs = new ArrayList<String>();
            for (int i=0; i < alsoKnownAsJSONArray.length(); i++) {
                alsoKnownAs.add(alsoKnownAsJSONArray.getString(i));
            }

            String placeOfOrigin = sandwichJSONData.getString("placeOfOrigin");
            String description = sandwichJSONData.getString("description");
            String image = sandwichJSONData.getString("image");

            JSONArray ingridientsJSONArray = sandwichJSONData.getJSONArray("ingredients");
            ArrayList<String> ingridients = new ArrayList<String>();
            for (int i=0; i < ingridientsJSONArray.length(); i++) {
                ingridients.add(ingridientsJSONArray.getString(i));
            }

            return new Sandwich(mainName,
                    alsoKnownAs,
                    placeOfOrigin,
                    description,
                    image,
                    ingridients);

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
