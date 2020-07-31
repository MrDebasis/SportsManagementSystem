package com.authorization.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.io.ByteArrayOutputStream;
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font; 
import org.apache.poi.ss.usermodel.IndexedColors; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.authorization.models.Players;

public class ExcelGeneratorRecoedsOfMatches {
	
		public static ByteArrayInputStream resourcessToExcel(List<Players> players) throws IOException {
		
			String[] COLUMNs = {"players_id", "players_name", "age","gender","hight", "weight", 
					"enabled", "round1","semiFinal","finall"}; 

			try( Workbook workbook = new XSSFWorkbook();
					ByteArrayOutputStream out = new ByteArrayOutputStream();){
				CreationHelper createHelper = workbook.getCreationHelper();

				Sheet sheet = workbook.createSheet("Resources");

				Font headerFont = workbook.createFont(); 
				headerFont.setBold(true);
				headerFont.setColor(IndexedColors.BLUE.getIndex());

				CellStyle headerCellStyle = workbook.createCellStyle();
				headerCellStyle.setFont(headerFont);

				Row headerRow = sheet.createRow(0);

				for (int col = 0; col < COLUMNs.length; col++) { Cell cell =
						headerRow.createCell(col); cell.setCellValue(COLUMNs[col]);
						cell.setCellStyle(headerCellStyle);
				}

				CellStyle ageCellStyle = workbook.createCellStyle();
				ageCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("#"));

				int rowIdx = 1; for (Players res : players)
				{ Row row =sheet.createRow(rowIdx++);
				

				row.createCell(0).setCellValue(res.getPlayersId());
				row.createCell(1).setCellValue(res.getPlayersName());
				row.createCell(2).setCellValue(res.getAge());
				row.createCell(3).setCellValue(res.getGender());
				row.createCell(4).setCellValue(res.getHight());
				row.createCell(5).setCellValue(res.getWeight());
				row.createCell(6).setCellValue(res.isEnabled());
				row.createCell(7).setCellValue(res.getRound1());
				row.createCell(8).setCellValue(res.getSemifinal());
				row.createCell(9).setCellValue(res.getFinall());
			
				Cell ageCell = row.createCell(10); 
				ageCell.setCellStyle(ageCellStyle);
				}

				workbook.write(out); 
				return new ByteArrayInputStream(out.toByteArray()); } 
		}
	}


