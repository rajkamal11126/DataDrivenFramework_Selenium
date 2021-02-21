package com.bridgelabz.util;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utility {
    public static String readDataToExcel(String EXCEL_PATH, String sheet, int row, int column) {
        String value = "";
        try {
            Workbook workbook = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
            value = workbook.getSheet(sheet).getRow(row).getCell(column).toString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void writeDataToExcel() throws IOException {
        String path = "C:\\Users\\Rajkamal\\IdeaProjects\\DataDrivenFramework\\src\\test\\resources\\Data.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        Cell cell = row.createCell(2);
        cell.setCellValue("Pass");
        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        fos.close();
    }
}
