package com.example.seleniumexample;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * author         : SYS
 * date           : 2025-01-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-07        SYS       최초 생성
 */
public class ReadJson {
    public static void main(String[] args) throws FileNotFoundException {
        // JSON 파일 경로
        String filePath = "C:\\Users\\wnsgh\\Downloads\\sample.json";

        // JSON 파일 읽기
        String jsonData = readJsonFileAndConvertToJson(filePath);

        System.out.println(jsonData);
    }

    private static String readJsonFileAndConvertToJson(String filePath) throws FileNotFoundException {
        StringBuilder jsonContent = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }

            // JSON 데이터 파싱
            JSONArray jsonArray = new JSONArray(jsonContent.toString());

            // 결과를 저장할 새로운 JSON 배열
            JSONArray resultArray = new JSONArray();

            // 특정 키의 값 추출 후 JSON 객체로 변환
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                // 새로운 JSON 객체 생성
                JSONObject resultObject = new JSONObject();
                resultObject.put("ITEM_CLSF_NM", jsonObject.getString("ITEM_CLSF_NM"));
                resultObject.put("DLNG_PRC_AMT", jsonObject.getDouble("DLNG_PRC_AMT"));
                resultObject.put("NTSL_BZENTY_ADDR", jsonObject.getString("NTSL_BZENTY_ADDR"));
                resultObject.put("NTSL_BZENTY_NM", jsonObject.getString("NTSL_BZENTY_NM"));
                resultObject.put("PRDT_NM", jsonObject.getString("PRDT_NM"));
                resultObject.put("LNK_URL", jsonObject.getString("LNK_URL"));

                // 결과 배열에 추가
                resultArray.put(resultObject);
            }

            // 결과 배열을 JSON 문자열로 반환
            return resultArray.toString(4); // 4는 들여쓰기 설정
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }

}
